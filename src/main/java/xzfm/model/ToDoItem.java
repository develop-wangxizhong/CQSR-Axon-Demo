package xzfm.model;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateRoot;
import org.axonframework.eventhandling.EventHandler;
import xzfm.command.CreateToDoItemCommand;
import xzfm.command.MarkCompletedCommand;
import xzfm.event.ToDoItemCompletedEvent;
import xzfm.event.ToDoItemCreatedEvent;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

/**
 * Created by wangxizhong on 17/5/28.
 */
@AggregateRoot
public class ToDoItem {

    @AggregateIdentifier
    private String id;

    public ToDoItem() {

    }

    @CommandHandler
    public ToDoItem(CreateToDoItemCommand command) {
        apply(new ToDoItemCreatedEvent(command.getTodoId(), command.getDescription()));
    }

    @CommandHandler
    public void markCompleted(MarkCompletedCommand command) {
        apply(new ToDoItemCompletedEvent(id));
    }

    @EventHandler
    public void on(ToDoItemCreatedEvent event) {
        this.id = id;
    }
}

package xzfm.aggregate;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.spring.stereotype.Aggregate;
import xzfm.command.CreateRebotCommand;
import xzfm.event.CreateRebotEvent;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

/**
 * Created by wangxizhong on 17/5/29.
 */
@Aggregate
public class RebotAggregate {

    @AggregateIdentifier
    private String id;

    private String name;

    private String address;

    @CommandHandler
    public RebotAggregate(CreateRebotCommand command) {
        apply(new CreateRebotEvent(command.getId(), command.getName(), command.getAddress()));
    }

    @EventHandler
    public void handle(CreateRebotEvent event) {
        this.id = event.getId();
        this.name = event.getName();
        this.address = event.getAddress();
    }

}

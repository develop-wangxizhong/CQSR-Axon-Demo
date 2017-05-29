package xzfm.command;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * Created by wangxizhong on 17/5/28.
 */
public class CreateToDoItemCommand {

    @TargetAggregateIdentifier
    private final String todoId;

    private final String description;

    public CreateToDoItemCommand(String todoId,String description){
        this.todoId=todoId;
        this.description=description;
    }

    public String getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }
}

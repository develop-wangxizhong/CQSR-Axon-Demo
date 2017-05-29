package xzfm.command;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * Created by wangxizhong on 17/5/28.
 */
public class MarkCompletedCommand {

    @TargetAggregateIdentifier
    private final String todoId;

    public MarkCompletedCommand(String todoId){
        this.todoId=todoId;
    }

    public String getTodoId() {
        return todoId;
    }
}

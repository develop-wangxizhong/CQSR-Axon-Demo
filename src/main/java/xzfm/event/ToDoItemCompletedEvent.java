package xzfm.event;

/**
 * Created by wangxizhong on 17/5/28.
 */
public class ToDoItemCompletedEvent {

    private final String todoId;

    public ToDoItemCompletedEvent(String todoId){
        this.todoId=todoId;
    }

    public String getTodoId() {
        return todoId;
    }
}

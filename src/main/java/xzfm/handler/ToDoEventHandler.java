package xzfm.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.axonframework.eventhandling.EventHandler;
import xzfm.event.ToDoItemCompletedEvent;
import xzfm.event.ToDoItemCreatedEvent;

/**
 * Created by wangxizhong on 17/5/28.
 */
public class ToDoEventHandler {

    private Log logger = LogFactory.getLog(getClass());

    @EventHandler
    public void handle(ToDoItemCreatedEvent event) {
        logger.debug("触发创建事件!" + event.getDescription());
    }

    @EventHandler
    public void handler(ToDoItemCompletedEvent event) {
        logger.debug("触发完成事件!" + event.getTodoId());
    }
}

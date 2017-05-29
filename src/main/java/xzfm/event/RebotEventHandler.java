package xzfm.event;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xzfm.domain.Rebot;
import xzfm.domain.RebotDao;

/**
 * Created by wangxizhong on 17/5/29.
 */
@Component
public class RebotEventHandler {

    @Autowired
    private RebotDao rebotDao;

    @EventHandler
    public void handler(CreateRebotEvent event) {
        Rebot rebot = new Rebot(event.getId(), event.getName(), event.getAddress());
        rebotDao.save(rebot);
    }
}

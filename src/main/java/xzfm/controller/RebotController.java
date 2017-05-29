package xzfm.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xzfm.command.CreateRebotCommand;
import xzfm.domain.Rebot;
import xzfm.domain.RebotDao;

import java.util.List;

/**
 * Created by wangxizhong on 17/5/29.
 */
@RestController
public class RebotController {

    @Autowired
    private CommandGateway commandGateway;

    @Autowired
    private RebotDao rebotDao;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public boolean create(
            @RequestParam String id,
            @RequestParam String name,
            @RequestParam String address
    ) {
        return !commandGateway.send(new CreateRebotCommand(id, name, address)).isCompletedExceptionally();
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Rebot> getAll() {

        return (List<Rebot>) rebotDao.findAll();
    }
}

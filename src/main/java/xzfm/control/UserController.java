package xzfm.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangxizhong on 17/5/28.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "address") String address
    ) {

        return "";
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public String getAll(){
        return "";
    }
}

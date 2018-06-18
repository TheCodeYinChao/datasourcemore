package cn.more.datasource.controller.user;

import cn.more.datasource.service.ITicketService;
import cn.more.datasource.vo.User;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.Scope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Admin on 2018/6/18.
 */
@RestController
@Slf4j
@RequestMapping("user")
@Api(tags={"user相关"})
public class UserController {
    @Autowired
    private ITicketService iticketService;

    @Autowired
    private ITicketService iTicketService;

    @GetMapping("/insert")
    public void insert(){
        User user = new User();
        user.setAge("23");
        user.setName("小儿");
        user.setSex("2");
        iTicketService.inserUser(user);
    }

    @GetMapping("/update")
    public  void update(){
        int id  = 0;
        String name = "张三";
        iTicketService.updateUser(name,id);
    }

    @GetMapping("/quaryList")
    public void quartyList(){
        List<User> users = iTicketService.queryList();
        log.info(JSON.toJSONString(users));
    }
    @GetMapping("/quaryById")
    public void quartyById(){
        int id = 0;
        User user = iTicketService.queryCount(id);
        log.info(JSON.toJSONString(user));
    }

}

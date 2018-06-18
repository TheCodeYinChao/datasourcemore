package cn.more.datasource;


import cn.more.datasource.service.ITicketService;
import cn.more.datasource.vo.User;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
@Slf4j
public class AppTest 
{
    @Autowired
    private ITicketService iTicketService;

    @Test
    public void insert(){
        User user = new User();
        iTicketService.inserUser(user);
    }

    @Test
    public  void update(){
        int id  = 0;
        String name = "张三";
        iTicketService.updateUser(name,id);
    }

    @Test
    public void quartyList(){
        List<User> users = iTicketService.queryList();
        log.info(JSON.toJSONString(users));
    }
    @Test
    public void quartyById(){
        int id = 0;
        User user = iTicketService.queryCount(id);
        log.info(JSON.toJSONString(user));
    }
}

package cn.more.datasource.service;

import cn.more.datasource.anno.TargetDataSource;
import cn.more.datasource.common.AppConst;
import cn.more.datasource.vo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 2018/6/18.
 */
public interface ITicketService {

    public User queryCount(int id);

    public List<User> queryList();

    public void updateUser(String name ,int id);

    public String inserUser(User user);
}

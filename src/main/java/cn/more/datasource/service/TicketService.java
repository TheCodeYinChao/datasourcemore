package cn.more.datasource.service;


import cn.more.datasource.anno.TargetDataSource;
import cn.more.datasource.common.AppConst;
import cn.more.datasource.dao.QuartzMapper;
import cn.more.datasource.vo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ticket 服务类
 *
 * @author: lvhao
 * @since: 2016-4-12 12:12
 */
@Service
@Transactional
@TargetDataSource(AppConst.DbKey.READ)
public class TicketService implements DefaultDataSourceService,ITicketService {

    @Autowired
    private QuartzMapper quartzMapper;

    @Transactional(readOnly = true)
    @TargetDataSource(AppConst.DbKey.READ)
    public User queryCount(int id){
        return quartzMapper.queryCount(id);
    }

    @TargetDataSource(AppConst.DbKey.READ)
    public List<User> queryList(){
       List<User> users = quartzMapper.selectList();
       return users;
    }

    @TargetDataSource(AppConst.DbKey.WRITE)
    public void updateUser(String name ,int id){
        int rs = quartzMapper.updateUserName(name,id);
    }

    @TargetDataSource(AppConst.DbKey.WRITE)
    public String inserUser(User user){
        int rs = quartzMapper.insertUser(user);
        return rs+"";
    }
}

package cn.more.datasource.dao;

import cn.more.datasource.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Admin on 2018/6/18.
 */
@Repository
@Mapper
public interface QuartzMapper {
    User queryCount(@Param("id") int id);

    List<User> selectList();

    int updateUserName(@Param("name")String name,@Param("id")int id);

    int insertUser(User user);
}

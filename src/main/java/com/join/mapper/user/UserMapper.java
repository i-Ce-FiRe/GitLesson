package com.join.mapper.user;

import com.join.entity.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 10:51 2019/7/20
 */
public interface UserMapper {

    /**
     * 根据用户名密码搜索 执行登陆操作
     * @param username
     * @param password
     * @return
     */
    User queryByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名搜索 判断用户是否存在
     * @param username
     * @return
     */
    List<User> queryByUsername(@Param("username") String username);

    /**
     * 注册用户信息
     * @param username
     * @param age
     * @param password
     * @return
     */
    int addUser(@Param("username")String username,@Param("age")int age,@Param("password")String password);



}

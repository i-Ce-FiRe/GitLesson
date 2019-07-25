package com.join.service.user;

import com.join.entity.user.User;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 10:55 2019/7/20
 */
public interface UserService {

    /**
     * 登录操作
     * @param username
     * @param password
     * @return
     */
    User login(String username,String password);

    /**
     * 判断用户是否存在
     * @param username
     * @return
     */
    List<User> queryByUsername(String username);

    /**
     * 注册操作，判断两次密码输入是否一致
     * @param name
     * @param age
     * @param password
     * @param password2
     * @return
     */
    int addUser( String name, int age, String password, String password2);
}

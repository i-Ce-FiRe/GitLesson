package com.join.service.user.Impl;

import com.join.entity.user.User;
import com.join.mapper.user.UserMapper;
import com.join.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 10:56 2019/7/20
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 登录操作
     * @param username
     * @param password
     * @return
     */
    public User login(String username,String password){
        System.out.println(username+password);
        User user=userMapper.queryByUsernameAndPassword(username,password);
        System.out.println(user);
        return user;
    }

    /**
     * 判断用户是否存在
     * @param username
     * @return
     */
    public List<User> queryByUsername(String username){
        System.out.println("搜索用户"+username);
        List<User> users=userMapper.queryByUsername(username);
        return users;
    }

    /**
     * 注册操作，判断两次密码输入是否一致
     * @param name
     * @param age
     * @param password
     * @param password2
     * @return
     */
    public int addUser(String name,int age,String password ,String password2){
        if(password.equals(password2)){
            int id=userMapper.addUser(name,age,password);
            return id;
        }
        else return 0;
    }


}

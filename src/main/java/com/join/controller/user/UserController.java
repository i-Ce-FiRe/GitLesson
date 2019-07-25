package com.join.controller.user;

import com.join.entity.user.User;
import com.join.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 10:55 2019/7/20
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 登录操作
     * 如果登录失败，判断是 密码错误 还是 用户不存在的错误
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String login(User user, Model model){
        System.out.println("login1"+user);
        User u=userService.login(user.getUsername(),user.getPassword());
        if (u != null){
            model.addAttribute("user",u);
            return "WEB-INF/views/loginSuccess";
        }
        else {
            List<User> users=userService.queryByUsername(user.getUsername());
            if (users!=null){
                model.addAttribute("error","密码错误");
            }
            else {
                model.addAttribute("error","该用户不存在");
            }
            return "WEB-INF/views/loginFail";
        }
    }

    /**
     * 注册操作，判断两次密码输入是否一致
     * @param user
     * @param password2
     * @param model
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(User user,String password2 ,Model model){
        int id=userService.addUser(user.getUsername(),user.getAge(),user.getPassword(),password2);
        if(id>0){
            model.addAttribute("user",user);
            return "WEB-INF/views/addSuccess";
        }
        else model.addAttribute("error","两次密码输入不一致");
        return "WEB-INF/views/addFail";
    }

    /**
     * 跳转到注册页面
     * @return
     */
    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "WEB-INF/views/addUser";
    }

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "index";
    }


}

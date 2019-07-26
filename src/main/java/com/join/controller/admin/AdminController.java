package com.join.controller.admin;

import com.join.entity.admin.Admin;
import com.join.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 16:16 2019/7/26
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    /**
     * 登录操作
     * 如果登录失败，判断是 密码错误 还是 用户不存在的错误
     * @param admin
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String login(Admin admin, Model model){
        Admin admin1=adminService.login(admin.getAdminname(),admin.getPassword());
        if (admin1 != null){
            model.addAttribute("admin",admin1);
            return "WEB-INF/views/adminLoginSuccess";
        }
        else {
            List<Admin> admins=adminService.queryByAdminname(admin.getAdminname());
            if (admins.size()!=0){
                model.addAttribute("error","密码错误");
            }
            else{
                model.addAttribute("error","该用户不存在");
            }
            return "WEB-INF/views/adminLogin";
        }
    }

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "WEB-INF/views/adminLogin";
    }


}

package com.join.service.admin.Impl;

import com.join.entity.admin.Admin;
import com.join.mapper.admin.AdminMapper;
import com.join.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 16:10 2019/7/26
 */
@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    /**
     * 登录操作
     * @param adminname
     * @param password
     * @return
     */
    public Admin login(String adminname, String password){
        System.out.println(adminname+password);
        Admin admin=adminMapper.queryByAdminnameAndPassword(adminname,password);
        System.out.println(admin);
        return admin;
    }

    /**
     * 判断用户是否存在
     * @param adminname
     * @return
     */
    public List<Admin> queryByAdminname(String adminname){
        System.out.println("搜索用户"+adminname);
        List<Admin> admins=adminMapper.queryByAdminname(adminname);
        return admins;
    }


}

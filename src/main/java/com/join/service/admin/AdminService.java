package com.join.service.admin;

import com.join.entity.admin.Admin;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 16:09 2019/7/26
 */
public interface AdminService {
    /**
     * 登录操作
     * @param adminname
     * @param password
     * @return
     */
    Admin login(String adminname, String password);

    /**
     * 判断用户是否存在
     * @param adminname
     * @return
     */
    List<Admin> queryByAdminname(String adminname);

}

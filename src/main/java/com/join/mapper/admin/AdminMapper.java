package com.join.mapper.admin;

import com.join.entity.admin.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 16:05 2019/7/26
 */
public interface AdminMapper {

    /**
     * 根据用户名密码搜索 执行登陆操作
     * @param adminname
     * @param password
     * @return
     */
    Admin queryByAdminnameAndPassword(@Param("adminname") String adminname, @Param("password") String password);
    /**
     * 根据用户名搜索 判断用户是否存在
     * @param username
     * @return
     */
    List<Admin> queryByAdminname(@Param("adminname") String username);


}

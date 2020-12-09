package com.blog.blog.sys.dao;


import com.blog.blog.sys.entity.BackUser;

public interface BackUserDao {

    //登陆
    BackUser login(BackUser backUser);

    //添加
    Integer addUser(BackUser backUser);

    //删除
    void delUser(Integer[] id);

    //修改
    Integer updateUser(BackUser backUser);

}

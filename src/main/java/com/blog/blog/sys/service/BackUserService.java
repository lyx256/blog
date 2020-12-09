package com.blog.blog.sys.service;

import com.blog.blog.sys.entity.BackUser;
import org.springframework.stereotype.Component;

@Component
public interface BackUserService {
    BackUser login(BackUser backUser);

    //添加
    Integer addUser(BackUser backUser);

    //删除
    void delUser(Integer[] id);

    //修改
    Integer updateUser(BackUser backUser);
}

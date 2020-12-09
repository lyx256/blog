package com.blog.blog.sys.service.impl;


import com.blog.blog.sys.dao.BackUserDao;
import com.blog.blog.sys.entity.BackUser;
import com.blog.blog.sys.service.BackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BackUserService")
public class BackUserServiceImpl implements BackUserService {

    @Autowired
    BackUserDao backUserDao;

    @Override
    public BackUser login(BackUser backUser) {
        return backUserDao.login(backUser);
    }

    @Override
    public Integer addUser(BackUser backUser) {
        return backUserDao.addUser(backUser);
    }


    @Override
    public void delUser(Integer[] id) {
        backUserDao.delUser(id);
    }

    @Override
    public Integer updateUser(BackUser backUser) {
        return backUserDao.updateUser(backUser);
    }
}

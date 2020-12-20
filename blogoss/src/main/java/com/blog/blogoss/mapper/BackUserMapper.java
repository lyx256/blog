package com.blog.blogoss.mapper;


import com.blog.blogoss.Bean.BackUser;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BackUserMapper {

    BackUser login(BackUser backUser);

    BackUser findUserByName(String username);

    //添加
    Integer addUser(BackUser backUser);

    //删除
    void delUser(Integer[] id);

    //修改
    Integer updateUser(BackUser backUser);


}

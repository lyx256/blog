package com.blog.blogoss.mapper;


import com.blog.blogoss.Bean.BackUser;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BackUserMapper {

    BackUser login(BackUser backUser);

    BackUser findUserByName(String username);

}

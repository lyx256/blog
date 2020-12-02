package com.blog.blog.mapper;

import com.blog.blog.Bean.BackUser;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BackUserMapper {

    BackUser login(BackUser backUser);

}

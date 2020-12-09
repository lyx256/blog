package com.blog.blog.mapper;

import com.blog.blog.sys.entity.BackUser;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BackUserMapper {

    BackUser login(BackUser backUser);

}

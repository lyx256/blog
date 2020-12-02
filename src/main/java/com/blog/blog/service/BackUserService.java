package com.blog.blog.service;

import com.blog.blog.Bean.BackUser;
import com.blog.blog.Bean.Result;
import com.blog.blog.mapper.BackUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BackUserService {

    @Autowired
    private BackUserMapper backUserMapper;

    public Result login(BackUser backUser){
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            BackUser user = backUserMapper.login(backUser);
            if(user == null){
                result.setMsg("用户名或密码错误");
            }else {
                result.setMsg("登录成功");
                result.setSuccess(true);
                Map returnMap = new HashMap();
                returnMap.put("id",user.getId());
                returnMap.put("username",user.getUsername());
                returnMap.put("email",user.getEmail());
                result.setDetail(returnMap);
            }
        }catch (Exception e){
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }


}

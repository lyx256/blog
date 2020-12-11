package com.blog.blogoss.service;


import com.blog.blogoss.Bean.BackUser;
import com.blog.blogoss.Bean.Result;
import com.blog.blogoss.mapper.BackUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BackUserService {

    @Autowired
    private BackUserMapper backUserMapper;

    @Autowired
    private TokenService tokenService;

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
                String token = tokenService.getToken(backUser);

                Map returnMap = new HashMap();
                returnMap.put("id",user.getId());
                returnMap.put("username",user.getUsername());
                returnMap.put("token",token);
                result.setDetail(returnMap);
            }
        }catch (Exception e){
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }


}

package com.blog.blogoss.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.blog.blogoss.Bean.BackUser;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {
    public String getToken(BackUser backUser){
        String token="";
        token= JWT.create().withAudience(backUser.getUsername())  // 将 username 保存到 token 里面
//                .withExpiresAt(new Date(System.currentTimeMillis() + 2 * 60 * 1000))//定义token的有效期
                .sign(Algorithm.HMAC256(backUser.getPassword()));
        return token;
    }
}

package com.blog.blog.controller;

import com.blog.blog.Bean.BackUser;
import com.blog.blog.Bean.Result;
import com.blog.blog.service.BackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BackUser")
public class BackUserController {
    @Autowired
    private BackUserService backUserService;

    @PostMapping(value = "login")
    public Result login(@RequestBody BackUser backUser){
        return backUserService.login(backUser);
    }
//
//    @PostMapping(value = "add")
//    public Result adduser(@RequestBody BackUser backUser){
//        return backUserService.adduser(backUser);
//    }
//
//    @PostMapping(value = "edit")
//    public Result edisuser(@RequestBody BackUser backUser){
//        return backUserService.edisuser(backUser);
//    }
//
//    @PostMapping(value = "delete")
//    public Result deleteuser(@RequestBody BackUser backUser){
//        return backUserService.deleteuser(backUser);
//    }
}

package com.blog.blogoss.controller;


import com.blog.blogoss.Bean.BackUser;
import com.blog.blogoss.Bean.Result;
import com.blog.blogoss.service.BackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BackUser")
public class BackUserController {
    @Autowired
    private BackUserService backUserService;
    Result res=new Result();

    @PostMapping(value = "login")
    public Result login(@RequestBody BackUser backUser){
        return backUserService.login(backUser);
    }

    @PostMapping(value = "addUser")
    public Result addUser(BackUser backUser){

        try {
            Integer num=backUserService.addUser(backUser);
            if(num>0){
                res.setMsg("添加成功");
                res.setSuccess(true);
            }else{
                res.setMsg("失败，请联系管理员");
                res.setSuccess(false);
            }
        }catch (Exception e){
            res.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }

    @PostMapping(value = "delUser")
    public void delUser(Integer[] id){
        backUserService.delUser(id);
    }

    @PostMapping(value = "updateUser")
    public Result updateUser(BackUser backUser){
        try {
            int num= backUserService.updateUser(backUser);
            if(num>0){
                res.setMsg("修改成功!");
                res.setSuccess(true);
            }else{
                res.setMsg("修改失败，请联系管理员");
                res.setSuccess(false);
            }
        }catch (Exception e){
            res.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }
}

package com.example.war;


import com.example.war.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public User login(@RequestBody User user){
        System.out.println(user);
        User dbUser = userMapper.getUserByNameAndPassword(user.getName(), user.getPassword());
        System.out.println(dbUser.getName());
        System.out.println(dbUser.getPassword());
        if (dbUser.getName().equals("admin") && dbUser.getPassword().equals("admin")) {
            System.out.println("超级管理员登录成功");
        } else if ((dbUser.getName().equals("123") && dbUser.getPassword().equals("123")) ) {
            System.out.println("普通用户登录成功");
        } else if ((dbUser.getName().equals("yia") && dbUser.getPassword().equals("yia")) ) {
            System.out.println("vip用户登录成功");
        } 
        else{
            System.out.println("登录失败，请检查账号密码");
        }
        return dbUser;
    }
}

package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username){
        System.out.println("执行了...");
        System.out.println("username: "+username);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String testParam(Account account){
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }

    @RequestMapping("/saveUser")
    public String testUser(User2 user){
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }
}

package cn.itcast.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器类
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC");

        return "success";
    }
}


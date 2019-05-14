/**
 * Copyright (C), 2019, 金科教育
 * FileName: HelloController
 * Author:   zyl
 * Date:     2019/5/13 14:33
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.User;
import com.jk.service.HelloService;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/5/13
 * @since 1.0.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloService schedualServiceHi;

    @Autowired
    UserService userService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.hello( name );
    }
    @GetMapping(value = "/hello")
    public User sayHello(@RequestParam String name) {

        User user =new User();
        user.setUserId(1);
        user.setUserName("李四");
        System.out.println(1111);
         System.out.println(22222);
        System.out.println(44444);
        return schedualServiceHi.helloUser( user );
    }

    @GetMapping(value = "/helloLiu")
    public User sayHelloLiu(@RequestParam String name) {

        User user =new User();
        user.setUserId(1);
        user.setUserName("李四");

        return userService.helloUserLiu( user );
    }

}

/**
 * Copyright (C), 2019, 金科教育
 * FileName: UserController
 * Author:   zyl
 * Date:     2019/5/13 14:46
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/5/13
 * @since 1.0.0
 */
@RestController
public class UserController {




    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public User queryUser(@RequestBody  User user){
        System.out.println(user);
        User u=new User();
        u.setUserName("张三");
        u.setUserId(2);
        return u;
    }

    @RequestMapping(value = "/helloLiu",method = RequestMethod.POST)
    public User helloLiu(@RequestBody  User user){
        System.out.println(user);
        User u=new User();
        u.setUserName("张三");
        u.setUserId(2);
        return u;
    }


}

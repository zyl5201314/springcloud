/**
 * Copyright (C), 2019, 金科教育
 * FileName: HiError
 * Author:   zyl
 * Date:     2019/5/13 15:38
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.util;

import com.jk.model.User;
import com.jk.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/5/13
 * @since 1.0.0
 */
@Component
public class HiError implements HelloService{

    @Override
    public String hello(String name) {
        return "sorry I am dont like you";
    }

    @Override
    public User helloUser(User user) {
        User u=new User();
        u.setUserName("i am xinxu");
        u.setUserId(1);
        return u;
    }
}

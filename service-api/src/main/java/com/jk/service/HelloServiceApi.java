/**
 * Copyright (C), 2019, 金科教育
 * FileName: HelloServiceApi
 * Author:   zyl
 * Date:     2019/5/13 15:07
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/5/13
 * @since 1.0.0
 */
public interface HelloServiceApi {
//如果使用feign传递参数一定要加@RequestParam   基本的数据类型  string int
    //如果参数是一个对象请使用  @RequestBody

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    User helloUser(@RequestBody User user);
}

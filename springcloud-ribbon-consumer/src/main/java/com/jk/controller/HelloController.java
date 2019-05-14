/**
 * Copyright (C), 2019, 金科教育
 * FileName: HelloController
 * Author:   zyl
 * Date:     2019/5/13 14:11
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class HelloController {

    @Autowired
    private HelloService helloService;


    // restful编程风格
    @GetMapping(value = "/hi")  //这是get请求  查询  @RequestMapping(value = "",method = RequestMethod.GET)
   // @PostMapping  //这是post请求   新增   @RequestMapping(value = "",method = RequestMethod.POST)
    //@PutMapping   //这是put请求   修改    @RequestMapping(value = "",method = RequestMethod.PUT)
    //@DeleteMapping //这是delete请求  删除  @RequestMapping(value = "",method = RequestMethod.DELETE)
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }

}

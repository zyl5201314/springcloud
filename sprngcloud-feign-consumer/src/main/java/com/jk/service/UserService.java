/**
 * Copyright (C), 2019, 金科教育
 * FileName: UserService
 * Author:   zyl
 * Date:     2019/5/13 15:17
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/5/13
 * @since 1.0.0
 */
@FeignClient(value = "service-hi")
public interface UserService extends UserServiceApi {

}

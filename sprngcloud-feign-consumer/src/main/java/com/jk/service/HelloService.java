/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HelloService
 * Author:   zyl
 * Date:     2019/5/13 14:33
 * History:
 */
package com.jk.service;

import com.jk.util.HiError;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/5/13
 * @since 1.0.0
 */
@FeignClient(value = "service-hi",fallback =HiError.class)
public interface HelloService extends HelloServiceApi {


}

package com.haole.auth.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PrivateController
 *
 * @description:
 * @author: shengjunzhao
 * @date: 2022/12/23 0023 18:23
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
public class PrivateController {

    @GetMapping("/private")
    public String test() {
        return "return private";
    }

}

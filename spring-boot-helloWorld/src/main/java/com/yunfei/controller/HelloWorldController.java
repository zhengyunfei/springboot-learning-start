package com.yunfei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descripion HelloWorldController
 *
 */
@RestController
public class HelloWorldController {
    /**
     * @deprecated 页面初始化
     * @author 贤名
     * @qq 799078779
     * @return
     */
    @RequestMapping("/hello")
    public String index() {
		System.out.println("springboot hello word");
        return "hello";
    }
}

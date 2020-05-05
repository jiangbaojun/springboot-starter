package com.demo.controller;

import com.test.template.HWTemplate1;
import com.test.template.HWTemplate2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jiangbaojun
 * @Date: 2020/3/16 10:28
 */
@RestController
public class DemoController {

    @Autowired
    private HWTemplate1 template1;
    @Autowired
    private HWTemplate2 template2;

    @RequestMapping("/demo")
    public void t1(){
        template1.sayHello();
        System.out.println("--------------------------------");
        template2.sayHello();
    }
}

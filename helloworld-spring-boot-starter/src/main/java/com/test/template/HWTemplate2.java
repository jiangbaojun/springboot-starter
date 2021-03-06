package com.test.template;

import com.test.autoconfigure1.HelloWorldProperties1;
import com.test.autoconfigure2.HelloWorldProperties2;
import com.test.autoconfigure2.TestProperties;

import java.awt.*;
import java.util.Date;

/**
 * 模拟功能
 * @Author: jiangbaojun
 * @Date: 2020/3/16 09:35
 */
public class HWTemplate2 {
    private HelloWorldProperties2 properties;
    private TestProperties testProperties;

    public HWTemplate2() {
    }

    public HWTemplate2(HelloWorldProperties2 properties, TestProperties testProperties) {
        this.properties = properties;
        this.testProperties = testProperties;
    }

    /**
     * 功能逻辑
     */
    public void sayHello(){
        //设置字段测试，可以生效
        properties.setBirthday(new Date());
        System.out.println("我的信息："+properties);
        System.out.println("测试信息："+testProperties);
    }
}

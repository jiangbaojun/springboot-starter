package com.test.template;

import com.test.autoconfigure1.HelloWorldProperties1;

import java.util.Date;

/**
 * 模拟功能
 * @Author: jiangbaojun
 * @Date: 2020/3/16 09:35
 */
public class HWTemplate1 {
    private HelloWorldProperties1 properties;

    public HWTemplate1() {
    }

    public HWTemplate1(HelloWorldProperties1 properties) {
        this.properties = properties;
    }

    /**
     * 功能逻辑
     */
    public void sayHello(){
        //设置字段测试，可以生效
        properties.setBirthday(new Date());
        System.out.println("我的信息："+properties);
    }
}

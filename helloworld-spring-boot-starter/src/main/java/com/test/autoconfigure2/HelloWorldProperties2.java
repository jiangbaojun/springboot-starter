package com.test.autoconfigure2;

import com.test.autoconfigure1.properties.Dept;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;

/**
 * properties配置文件类
 * 对应使用者application.yml的配置
 * @Author: jiangbaojun
 * @Date: 2020/3/16 09:20
 */
@ConfigurationProperties(prefix = "spring.world")
public class HelloWorldProperties2 {
    private String name;
    private Date birthday;
    private Integer age;
    //test字段的配置，会根据类型区分
    private String test;
    private Dept dept;

    @Override
    public String toString() {
        return "HelloWorldProperties2{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", test='" + test + '\'' +
                ", dept=" + dept +
                '}';
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}

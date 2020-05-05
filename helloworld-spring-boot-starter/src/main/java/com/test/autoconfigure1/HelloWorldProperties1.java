package com.test.autoconfigure1;

import com.test.autoconfigure1.properties.Dept;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;

/**
 * properties配置文件类
 * 对应使用者application.yml的配置
 * 如果开启多个自动配置类，prefix不能重复
 * @Author: jiangbaojun
 * @Date: 2020/3/16 09:20
 */
@ConfigurationProperties(prefix = "spring.hello")
public class HelloWorldProperties1 {
    private String name;
    private Date birthday;
    private Integer age;
    private Dept dept;

    @Override
    public String toString() {
        return "HelloWorldProperties{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", dept=" + dept +
                '}';
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

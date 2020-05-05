package com.test.autoconfigure2;

/**
 * 自动配置类
 * @Author: jiangbaojun
 * @Date: 2020/3/16 09:19
 */

import com.test.template.HWTemplate1;
import com.test.template.HWTemplate2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类，注意要在META-INF/spring.factories文件中指定
 * 1、通过EnableConfigurationProperties开启properties配置，读取使用者配置的application.yml配置信息。
 * 其中，指定的类，如HelloWorldProperties.class，不要在单独使用Component注解
 * 2、ConditionalOnProperty注解，使用者配置中，当满足属性spring.hello.world.enable=true时生效，
 * 满足属性规则，prefix.value等于true，默认为matchIfMissing的值
 */
@Configuration
@EnableConfigurationProperties({HelloWorldProperties2.class, TestProperties.class})
@ConditionalOnClass(HWTemplate2.class)
@ConditionalOnProperty(prefix = "spring.world", value = "enable", matchIfMissing = true)
public class HelloWorldAutoConfiguration2 {

    @Autowired
    private HelloWorldProperties2 properties;

    @Autowired
    private TestProperties testProperties;

    @Bean
    @ConditionalOnMissingBean(HWTemplate2.class)
    public HWTemplate2 hwTemplate2(){
        return new HWTemplate2(properties, testProperties);
    }

}

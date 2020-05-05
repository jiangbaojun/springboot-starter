package com.test.autoconfigure2;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: jiangbaojun
 * @Date: 2020/3/16 11:43
 */
@ConfigurationProperties(prefix = "spring.world.test")
public class TestProperties {
    private String id;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TestProperties{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

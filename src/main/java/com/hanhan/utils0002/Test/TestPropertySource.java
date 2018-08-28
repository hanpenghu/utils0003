package com.hanhan.utils0002.Test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2018/8/26.
 */

@Configuration
@PropertySource("classpath:1.properties")
public class TestPropertySource {
    @Value("${a}")
    private  int a;
    @Value("${b}")
    private  String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}

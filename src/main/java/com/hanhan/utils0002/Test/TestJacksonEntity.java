package com.hanhan.utils0002.Test;

import com.fasterxml.jackson.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * springMVC中jackson跟页面交互注意
 */
public class TestJacksonEntity {
    private String str;
    private String str1;
    //从页面传到后台的时候不能穿"","null",如果页面想传null过来,可以不传这一项,
    private BigDecimal b;
    private BigDecimal b1;
    //页面如果想传null,不用传这一项就行
    //返回到前端的时候,如果是null或者对象里面的属性都是null,那么返回null,也可以穿{},但是不能带引号等于new了一次
    private TestJsonEntitySon testJsonEntitySon;
    //页面如果想传null,不用传这一项就行
    //返回给前端的时候如果是个null或者size()<=0,都返回null(非字符串null),也可以穿[],但不能带引号,等于new 了一次
    private List<TestJsonEntitySon> testJsonEntitySonList;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public BigDecimal getB1() {
        return b1;
    }

    public void setB1(BigDecimal b1) {
        this.b1 = b1;
    }

    public TestJsonEntitySon getTestJsonEntitySon() {
        return testJsonEntitySon;
    }

    public void setTestJsonEntitySon(TestJsonEntitySon testJsonEntitySon) {
        this.testJsonEntitySon = testJsonEntitySon;
    }

    public List<TestJsonEntitySon> getTestJsonEntitySonList() {
        return testJsonEntitySonList;
    }

    public void setTestJsonEntitySonList(List<TestJsonEntitySon> testJsonEntitySonList) {
        this.testJsonEntitySonList = testJsonEntitySonList;
    }

    @Override
    public String toString() {
        return "TestJacksonEntity{" +
                "str='" + str + '\'' +
                ", str1='" + str1 + '\'' +
                ", b=" + b +
                ", b1=" + b1 +
                ", testJsonEntitySon=" + testJsonEntitySon +
                ", testJsonEntitySonList=" + testJsonEntitySonList +
                '}';
    }
}

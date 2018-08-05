package com.hanhan.utils0002.Test;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * springMVC中jackson跟页面交互注意
 */

//仅当null的时候返回给前端不显示,""或者其他都返回显示字段
//@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class TestJacksonEntity {
    //如果不赋值传给前端,默认是0
    //前端传过来null后者"",这里都会转化为0
    private int ii;
    //前端传过来null或者"",这里接收到都是null
    private Integer integer1;

    //不管值是不是null,该字段返回给前端都会被忽略不显示默认是value=true
    //@JsonIgnore

    //是false的时候不管是不是null都显示
    //@JsonIgnore(value=false)

    //是""或者null的时候都不显示,其他都显示//EMPTY=""||null,   NON表示EMPTY这种情况不显示
    //@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)

    //仅当null的时候返回给前端不显示,""或者其他都返回显示字段
    //@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)

    //不论是null还是""等其他情况,这个字段在返回到前端序列化json的时候都显示
    //@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)

    //当""或者null的时候不显示,有值显示
    //@JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
    //不知道杂用
//    @JsonSerialize(include=JsonSerialize.Inclusion.DEFAULT_INCLUSION)
    private String str="";

    private String str1;

    //注意东八区北京时间要跟timezone
    //注意,有了这个注解返回给前端的才是这种yyyy-MM-dd HH:mm:ss.sss的标准时间,否则是返回时间戳给前端
    //@JsonFormat这个注解是专业返回给前端格式化用的

    //注意,这个注解没有的时候,前端传过来的时候只要大致的格式对了就行,但是,如果有了,
    // 就必须穿过来对应的格式,比如后面带毫秒的
    //至于2018-07-01或者2018-7-1这种省略0的都无所谓

    //如果是yyyy-MM-dd HH:mm:ss.sss,前端必须穿过来这种
    //如果是yyyy-MM-dd,前端可以传过来后面不带HH:mm:ss.sss的
    //注意该注解会影响前端穿过来的格式,格式写的越完整,前端就要往越完整的方向靠拢
    //,前端传的比这里格式完整可以,  前端穿的比这里格式不完整不行
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.sss",timezone = "GMT+8")
    private Date date=new Date();

    //就算没有@JsonFormat的时候,前端传过来为
    // 不带引号的时间戳(13位毫秒)或者
    // yyyy-MM-dd HH:mm:ss.sss 也可以直接转换成java的Date格式,亲测
    private Date date1=new Date();
    //从页面传到后台的时候能穿""或者null都代表null,不传也是null,
    private BigDecimal b;
    private BigDecimal b1;
    //返回给前端,不new的话是""或者null,这要根据全局配置,new的话就返回整个对象以及里面的属性
    //接受的时候,空的时候必须是null或者{},不能是"",  ""会报错,  {}会让回复后的对象里面的字符串打印出来看着是'null',实际上是真的null
    private TestJsonEntitySon testJsonEntitySon;
    //  传给前端的时候如果配置""就是"",不配置是null,如果new了一个返回的空就是[]
    //传过来空的时候必须是[]或者null而不能是""
    private List<TestJsonEntitySon> testJsonEntitySonList;

    public int getIi() {
        return ii;
    }

    public void setIi(int ii) {
        this.ii = ii;
    }

    public Integer getInteger1() {
        return integer1;
    }

    public void setInteger1(Integer integer1) {
        this.integer1 = integer1;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }


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
                "ii=" + ii +
                ", integer1=" + integer1 +
                ", str='" + str + '\'' +
                ", str1='" + str1 + '\'' +
                ", date=" + date +
                ", date1=" + date1 +
                ", b=" + b +
                ", b1=" + b1 +
                ", testJsonEntitySon=" + testJsonEntitySon +
                ", testJsonEntitySonList=" + testJsonEntitySonList +
                '}';
    }
}

package com.hanhan.utils0002.Test;

import com.alibaba.fastjson.JSON;
import com.hanhan.utils0002.hanhan.p;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test2StringEntity {
    private String str;
    private BigDecimal b;
    private Double d;
    private Test t;
    private List<Test> list;


    public static void main(String[]args) throws IllegalAccessException {
        Test2StringEntity test2StringEntity=new Test2StringEntity();
        test2StringEntity.setB(new BigDecimal(201.000));
        test2StringEntity.setD(12121D);
        Test test = new Test();
        test.setKk(null);
        test2StringEntity.setT(test);
        List<Test>list=new ArrayList<>();
        list.add(test);
        test2StringEntity.setList(list);
        Map<String, Object> allFields2String = p.getAllFields2String(test2StringEntity);
        //此时从新放入复合类型
//        allFields2String.put("t",p.getAllFields2String(test2StringEntity.getT()));
        p.p("-------------------------------------------------------");
        //{"str":"","b":"201","d":"12121.0","t":{"kk":"哈哈哈"}}
        p.p(JSON.toJSONString(allFields2String));
        //com.com.hanhan.utils0002.hanhan.utils0002.Test1.Test2StringEntity{str='', b=201, d=12121.0, t=com.com.hanhan.utils0002.hanhan.utils0002.Test1.Test1{kk='哈哈哈'}}
        p.p(JSON.parseObject(JSON.toJSONString(allFields2String),Test2StringEntity.class));
        p.p("-------------------------------------------------------");
    }

    public Test getT() {
        return t;
    }

    public Test2StringEntity setT(Test t) {
        this.t = t;
        return this;
    }

    public String getStr() {
        return str;
    }

    public Test2StringEntity setStr(String str) {
        this.str = str;
        return this;
    }

    public BigDecimal getB() {
        return b;
    }

    public Test2StringEntity setB(BigDecimal b) {
        this.b = b;
        return this;
    }

    public Double getD() {
        return d;
    }

    public Test2StringEntity setD(Double d) {
        this.d = d;
        return this;
    }

    public List<Test> getList() {
        return list;
    }

    public Test2StringEntity setList(List<Test> list) {
        this.list = list;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.com.hanhan.utils0002.hanhan.utils0002.Test1.Test2StringEntity{");
        sb.append("str='").append(str).append('\'');
        sb.append(", b=").append(b);
        sb.append(", d=").append(d);
        sb.append(", t=").append(t);
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}

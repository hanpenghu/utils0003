package com.hanhan.utils0002.Test;

import com.alibaba.fastjson.JSON;
import hanhan.p;

import java.math.BigDecimal;
import java.util.Map;

public class Test2StringEntity {
    private String str;
    private BigDecimal b;
    private Double d;
    private Test t;


    public static void main(String[]args) throws IllegalAccessException {
        Test2StringEntity test2StringEntity=new Test2StringEntity();
        test2StringEntity.setB(new BigDecimal(201.000));
        test2StringEntity.setD(12121D);
        Map<String, Object> allFields2String = p.getAllFields2String(test2StringEntity);
        //复合类型单独提出来,将来再放入
        Test test = new Test();
        test.setKk("哈哈哈");
        //此时放入复合类型
        allFields2String.put("t",test);
        p.p("-------------------------------------------------------");
        //{"str":"","b":"201","d":"12121.0","t":{"kk":"哈哈哈"}}
        p.p(JSON.toJSONString(allFields2String));
        //com.hanhan.utils0002.Test.Test2StringEntity{str='', b=201, d=12121.0, t=com.hanhan.utils0002.Test.Test{kk='哈哈哈'}}
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.hanhan.utils0002.Test.Test2StringEntity{");
        sb.append("str='").append(str).append('\'');
        sb.append(", b=").append(b);
        sb.append(", d=").append(d);
        sb.append(", t=").append(t);
        sb.append('}');
        return sb.toString();
    }
}

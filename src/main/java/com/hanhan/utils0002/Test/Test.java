package com.hanhan.utils0002.Test;

import hanhan.p;

import java.math.BigDecimal;
import java.util.Date;

public class Test {
    String kk="121323";
    BigDecimal bb;


    public BigDecimal getBb() {
        return bb;
    }

    public Test setBb(BigDecimal bb) {
        this.bb = bb;
        return this;
    }

    public String getKk() {
        return kk;
    }

    public Test setKk(String kk) {
        this.kk = kk;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.hanhan.utils0002.Test1.Test1{");
        sb.append("kk='").append(kk).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[]args){
        p.p("-------------------------------------------------------");
        p.p(Date.class.getTypeName());
        p.p("-------------------------------------------------------");
    }
}

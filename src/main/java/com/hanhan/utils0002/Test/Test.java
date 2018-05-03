package com.hanhan.utils0002.Test;

import hanhan.p;

import java.util.List;

public class Test {
    String kk="121323";




    public String getKk() {
        return kk;
    }

    public Test setKk(String kk) {
        this.kk = kk;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.hanhan.utils0002.Test.Test{");
        sb.append("kk='").append(kk).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[]args){
        p.p("-------------------------------------------------------");
        p.p(List.class.getTypeName());
        p.p("-------------------------------------------------------");
    }
}

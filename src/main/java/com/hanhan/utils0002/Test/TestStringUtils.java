package com.hanhan.utils0002.Test;

import hanhan.p;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2018/8/30.
 */
public class TestStringUtils {


    public static void main(String[]args){
        //StringUtils方法是空指针安全的，他们不会抛出空指针异常
        System.out.println(StringUtils.isEmpty(null));//true
        System.out.println(StringUtils.isEmpty(""));//true
        System.out.println(StringUtils.isEmpty(" "));//false------- 注意这个
        System.out.println(StringUtils.isEmpty("123"));//false
        System.out.println(StringUtils.isBlank(null));//true
        System.out.println(StringUtils.isBlank(""));//true
        System.out.println(StringUtils.isBlank(" "));//ture-----  注意这个
        p.p("-------------isBlank------------------------------------------");
        p.p(StringUtils.isBlank("          "));//true
        p.p(StringUtils.isBlank("      12"));//false
        p.p("-------------------------------------------------------");
        p.p("--------------StringUtils.isBlank(\"\\n\\t\")-----------------------------------------");
        System.out.println(StringUtils.isBlank("\n\t"));//true
        p.p("-------------------------------------------------------");
        System.out.println(StringUtils.isNumeric(null));//false
        System.out.println(StringUtils.isNumeric("12.209318231231"));//false
        System.out.println(StringUtils.isNumeric("12.2093"));//false
        System.out.println(StringUtils.isNumeric("adfdasdf"));//false
        System.out.println(StringUtils.isNumeric("12312"));//ture
        //说明这个方法是判断序列里面是不是都是数字的,并不是判断整体是不是数字的
        System.out.println(StringUtils.isNumeric("1231221312312312312313212312323"));//true
        System.out.println(StringUtils.isNumeric("2341 212"));//false
        //带空格的也可以
        System.out.println(StringUtils.isNumericSpace("2341 212"));//true
        System.out.println(StringUtils.isAllUpperCase(null));//false
        System.out.println(StringUtils.isAllUpperCase("AAas"));//false
        System.out.println(StringUtils.isAllUpperCase("ADFADS"));//true
        p.p(StringUtils.isWhitespace("      "));//true
        p.p("--------------StringUtils.isWhitespace(\"\\n\\t\")-----------------------------------------");
        System.out.println(StringUtils.isWhitespace("\n\t"));//true
        p.p("-------------------------------------------------------");
        p.p(ObjectUtils.equals(null,null));//ture
        p.p(StringUtils.equals(null,null));//true

    }


}

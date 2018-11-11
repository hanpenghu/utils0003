package test.DateTimeTest;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class DateTimeTest {

    public void f1(){
        DateTime date = DateUtil.date();
        String s = date.toString();
        System.out.println(s);
        System.out.println(date.getField(1));
        DateTime dateTime1 = DateUtil.parse("2017-11-31 12:22:34");
        System.out.println(dateTime1);
        int age = DateUtil.age(DateUtil.parse("1986-12-26"), DateUtil.date());
        System.out.println(age);


    }




    public static void main(String[]args){
        new DateTimeTest().f1();
    }



}

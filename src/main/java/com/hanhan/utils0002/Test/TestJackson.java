package com.hanhan.utils0002.Test;

import hanhan.linklistT;
import hanhan.p;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/6/22.
 */

@RestController
@CrossOrigin
public class TestJackson {


    @RequestMapping(value="testJackson",method= RequestMethod.POST)
    public @ResponseBody TestJacksonEntity  f(@RequestBody TestJacksonEntity testJacksonEntity){
        System.out.println(testJacksonEntity);
        TestJacksonEntity testJacksonEntity1=new TestJacksonEntity();
        testJacksonEntity1.setTestJsonEntitySon(new TestJsonEntitySon());
        testJacksonEntity1.setTestJsonEntitySonList(new linklistT<TestJsonEntitySon>().g());
        return testJacksonEntity1;
    }

    @RequestMapping(value="testJackson1",method= RequestMethod.GET)
    public @ResponseBody TestJacksonEntity  f1(){
        TestJacksonEntity testJacksonEntity1=new TestJacksonEntity();
//        testJacksonEntity1.setTestJsonEntitySon(new TestJsonEntitySon());
//        testJacksonEntity1.setTestJsonEntitySonList(new linklistT<TestJsonEntitySon>().g());
        return testJacksonEntity1;
    }


    @RequestMapping(value="testJacksonGet",method= RequestMethod.POST)
    public void  f11(@RequestBody TestJacksonEntity t){
        p.p("----------------------@RequestParam(required=false) TestJacksonEntity t---------------------------------");
        p.p(t);
        p.p("null".equals(t.getTestJsonEntitySon().getStr()));
        p.p(null==(t.getTestJsonEntitySon().getStr()));
        p.p(null==(t.getStr()));
        p.p(t.getInteger1());
        p.p("-------------------------------------------------------");
    }



    public static void main(String[]args){
            f();
            g();
    }


    public static void f(){
        return ;
    }

    public static void g(){
//        if(true){
//            return ;
//        }
        System.out.println("你好");

    }

}

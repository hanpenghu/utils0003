package com.hanhan.utils0002.Test;

import hanhan.linklistT;
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

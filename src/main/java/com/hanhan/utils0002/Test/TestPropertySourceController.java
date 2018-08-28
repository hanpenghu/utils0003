package com.hanhan.utils0002.Test;

import hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/8/26.
 */
@RestController
@CrossOrigin
public class TestPropertySourceController {

    @Autowired
    TestPropertySource testPropertySource;


    @RequestMapping(value="ffff")
    public String f(){
        p.p("-------------------------------------------------------");
        p.p(testPropertySource.getA());
        p.p(testPropertySource.getB());
        p.p("-------------------------------------------------------");
        return testPropertySource.getA()+"《fuck》"+testPropertySource.getB();
    }


}

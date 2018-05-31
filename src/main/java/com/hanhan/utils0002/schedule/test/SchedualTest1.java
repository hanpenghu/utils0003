package com.hanhan.utils0002.schedule.test;

import com.hanhan.utils0002.Cnst.D;
import com.hanhan.utils0002.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/31.
 */
@Component//注意必须用这个扫描进去
public class SchedualTest1 {

    @Autowired
    private D d;

    @Scheduled(initialDelay = 4000,fixedDelay =Long.MAX_VALUE)//只运行一次
    public void test(){
        p.p("-------------------test1.testCountPrdt()------------------------------------");
        p.p(d.test1.testCountPrdt());
        p.p("-------------------------------------------------------");
    }



}

package com.hanhan.utils0002.schedule.测试mybatis传入List并in;

import com.hanhan.utils0002.Cnst.D;
import hanhan.linklistT;
import hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/1.
 */
@Component
public class TestMybatisListSchedule {

    @Autowired
    private D d;

    @Scheduled(initialDelay = 5000,fixedDelay =Long.MAX_VALUE)//只运行一次
    public void test(){
        p.p("-------------------d.testMybatisList.testListIn------------------------------------");
        p.p(d.testMybatisList.testListIn(new linklistT().a("10100001").a("10100002").g()));
        p.p("-------------------------------------------------------");
    }


}

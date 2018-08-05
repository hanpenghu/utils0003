package com.hanhan.utils0002.schedule.test;

import com.hanhan.utils0002.Cnst.D;
import java.util.Date;
import com.hanhan.utils0002.entity.Prdt;
import hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/8/4.
 */
@Component
public class TestSqlDate {
@Autowired
   private D d;
    @Scheduled(initialDelay = 4000,fixedDelay =Long.MAX_VALUE)//只运行一次
    public void test(){
        p.p("-----------------------a.testDate().getSysDate()--------------------------------");
        p.p(d.a.testDate().getSysDate());
        p.p(d.a.testDate().getSpcTax());
        p.p(d.a.testDate().getPakExc());
        p.p("-------------------------------------------------------");
        p.p("-------------------insert------------------------------------");
//        Prdt prdt=new Prdt();
//        prdt.setLockDate(new Date());
//        prdt.setPrdNo("fuck2");
//        p.p(d.a.testDateInsert(prdt));
        p.p("-------------------------------------------------------");
    }

}

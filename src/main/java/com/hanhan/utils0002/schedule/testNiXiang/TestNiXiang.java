package com.hanhan.utils0002.schedule.testNiXiang;

import com.hanhan.utils0002.dao.dao1.PrdtMapper;
import com.hanhan.utils0002.entity.Prdt;
import com.hanhan.utils0002.entity.PrdtExample;
import hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2018/6/11.
 */
@Component
public class TestNiXiang {
    @Autowired
    private PrdtMapper prdtMapper;
    @Scheduled(initialDelay = 3,fixedDelay = Long.MAX_VALUE)
    public void f(){
        PrdtExample pp=new PrdtExample();
        pp.createCriteria().andPrdNoEqualTo("10100001");
        List<Prdt> prdts = prdtMapper.selectByExample(pp);
        p.p("-------------------------------------------------------");
        p.p(prdts);
        p.p("-------------------------------------------------------");
    }

}

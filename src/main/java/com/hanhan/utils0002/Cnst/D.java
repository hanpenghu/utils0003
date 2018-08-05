package com.hanhan.utils0002.Cnst;

import com.hanhan.utils0002.dao.dao1.A;
import com.hanhan.utils0002.dao.daoTest.Test1;
import com.hanhan.utils0002.dao.dao测试mybatis传入List并in.TestMybatisList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by Administrator on 2018/5/31.
 */
@Component
public class D {
    @Autowired
    public TestMybatisList testMybatisList;
    @Autowired
    public Test1 test1;

    @Autowired
    public A a;

}

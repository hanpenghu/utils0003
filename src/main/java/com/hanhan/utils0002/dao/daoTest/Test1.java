package com.hanhan.utils0002.dao.daoTest;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/31.
 */

public interface Test1 {

     //在启动类上配置好 @MapperScan(C.daoPath)  在这里写好sql, 就不用xml也可以了
     @Select({"SELECT COUNT(*) FROM  PRDT"})
     Long testCountPrdt();

}

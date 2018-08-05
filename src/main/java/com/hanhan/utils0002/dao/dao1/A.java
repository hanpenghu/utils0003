package com.hanhan.utils0002.dao.dao1;

import com.hanhan.utils0002.entity.Prdt;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2018/8/4.
 */
public interface A {


    Prdt testDate();

    Long testDateInsert(Prdt prdt);

}

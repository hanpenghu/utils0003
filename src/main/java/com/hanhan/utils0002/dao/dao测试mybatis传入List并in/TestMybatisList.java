package com.hanhan.utils0002.dao.dao测试mybatis传入List并in;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/6/1.
 */
public interface TestMybatisList {

    List<String> testListIn(@Param("prd_noList") List<String> prd_nos);


}

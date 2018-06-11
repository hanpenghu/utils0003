package com.hanhan.utils0002.dao.dao1;

import com.hanhan.utils0002.entity.Prdt;
import com.hanhan.utils0002.entity.PrdtExample;
import com.hanhan.utils0002.entity.PrdtWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrdtMapper {
    long countByExample(PrdtExample example);

    int deleteByExample(PrdtExample example);

    int deleteByPrimaryKey(String prdNo);

    int insert(PrdtWithBLOBs record);

    int insertSelective(PrdtWithBLOBs record);

    List<PrdtWithBLOBs> selectByExampleWithBLOBs(PrdtExample example);

    List<Prdt> selectByExample(PrdtExample example);

    PrdtWithBLOBs selectByPrimaryKey(String prdNo);

    int updateByExampleSelective(@Param("record") PrdtWithBLOBs record, @Param("example") PrdtExample example);

    int updateByExampleWithBLOBs(@Param("record") PrdtWithBLOBs record, @Param("example") PrdtExample example);

    int updateByExample(@Param("record") Prdt record, @Param("example") PrdtExample example);

    int updateByPrimaryKeySelective(PrdtWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PrdtWithBLOBs record);

    int updateByPrimaryKey(Prdt record);
}
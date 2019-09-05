package com.hp.dao;

import com.hp.bean.Recruit;
import com.hp.bean.RecruitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitMapper {
    long countByExample(RecruitExample example);

    int deleteByExample(RecruitExample example);

    int deleteByPrimaryKey(Integer recruitNum);

    int insert(Recruit record);

    int insertSelective(Recruit record);

    List<Recruit> selectByExampleWithBLOBs(RecruitExample example);

    List<Recruit> selectByExample(RecruitExample example);

    Recruit selectByPrimaryKey(Integer recruitNum);

    int updateByExampleSelective(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByExampleWithBLOBs(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByExample(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByPrimaryKeySelective(Recruit record);

    int updateByPrimaryKeyWithBLOBs(Recruit record);

    int updateByPrimaryKey(Recruit record);
}
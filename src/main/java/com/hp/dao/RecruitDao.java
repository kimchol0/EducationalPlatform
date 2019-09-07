package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Recruit;

public interface RecruitDao {

	@Select("select * from e_recruit where c_num = #{cNum} and CLASS_NUM = #{classNum}")
	List<Recruit> queryAllBycNum(Recruit recruit);
	
	@Select("select * from e_recruit where U_ID2 !='' and RECRUIT_E_DATE !=''")
	List<Recruit> queryRecruitHistory();
}
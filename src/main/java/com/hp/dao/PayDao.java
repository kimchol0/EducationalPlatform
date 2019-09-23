package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.hp.bean.Pay;
import com.hp.bean.User;

public interface PayDao {

	@Select("select * from e_pay ")
	List<Pay> queryAllPay();

	@Select("select * from e_pay where PAY_NUM = #{payNum}")
	Pay queryPayBypayNum(Integer payNum);

	List<Pay> queryPayByExample(String search);

	@Select("select * from e_pay where PAY_NUM = #{payNum}")
	Pay queryPay(String payNum);



	

}

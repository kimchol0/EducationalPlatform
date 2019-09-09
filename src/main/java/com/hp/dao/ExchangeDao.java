package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Exchange;

public interface ExchangeDao {

	@Select("select * from e_exchange where exchange_num = 1")
	List<Exchange> queryAllExchange();

	@Select("select * from e_exchange where exchange_num = #{exchangeNum}")
	Exchange queryExchangeByexchangeNum(Integer exchangeNum);

	List<Exchange> queryExchangeByExample(String search);



}

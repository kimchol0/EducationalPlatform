package com.hp.service;

import java.util.List;

import com.hp.bean.Chat;
import com.hp.bean.Chat_status;

public interface ChatService {

	List<Chat> queryAllReceiveInfoByuId(Integer uId2);

	int deleteByPrimaryKey(Integer chatNum);

	Chat selectByPrimaryKey(Integer chatNum, Integer uId);

	Chat queryChatByChatNum(Integer chatNum);

	int insertSelective(Chat chat);

	List<Chat> queryAllSendInfoByuId(Integer uId);

	List<Chat> queryChatListByuId(Integer uId);

	Chat_status queryStatus(Integer cSNum);

	int updateByPrimaryKeySelective(Integer chatNum);


}

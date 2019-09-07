package com.hp.dao;
import java.util.List;
import org.apache.ibatis.annotations.Select;

import com.hp.bean.Credit;
import com.hp.bean.User;

public interface UserDao {

	@Select("select * from e_user where g_num = 1")
	List<User> queryAllStudent();

	@Select("select * from e_user where g_num = 2")
	List<User> queryAllTeacher();

	@Select("select * from e_user where U_ID = #{uId}")
	User queryStudentByuId(Integer uId);

	List<User> queryStudentByExample(String search);

}

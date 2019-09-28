package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.City;
import com.hp.bean.Recruit;
import com.hp.bean.User;
import com.hp.dao.UserDao;
import com.hp.dao.UserMapper;
import com.hp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;
	
	@Autowired
	public UserMapper userMapper;
	
	public List<User> queryAllStudent() {
		return userDao.queryAllStudent();
	}

	public List<User> queryAllTeacher() {
		return userDao.queryAllTeacher();
	}

	public int deleteByPrimaryKey(Integer uId) {
		return userMapper.deleteByPrimaryKey(uId);
	}

	public User queryStudentByuId(Integer uId) {
		return userDao.queryStudentByuId(uId);
	}

	public int updateByPrimaryKeySelective(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	public User queryTeacherByuId(Integer uId) {
		return userDao.queryTeacherByuId(uId);
	}

	public List<User> queryStudentByExample(String search) {
		return userDao.queryStudentByExample(search);
	}

	public void insertSelective(User user) {
		userMapper.insertSelective(user);
	}

	public List<User> queryTeacherByworking() {
		return userDao.queryTeacherByworking();
	}
	public List<User> queryTeacherByExample(String search) {
		return userDao.queryTeacherByExample(search);
	}

	public User queryLoginByUser(User user) {
		return userDao.queryLoginByUser(user);
	}

	public User queryRegUser(User user) {
		return userDao.queryRegUser(user);
	}

	public int insertUserSelective(User user) {
		return userMapper.insertSelective(user);
	}

	public String queryUnameByUid(Integer uId) {
		// TODO Auto-generated method stub
		return userDao.queryUnameByUid(uId);
	}
	
	public User queryAllTeacherByuId(Integer uId) {
		// TODO Auto-generated method stub
		return userDao.queryAllTeacherByuId(uId);
	}

	public User queryTeacherByInfo(Integer uId) {
		// TODO Auto-generated method stub
		return userDao.queryTeacherByInfo(uId);
	}

	public User queryUserByEmail(String uEmail) {
		return userDao.queryUserByEmail(uEmail);
	}

	public List<City> queryAllCity() {
		// TODO Auto-generated method stub
		return userDao.queryAllCity();
	}

	public City queryAllCityBycNum(Integer cNum) {
		// TODO Auto-generated method stub
		return userDao.queryAllCityBycNum(cNum);
	}

}

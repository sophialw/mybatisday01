package com.neutech.dao;

import java.util.List;

import com.neutech.bean.User;

public interface UserDao {
	//查询全部用户信息
	List<User> findAll() throws Exception;
	
	//添加用户
	int addUser(User user) throws Exception;
	
	//根据用户的编号查询
	User findUserById(int uid) throws Exception;
	
	//根据编号删除用户
	int deleteUser(int uid) throws Exception;
	
	//修改用户的信息
	int updateUser(User user) throws Exception;
	
}

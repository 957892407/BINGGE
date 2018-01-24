package org.spring_mybatis.study.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.spring_mybatis.study.usermag.beans.UserBean;
import org.spring_mybatis.study.usermag.dao.IUserDao;
import org.spring_mybatis.study.usermag.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
	private UserMapper um;
	
	public void setSession(SqlSession session){
		um = session.getMapper(UserMapper.class);
	}
	
	public int saveUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		return um.saveUserInfo(user);
	}

	public int updateUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		return um.updateUserInfo(user);
	}

	public int deleteUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return um.deleteUserInfoById(id);
	}

	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return um.getUserBeanById(id);
	}
	
	public UserBean getUserBeanByLoginNameAndPassword(String loginName, String password) {
		// TODO Auto-generated method stub
		return um.getUserBeanByLoginNameAndPassword(loginName, password);
	}

	public UserBean getUserBeanByMap(Map map) {
		// TODO Auto-generated method stub
		return um.getUserBeanByMap(map);
	}

	public List<UserBean> getUserListByUserName(String userName) {
		// TODO Auto-generated method stub
		return um.getUserListByUserName(userName);
	}

	public int batchSaveUserInfo(List<UserBean> users) {
		// TODO Auto-generated method stub
		return um.batchSaveUserInfo(users);
	}

	public int batchDeleteUserInfo(Long[] ids) {
		// TODO Auto-generated method stub
		return um.batchDeleteUserInfo(ids);
	}

	public int countUserListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return um.countUserListByMapToPager(map);
	}

	public List<?> findUserListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return um.findUserListByMapToPager(map);
	}

}

package org.spring_mybatis.test.usermag.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring_mybatis.study.beans.Pager;
import org.spring_mybatis.study.usermag.beans.UserBean;
import org.spring_mybatis.study.usermag.service.IUserService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestUserServiceImpl {

	@Resource
	private IUserService userServiceImpl;
	
	@Ignore
	public void testFindUserListByMapToPager(){
		Pager pager = new Pager();
		pager.setPage(1);
		pager.setRows(6);
		
		Map map = new HashMap();
		map.put("userName", "x");
		map.put("password", "123456");
		map.put("index", pager.getIndex());
		map.put("rows", pager.getRows());
		
		pager = userServiceImpl.findUserListByMapToPager(map, pager);
		Assert.assertNotNull(pager.getDatas());
		
		System.out.println(pager);
	}
	
	
	
	@Test
	public void testBatchDeleteUserInfo(){
		Long[] ids = {12l,13l,14l};
		int rows = userServiceImpl.batchDeleteUserInfo(ids);
		
		Assert.assertEquals(3, rows);
	}
	
	@Ignore
	public void testBatchSaveUserInfo(){
		UserBean user = new UserBean();
		user.setLoginName("e");
		user.setUserName("xiaomei");
		user.setAge(25);
		user.setPassword("123456");
		//如果一批对象，绝大多数的属性值都几乎相同，那么最好使用"原型模式"克隆产生他们
		try {
			UserBean user1 = (UserBean) user.clone();
			user1.setLoginName("d");
			UserBean user2 = (UserBean) user.clone();
			user2.setLoginName("c");
			
			List<UserBean> users = new ArrayList<UserBean>();
			users.add(user2);
			users.add(user1);
			users.add(user);
			
			int rows = userServiceImpl.batchSaveUserInfo(users);
			
			Assert.assertEquals(3, rows);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
	
	@Ignore
	public void testGetUserListByUserName(){
		String userName = "xiao";
		List<UserBean> users = userServiceImpl.getUserListByUserName(userName);
		Assert.assertNotNull(users);
		
		System.out.println(users);
	}
	
	@Ignore
	public void testGetUserBeanByMap(){
		String loginName = "a";
		String password = "123456";
		Map map = new HashMap();
		map.put("loginName", loginName);
		map.put("password", password);
		UserBean user = userServiceImpl.getUserBeanByMap(map);
		
		Assert.assertNotNull(user);
		System.out.println(user);
	}
	
	
	@Ignore
	public void testGetUserBeanByLoginNameAndPassword(){
		String loginName = "a";
		String password = "123456";
		
		UserBean user = userServiceImpl
				.getUserBeanByLoginNameAndPassword(loginName, password);
		Assert.assertNotNull(user);
		System.out.println(user);
	}
	
	@Ignore
	public void testDeleteUserInfoById(){
		UserBean user = userServiceImpl.getUserBeanById(1l);
		Assert.assertNotNull(user);
		System.out.println(user);
		
		
		int rows = userServiceImpl.deleteUserInfoById(user.getId());
		Assert.assertEquals(1, rows);
	}
	
	@Ignore
	public void testUpdateUserInfo(){
		UserBean user = userServiceImpl.getUserBeanById(3l);
		Assert.assertNotNull(user);
		System.out.println(user);
		
		user.setAge(20);
		int rows = userServiceImpl.updateUserInfo(user);
		Assert.assertEquals(1, rows);
	}
	
	@Ignore
	public void testSaveUserInfo(){
		UserBean user = new UserBean();
		user.setUserName("xiaoma");
		user.setAge(18);
		user.setPassword("123456");
		
		int rows = userServiceImpl.saveUserInfo(user);
		Assert.assertEquals(1, rows);
		
		System.out.println(user);
	}
	
	
	
	
	
	
	
	
}

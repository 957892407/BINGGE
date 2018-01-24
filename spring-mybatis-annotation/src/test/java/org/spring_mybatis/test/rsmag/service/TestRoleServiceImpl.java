package org.spring_mybatis.test.rsmag.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring_mybatis.study.relationshipmag.beans.Person;
import org.spring_mybatis.study.relationshipmag.beans.Role;
import org.spring_mybatis.study.relationshipmag.service.IPersonService;
import org.spring_mybatis.study.relationshipmag.service.IRoleService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestRoleServiceImpl {

	@Resource
	private IRoleService roleServiceImpl;
	
	@Resource
	private IPersonService personServiceImpl;
	
	@Test
	public void testGetPersonWithRoleByPersonName(){
		
		List<?> person = personServiceImpl.getPersonWithRoleByPersonName("a");
		
		
		System.out.println(person);
		
	}
	
	@Ignore
	public void testGetRoleWithPersonById(){
		Role role = roleServiceImpl.getRoleWithPersonById(1l);
		System.out.println(role.getRoleName());
		
	}
}

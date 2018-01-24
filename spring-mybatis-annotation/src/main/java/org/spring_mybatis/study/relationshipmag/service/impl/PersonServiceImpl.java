package org.spring_mybatis.study.relationshipmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.spring_mybatis.study.relationshipmag.dao.IPersonDao;
import org.spring_mybatis.study.relationshipmag.service.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {

	@Resource
	private IPersonDao personDaoImpl;
	
	public List<?> getPersonWithRoleByPersonName(String name) {
		// TODO Auto-generated method stub
		return personDaoImpl.getPersonWithRoleByPersonName(name);
	}

}

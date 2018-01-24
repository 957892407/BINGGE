package org.spring_mybatis.study.relationshipmag.dao;

import java.util.List;

public interface IPersonDao {
	
	public List<?> getPersonWithRoleByPersonName(String name);

}

package org.spring_mybatis.study.relationshipmag.service;

import java.util.List;

public interface IPersonService {

	public List<?> getPersonWithRoleByPersonName(String name);
}

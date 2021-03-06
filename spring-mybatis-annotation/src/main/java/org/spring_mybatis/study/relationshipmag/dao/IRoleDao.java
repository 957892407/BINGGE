package org.spring_mybatis.study.relationshipmag.dao;

import org.spring_mybatis.study.relationshipmag.beans.Role;

public interface IRoleDao {
	/**
	 * 根据id查询角色，并显示其对应的用户
	 * @param id
	 * @return
	 */
	public Role getRoleWithPersonById(Long id);
}

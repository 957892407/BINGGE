package org.spring_mybatis.study.relationshipmag.dao;

import org.spring_mybatis.study.relationshipmag.beans.Role;

public interface IRoleDao {
	/**
	 * ����id��ѯ��ɫ������ʾ���Ӧ���û�
	 * @param id
	 * @return
	 */
	public Role getRoleWithPersonById(Long id);
}

package org.spring_mybatis.study.relationshipmag.service;

import org.spring_mybatis.study.relationshipmag.beans.Role;

public interface IRoleService {
	/**
	 * ����id��ѯ��ɫ������ʾ���Ӧ���û�
	 * @param id
	 * @return
	 */
	public Role getRoleWithPersonById(Long id);
}

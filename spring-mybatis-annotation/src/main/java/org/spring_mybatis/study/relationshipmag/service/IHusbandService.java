package org.spring_mybatis.study.relationshipmag.service;

import org.spring_mybatis.study.relationshipmag.beans.Husband;
import org.spring_mybatis.study.relationshipmag.beans.Wife;

public interface IHusbandService {

	/**
	 * ���
	 * @param hus
	 * @return
	 */
	public int marry(Husband hus,Wife wife);
	/**
	 * ����id��ѯ�ɷ򣬲�Ҫ����ʾ������
	 * @param id
	 * @return
	 */
	public Husband getHusbandWithWifeById(Long id);
	/**
	 * Ҫ��ɾ���ɷ򣬲���ɾ��������
	 * @param id
	 * @return
	 */
	public int deleteHusbandWithWifeById(Long id);
}

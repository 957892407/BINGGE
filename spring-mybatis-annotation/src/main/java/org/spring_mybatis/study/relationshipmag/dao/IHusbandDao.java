package org.spring_mybatis.study.relationshipmag.dao;

import org.spring_mybatis.study.relationshipmag.beans.Husband;

public interface IHusbandDao {
	/**
	 * ����һ��δ���
	 * @param hus
	 * @return
	 */
	public int saveHusbandInfo(Husband hus);
	/**
	 * ���
	 * @param hus
	 * @return
	 */
	public int marry(Husband hus);
	
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

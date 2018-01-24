package org.spring_mybatis.study.relationshipmag.dao;

import org.spring_mybatis.study.relationshipmag.beans.Wife;

public interface IWifeDao {
	/**
	 * 新增一个未婚妻
	 * @param wife
	 */
	public int saveWifeInfo(Wife wife);
	
	public Wife getWifeWithHusbandById(Long id);
	
}

package org.spring_mybatis.study.relationshipmag.dao;

import org.spring_mybatis.study.relationshipmag.beans.Player;

public interface IPlayerDao {
	/**
	 * ����ID��ѯ��ң���Ҫ����ʾ��Ϸ
	 * @param id
	 * @return
	 */
	public Player getPlayerWithGamesById(Long id);
}

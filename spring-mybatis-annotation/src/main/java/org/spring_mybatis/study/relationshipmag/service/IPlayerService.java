package org.spring_mybatis.study.relationshipmag.service;

import org.spring_mybatis.study.relationshipmag.beans.Player;

public interface IPlayerService {
	/**
	 * ����ID��ѯ��ң���Ҫ����ʾ��Ϸ
	 * @param id
	 * @return
	 */
	public Player getPlayerWithGamesById(Long id);
}

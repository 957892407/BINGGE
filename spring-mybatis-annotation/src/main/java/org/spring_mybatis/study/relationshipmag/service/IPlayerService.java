package org.spring_mybatis.study.relationshipmag.service;

import org.spring_mybatis.study.relationshipmag.beans.Player;

public interface IPlayerService {
	/**
	 * 根据ID查询玩家，并要求显示游戏
	 * @param id
	 * @return
	 */
	public Player getPlayerWithGamesById(Long id);
}

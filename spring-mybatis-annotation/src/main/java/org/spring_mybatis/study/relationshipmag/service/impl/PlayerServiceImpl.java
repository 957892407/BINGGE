package org.spring_mybatis.study.relationshipmag.service.impl;

import javax.annotation.Resource;

import org.spring_mybatis.study.relationshipmag.beans.Player;
import org.spring_mybatis.study.relationshipmag.dao.IPlayerDao;
import org.spring_mybatis.study.relationshipmag.service.IPlayerService;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements IPlayerService {

	@Resource
	private IPlayerDao playerDaoImpl;
	
	public Player getPlayerWithGamesById(Long id) {
		// TODO Auto-generated method stub
		return playerDaoImpl.getPlayerWithGamesById(id);
	}

}

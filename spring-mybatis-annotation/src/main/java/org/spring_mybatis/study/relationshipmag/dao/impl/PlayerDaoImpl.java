package org.spring_mybatis.study.relationshipmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.spring_mybatis.study.relationshipmag.beans.Player;
import org.spring_mybatis.study.relationshipmag.dao.IPlayerDao;
import org.spring_mybatis.study.relationshipmag.mapper.PlayerMapper;
import org.springframework.stereotype.Repository;
@Repository
public class PlayerDaoImpl implements IPlayerDao {

	private PlayerMapper pm;
	
	public void setSession(SqlSession session){
		pm = session.getMapper(PlayerMapper.class);
	}
	
	public Player getPlayerWithGamesById(Long id) {
		// TODO Auto-generated method stub
		return pm.getPlayerWithGamesById(id);
	}

}

package org.spring_mybatis.test.rsmag.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring_mybatis.study.relationshipmag.beans.Player;
import org.spring_mybatis.study.relationshipmag.service.IPlayerService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestPlayerServiceImpl {

	@Resource
	private IPlayerService playerServiceImpl;
	
	@Test
	public void testGetPlayerWithGamesById(){
		Player player = playerServiceImpl.getPlayerWithGamesById(1l);
		System.out.println(player.getPlayerName());
		
		
		System.out.println(player.getGames());
		
	}
	
}

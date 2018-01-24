package org.spring_mybatis.study.relationshipmag.beans;

import java.io.Serializable;
import java.util.List;

public class Player implements Serializable {

	private Long id;
	private String playerName;
	
	private List<Game> games;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", games=" + games + "]";
	}
	
	
}

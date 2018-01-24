package org.spring_mybatis.study.relationshipmag.beans;

import java.io.Serializable;
import java.util.List;

public class Game implements Serializable {

	private Long id;
	private String gameName;
	
	private List<Player> players;

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", gameName=" + gameName + ", players=" + players + "]";
	}
}

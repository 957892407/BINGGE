package org.spring_mybatis.study.relationshipmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.spring_mybatis.study.relationshipmag.beans.Game;
import org.spring_mybatis.study.relationshipmag.beans.Player;

public interface PlayerMapper {
	/**
	 * 根据ID查询玩家，并要求显示游戏
	 * @param id
	 * @return
	 */
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="playerName",column="player_name",javaType=String.class),
		@Result(property="games",column="id",javaType=List.class,many=@Many(fetchType=FetchType.LAZY,select="getGameByFkPlayerId"))
	})
	@Select("select * from t_player where id = #{id}")
	public Player getPlayerWithGamesById(Long id);
	
	@ResultType(Game.class)
	@Select("select id as id,game_name as gameName from t_game where id in (select fk_game_id from t_player_game where fk_player_id = #{id})")
	public Game getGameByFkPlayerId(Long id);
	
	
	
	
	
	
	
	
	
	
	
}

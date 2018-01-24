package org.spring_mybatis.study.logmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.spring_mybatis.study.logmag.beans.OperaLogBean;

public interface OperLogMapper {

	@Insert("insert into t_operlog (user_name,oper_time,model,oper_type,datas)values(#{log.userName},#{log.operTime},#{log.model},#{log.operType},#{log.datas})")
	public int saveOperLogBean(@Param("log")OperaLogBean log);
	
}

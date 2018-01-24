package org.spring_mybatis.study.relationshipmag.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.spring_mybatis.study.relationshipmag.beans.Husband;

public interface HusbandMapper {
	/**
	 * 新增一个未婚夫
	 * @param hus
	 * @return
	 */
	
	@Insert("insert into t_hus (name) values (#{hus.name})")
	@Options(useGeneratedKeys=true,keyProperty="hus.id")
	public int saveHusbandInfo(@Param("hus")Husband hus);
	/**
	 * 结婚
	 * @param hus
	 * @return
	 */
	@Update("update t_hus set fk_wife_id = #{hus.wife.id} where id = #{hus.id}")
	public int marry(@Param("hus")Husband hus);
	
	/**
	 * 根据id查询丈夫，并要求显示其妻子
	 * @param id
	 * @return
	 */
	
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="name",column="hName",javaType=String.class),
		@Result(property="wife.id",column="wId",javaType=Long.class),
		@Result(property="wife.name",column="wName",javaType=String.class)
	})
	@Select("select h.id as hId,h.name as hName,w.id as wId,w.name as wName from t_hus as h left join t_wife as w on h.fk_wife_id = w.id where h.id = #{id}")
	public Husband getHusbandWithWifeById(@Param("id")Long id);
	/**
	 * 要求删除丈夫，并且删除其妻子
	 * @param id
	 * @return
	 */
	@Delete(value={"delete from t_wife where id = (select fk_wife_id from t_hus where id = #{id});"
			,"delete from t_hus where id = #{id}"})
	public int deleteHusbandWithWifeById(@Param("id")Long id);
}

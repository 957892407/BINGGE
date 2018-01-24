package org.spring_mybatis.study.utils;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionUtils {

	private static SqlSessionFactory sf;
	private static ThreadLocal local = new ThreadLocal();//变量副本类
	
	static {
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream("mybatis.cfg.xml");
			sf = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * 返回连接
	 * @return
	 */
	public static SqlSession getSession(){
		SqlSession session = (SqlSession) local.get();
		if(session != null){
			return session;
		}else{
			session = sf.openSession();
			local.set(session);
		}
		return session;
	}
	
}

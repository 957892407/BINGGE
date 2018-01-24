package org.spring_mybatis.study.aspects;

import java.lang.reflect.Method;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.spring_mybatis.study.utils.SessionUtils;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SessionAspect {
	
	private SqlSession session;
	
	@Before(value="execution(* org.spring_mybatis.study.*mag.dao.impl.*DaoImpl.*(..))")
	public void before(JoinPoint jp){
		Object target = jp.getTarget();
		Class<?> cls = target.getClass();
		try {
			Method m = cls.getMethod("setSession", SqlSession.class);
			session = SessionUtils.getSession();
			m.invoke(target, session);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterReturning(returning="obj",pointcut="execution(* org.spring_mybatis.study.*mag.dao.impl.*DaoImpl.*(..))")
	public void afterReturningAdvice(JoinPoint jp,Object obj){
		session.commit();
//		session.close();
	}
	
	@AfterThrowing(throwing="obj",pointcut="execution(* org.spring_mybatis.study.*mag.dao.impl.*DaoImpl.*(..))")
	public void afterThrowingAdvice(JoinPoint jp,Object obj){
		session.rollback();
//		session.close();
	}
}

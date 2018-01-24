package org.spring_mybatis.study.aspects;

import java.util.Arrays;
import java.util.Date;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.spring_mybatis.study.logmag.beans.OperaLogBean;
import org.spring_mybatis.study.logmag.dao.IOperLogDao;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class LogAspect {
	
	@Resource
	private IOperLogDao operLogDaoImpl;
	
	
	@AfterReturning(returning="obj",pointcut="execution(* org.spring_mybatis.study.*mag.service.impl.*ServiceImpl.*(..))")
	public void afterReturningAdive(JoinPoint jp,Object obj){
		Object target = jp.getTarget();
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		String userName = "xiaohuang";//���ֵ�����ڱ������Ķ��������
		
		OperaLogBean log = new OperaLogBean();
		log.setUserName(userName);
		log.setOperTime(new Date());
		log.setModel(String.valueOf(target));
		log.setOperType(0);//0����������1�����޸�
		log.setDatas(Arrays.toString(args));
		operLogDaoImpl.saveOperLogBean(log);
	}
	
	
	
}

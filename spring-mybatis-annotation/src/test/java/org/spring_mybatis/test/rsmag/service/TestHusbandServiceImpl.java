package org.spring_mybatis.test.rsmag.service;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring_mybatis.study.relationshipmag.beans.Husband;
import org.spring_mybatis.study.relationshipmag.beans.Wife;
import org.spring_mybatis.study.relationshipmag.service.IHusbandService;
import org.spring_mybatis.study.relationshipmag.service.IWifeService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestHusbandServiceImpl {

	@Resource
	private IHusbandService husbandServiceImpl;
	
	@Resource
	private IWifeService wifeServiceImpl;
	
	@Test
	public void testGetWifeWithHusbandById(){
		Wife wife = wifeServiceImpl.getWifeWithHusbandById(1l);
		System.out.println(wife.getName());
		
		
		System.out.println(wife.getHus());
	}
	
	@Ignore
	public void testDeleteHusbandWithWifeById(){
		husbandServiceImpl.deleteHusbandWithWifeById(1l);
	}
	
	@Ignore
	public void testGetHusbandWithWifeById(){
		Husband hus = husbandServiceImpl.getHusbandWithWifeById(1l);
		Assert.assertNotNull(hus);
		
		System.out.println(hus);
	}
	
	@Ignore
	public void testMarry(){
		Husband hus = new Husband();
		hus.setName("Сκ");
		
		Wife wife = new Wife();
		wife.setName("�绨");
		
		int rows = husbandServiceImpl.marry(hus, wife);
		Assert.assertEquals(1, rows);
	}
	
	
	
}

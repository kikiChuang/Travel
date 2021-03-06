package com.javen.testmybatis;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.travel.model.TravelRecommend;
import com.travel.service.TravelRecommendService;
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestTravelRecommend {  
    private static Logger logger = Logger.getLogger(TestTravelRecommend.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private TravelRecommendService travelRecommemdService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        TravelRecommend recommend = new TravelRecommend();
        recommend.setDelFlg("0");
        recommend.setAdoptFlg("1");
        recommend.setRecommendClass("1");
        List<TravelRecommend> list = travelRecommemdService.selectBySelective(recommend);
        System.out.println(list.size());
        for(TravelRecommend arecommend : list){
        	System.out.println(arecommend.getId());
        }
    }  
}  
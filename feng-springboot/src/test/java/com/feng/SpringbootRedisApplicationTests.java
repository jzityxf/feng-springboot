package com.feng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.feng.redis.SpringbootRedisApplication;
import com.feng.redis.dao.RedisDao;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootRedisApplication.class)
public class SpringbootRedisApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(SpringbootRedisApplicationTests.class);
	@Test
	public void contextLoads() {
	}

	@Autowired
	RedisDao redisDao;
	@Test
	public void testRedis(){
		redisDao.setKey("name","forezp");
		redisDao.setKey("age","11");
		logger.info("name:"+redisDao.getValue("name"));
		logger.info("age:"+redisDao.getValue("age"));
	}
}

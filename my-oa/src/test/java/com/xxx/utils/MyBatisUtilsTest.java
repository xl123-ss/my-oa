package com.xxx.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class MyBatisUtilsTest {
    Logger logger = LoggerFactory.getLogger(getClass());
    static Logger loggerstatic = LoggerFactory.getLogger(MyBatisUtilsTest
            .class);
    @Test
    public void getSession(){
        List o = (List) MyBatisUtils.executeQuery(sqlSession -> sqlSession.selectList("com.xxx.mapper.Test.test"));
        assertEquals("success1",o.get(0));
        logger.info(o.toString());
    }
}
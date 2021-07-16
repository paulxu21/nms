package com.chuyue.nms.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestMapperTest {
    @Autowired
    private TestMapper testMapper;

    @Test
    void testList() {
        testMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void testListAll() {
        testMapper.listAll().forEach(System.out::println);
    }
}
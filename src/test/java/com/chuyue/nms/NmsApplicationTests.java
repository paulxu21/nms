package com.chuyue.nms;

import com.chuyue.nms.mapper.EbookMapper;
import com.chuyue.nms.service.EbookService;
import com.chuyue.nms.service.impl.EbookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NmsApplicationTests {

    @Autowired
    private EbookMapper ebookMapper;
    @Autowired
    private EbookServiceImpl ebookServiceImpl;

    @Test
    void contextLoads() {
    }

    @Test
    void testListEbook() {
        ebookMapper.selectList(null).forEach(System.out::println);
    }
}

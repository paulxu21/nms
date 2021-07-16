package com.chuyue.nms.controller;

import com.chuyue.nms.entity.Test;
import com.chuyue.nms.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping("/test/hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/test/list")
    public List<Test> listAll() {
        return testMapper.selectList(null);
    }

}

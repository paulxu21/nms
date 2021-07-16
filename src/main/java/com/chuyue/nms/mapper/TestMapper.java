package com.chuyue.nms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chuyue.nms.entity.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper extends BaseMapper<Test> {
    List<Test> listAll();
}

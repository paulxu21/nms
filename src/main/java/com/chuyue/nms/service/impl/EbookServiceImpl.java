package com.chuyue.nms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chuyue.nms.entity.Ebook;
import com.chuyue.nms.mapper.EbookMapper;
import com.chuyue.nms.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookServiceImpl extends ServiceImpl<EbookMapper, Ebook> implements EbookService {
    @Autowired
    private EbookMapper ebookMapper;
    @Override
    public List<Ebook> listAll(String name) {
        QueryWrapper<Ebook> wrapper = new QueryWrapper<>();
        if(name != null) {
            wrapper.like("name", name);
        }
        return ebookMapper.selectList(wrapper);
    }
}

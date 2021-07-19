package com.chuyue.nms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chuyue.nms.entity.Ebook;
import com.chuyue.nms.mapper.EbookMapper;
import com.chuyue.nms.request.EbookReq;
import com.chuyue.nms.response.EbookResp;
import com.chuyue.nms.service.EbookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookServiceImpl extends ServiceImpl<EbookMapper, Ebook> implements EbookService {
    @Autowired
    private EbookMapper ebookMapper;
    @Override
    public List<EbookResp> listAll(EbookReq req) {
        QueryWrapper<Ebook> wrapper = new QueryWrapper<>();
        if(req.getName() != null) {
            wrapper.like("name", req.getName());
        }
        List<Ebook> list = ebookMapper.selectList(wrapper);
        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : list) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            respList.add(ebookResp);
        }
        return respList;
    }
}

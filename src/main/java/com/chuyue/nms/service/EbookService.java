package com.chuyue.nms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chuyue.nms.entity.Ebook;
import com.chuyue.nms.request.EbookReq;
import com.chuyue.nms.response.EbookResp;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EbookService extends IService<Ebook> {
    List<EbookResp> listAll(EbookReq req);
}

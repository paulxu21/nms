package com.chuyue.nms.controller;

import com.chuyue.nms.entity.Ebook;
import com.chuyue.nms.request.EbookReq;
import com.chuyue.nms.response.CommonResponse;
import com.chuyue.nms.response.EbookResp;
import com.chuyue.nms.service.impl.EbookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookServiceImpl ebookService;

    @GetMapping("/list")
    public CommonResponse list(EbookReq req) {
        CommonResponse<List<EbookResp>> response = new CommonResponse<>();
        List<EbookResp> list = ebookService.listAll(req);
        response.setSuccess(true);
        response.setMessage("返回eBooks");
        response.setContent(list);
        return response;
    }
}

package com.chuyue.nms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chuyue.nms.entity.Ebook;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EbookService extends IService<Ebook> {
    List<Ebook> listAll();
}

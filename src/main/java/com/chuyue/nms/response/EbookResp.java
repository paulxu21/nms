package com.chuyue.nms.response;

import lombok.Data;

@Data
public class EbookResp {
    private Long id;
    private String name;
    private String category1Id;
    private String category2Id;
    private String description;
    private String cover;
    private Integer docCount;
    private Integer viewCount;
    private Integer voteCount;
}

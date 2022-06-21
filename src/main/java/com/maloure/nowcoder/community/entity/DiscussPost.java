package com.maloure.nowcoder.community.entity;

import lombok.Data;
import org.mybatis.spring.annotation.MapperScan;

import java.util.Date;

@Data

public class DiscussPost {

    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
}

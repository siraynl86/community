package com.maloure.nowcoder.community.service;

import com.maloure.nowcoder.community.entity.DiscussPost;

import java.util.List;

public interface IDiscussPostService {
    List<DiscussPost> selectDiscussPosts(int userId,int current,int size);

    int selectDiscussPostRows(int userId);
}

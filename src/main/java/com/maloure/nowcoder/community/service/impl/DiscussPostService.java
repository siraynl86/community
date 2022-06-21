package com.maloure.nowcoder.community.service.impl;

import com.maloure.nowcoder.community.entity.DiscussPost;
import com.maloure.nowcoder.community.mapper.DiscussPostMapper;
import com.maloure.nowcoder.community.service.IDiscussPostService;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService implements IDiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Override
    public List<DiscussPost> selectDiscussPosts(int userId, int current, int size) {
        return discussPostMapper.selectDiscussionPosts(userId,current,size);
    }

    @Override
    public int selectDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}

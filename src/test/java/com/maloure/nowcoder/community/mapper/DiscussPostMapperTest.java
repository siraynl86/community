package com.maloure.nowcoder.community.mapper;

import com.maloure.nowcoder.community.NowcoderDemoApplication;
import com.maloure.nowcoder.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = NowcoderDemoApplication.class)
public class DiscussPostMapperTest {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectPosts(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussionPosts(101, 0, 10);


        for (DiscussPost discussPost : discussPosts) {
            System.out.println(discussPost);
        }

    }

    @Test
    public void testSelectDiscussPostRows(){

        int count = discussPostMapper.selectDiscussPostRows(101);

        System.out.println(count);
    }
}

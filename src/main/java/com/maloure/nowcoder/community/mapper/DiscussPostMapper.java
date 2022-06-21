package com.maloure.nowcoder.community.mapper;

import com.maloure.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DiscussPostMapper {

     List<DiscussPost>  selectDiscussionPosts(int userId,int current,int limit);

     int selectDiscussPostRows(@Param("userId") int userId);
 }

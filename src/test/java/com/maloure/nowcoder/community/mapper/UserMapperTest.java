package com.maloure.nowcoder.community.mapper;

import com.maloure.nowcoder.community.NowcoderDemoApplication;
import com.maloure.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = NowcoderDemoApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectById(){
        User user = userMapper.selectById(101);

        System.out.println(user);
    }


}

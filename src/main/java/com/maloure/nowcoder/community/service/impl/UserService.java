package com.maloure.nowcoder.community.service.impl;

import com.maloure.nowcoder.community.entity.User;
import com.maloure.nowcoder.community.mapper.UserMapper;
import com.maloure.nowcoder.community.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;
    public User selectById(int id){
        return userMapper.selectById(id);
    }
}

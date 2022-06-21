package com.maloure.nowcoder.community.service;

import com.maloure.nowcoder.community.entity.User;

public interface IUserService {
    User selectById(int id);
}

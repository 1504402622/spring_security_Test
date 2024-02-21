package com.GLFS.service;

import com.GLFS.domain.ResponseResult;
import com.GLFS.domain.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();
}

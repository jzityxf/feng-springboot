package com.feng.securitshiro.service;

import com.feng.securitshiro.entity.UserInfo;  

public interface UserInfoService {  
  
    public UserInfo findByUsername(String username);  
  
}  
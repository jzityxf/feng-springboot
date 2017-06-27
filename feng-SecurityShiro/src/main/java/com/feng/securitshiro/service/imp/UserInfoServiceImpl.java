package com.feng.securitshiro.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.feng.securitshiro.entity.UserInfo;
import com.feng.securitshiro.repository.UserInfoRepository;
import com.feng.securitshiro.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
	private UserInfoRepository userInfoRepository;

	@Transactional(readOnly = true)
	@Override
	public UserInfo findByUsername(String username) {
		System.out.println("UserInfoServiceImpl.findByUsername()");
		return userInfoRepository.findByUsername(username);
	}

}
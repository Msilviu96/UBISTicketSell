package com.ubis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubis.entity.Account;
import com.ubis.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public Account getUserByUsername(String username) {
		return userRepository.findOne(username);
	}
	
	
}

package com.service;

import com.dto.User;

public interface UserService {
	int registerUser(User user);
	boolean Login(User user);
}
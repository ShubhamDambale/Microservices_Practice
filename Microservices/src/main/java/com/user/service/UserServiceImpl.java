package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	// fake user list 
	List<User> list = List.of(
			
			new User(1, "shubham dambale", "1478252369"),
			new User(2, "ranu mandal", "2563147895"),
			new User(3, "gagan pratap", "85214796354")
			
			);

	@Override
	public User getUser(Integer id) {
		
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}

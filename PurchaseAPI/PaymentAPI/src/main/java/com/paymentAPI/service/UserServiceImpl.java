package com.paymentAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentAPI.model.User;
import com.paymentAPI.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		List<User> result = new ArrayList<User>();
		List<User> players = userRepository.getAllUser();
		for (User player : players) {
			result.add(player);
		}
		return result;
	}

	@Override
	public User getUserById(Long id) {
		User user = new User();
		if(!userRepository.findByUserID(id).isEmpty()) {
			user = userRepository.findByUserID(id).get(0);
		}
		return user;
	}

	@Override
	public void addUser(String user_name, int user_level, String user_phone, String strDate, String endDate,
			String user_type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(String id, String user_name, int user_level, String user_phone, String strDate,
			String endDate, String user_type) {
		// TODO Auto-generated method stub
		
	}
	

}

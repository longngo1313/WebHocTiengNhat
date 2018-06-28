package com.paymentAPI.service;

import java.util.List;
import com.paymentAPI.model.User;


public interface UserService {

	public List<User> getAllUsers();
	public User getUserById(Long id);
	public void addUser(String user_name, int user_level, String user_phone, String strDate, String endDate, String user_type);
	public void updateUser(String id, String user_name, int user_level, String user_phone, String strDate, String endDate, String user_type);

}

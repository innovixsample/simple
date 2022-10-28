package com.sam.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.user.entity.User;
import com.sam.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	// insert the data into the table
	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}

	// delete the user data from the table
	public void delete(int id) {
		userRepository.deleteById(id);
	}

	// update the data into the table
	public void update(User user, int userid) {
		userRepository.save(user);
	}
}
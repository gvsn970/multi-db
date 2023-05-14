package com.example.pla.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pla.Dao.UserDaoImpl;
import com.example.pla.model.User;

@Service
public class UserService {

	@Autowired
	private UserDaoImpl userDao;

	public List<User> getAllUser() {
		return userDao.getAllUser();
	}
}

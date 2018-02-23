package com.eversec.graduation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eversec.graduation.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

	@Query("from User where telphonel=?1")
	public User getUserByPhone(String telphonel);
	@Query("from User where telphonel=?1 and pwd=?2")
	public User login(String phone,String pwd);
	
	
	
}

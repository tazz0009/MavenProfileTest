package com.tistory.tazz009.dao;

import java.sql.SQLException;

import com.tistory.tazz009.domain.User;

public interface UserDao {

	User findByUserId(String userId) throws SQLException;

	void insert(User user) throws SQLException;

}

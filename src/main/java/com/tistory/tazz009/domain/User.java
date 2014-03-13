package com.tistory.tazz009.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.tistory.tazz009.service.PasswordMismatchException;

public class User {

	private String userId;
	private String password;
	private String name;
	private String email;
	
	public User() {
	}
	
	public User(String userId, String password, String name, String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean matchPassword(String loginPassword) {
		if (loginPassword == null) {
			return false;
		}
		return loginPassword.equals(password);
	}

	public void update(User updateUser) throws PasswordMismatchException {
		if (!matchPassword(updateUser.password)) {
			throw new PasswordMismatchException();
		}
		this.password = updateUser.password;
		this.name = updateUser.name;
		this.email = updateUser.email;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}

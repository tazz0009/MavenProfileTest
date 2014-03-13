package com.tistory.tazz009.service;

public class ExistedUserException extends Exception {

	private String userId;

	public ExistedUserException(String userId) {
		this.userId = userId;
	}

}

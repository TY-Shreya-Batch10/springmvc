package com.tyss.spring.controller;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserBean implements Serializable{
	
	private String user;
	
	private String pwd;

}

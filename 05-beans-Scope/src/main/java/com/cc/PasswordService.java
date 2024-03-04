package com.cc;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordService {
	
	public PasswordService() {
		System.out.println("Password class constructor");
	}
	
	public String encPwd(String pwd) {

		
		Encoder encoder=Base64.getEncoder();
		byte [] encodedpwd=encoder.encode(pwd.getBytes());
		return new String(encodedpwd);
		
	}

}

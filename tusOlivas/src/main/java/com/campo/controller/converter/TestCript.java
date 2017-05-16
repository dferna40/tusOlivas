package com.campo.controller.converter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestCript {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
		System.out.println(pe.encode("user"));

	}

}

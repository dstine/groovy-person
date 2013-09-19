package com.example.service;

import com.example.domain.Person;

import java.util.HashMap;

public class PersonService {

	public static Person getJohnDoe() {
		return new Person("John", "Doe", 42);
	}

	public static Person getJaneRoe() {
		HashMap args = new HashMap();
		args.put("firstName", "Jane");
		args.put("lastName", "Roe");
		args.put("age", 41);
		return new Person(args);
	}
}

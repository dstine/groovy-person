package com.example.service;

import com.example.domain.Person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonServiceTest {

	@Test
	public void testJohnDoe() {
		Person john = PersonService.getJohnDoe();
		assertEquals(42, john.getAge());
		assertEquals("com.example.domain.Person(John, Doe, 42)", john.toString());
		assertEquals(-2064776228, john.hashCode());
	}

	@Test
	public void testJaneDoe() {
		Person jane = PersonService.getJaneRoe();
		assertEquals("Jane", jane.getFirstName());
		assertEquals("com.example.domain.Person(Jane, Roe, 41)", jane.toString());
		assertEquals(-2077118352, jane.hashCode());
	}


	@Test
	public void testEquals() {
		Person jane1 = PersonService.getJaneRoe();
		Person jane2 = PersonService.getJaneRoe();
		assertTrue(jane1.equals(jane2));

		Person alice = new Person("Alice", "Abernathy", 10);
		Person bob = new Person("Bob", "Builder", 11);
		assertFalse(alice.equals(bob));
	}
}

package com.epam.web;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveCharactersTest {
	RemoveCharactersClass object;
	@Before
	public void setUp() throws Exception {
		object = new RemoveCharactersClass();
	}

	@Test
	public void test4Characters1() {
		assertEquals("BCD", object.remove("ABCD"));
	}
	
	@Test
	public void test4Characters2() {
		assertEquals("CD", object.remove("AACD"));	
	}
	
	@Test
	public void test4Characters3() {
		assertEquals("BCD", object.remove("BACD"));
	}
	
	@Test
	public void test4Characters4() {
		assertEquals("BBAA", object.remove("BBAA"));
	}
	
	@Test
	public void testnCharacters() {
		assertEquals("BAA", object.remove("AABAA"));
	}
	
	@Test
	public void test0Characters() {
		assertEquals("", object.remove(""));
	}
	
	@Test
	public void test1Characters1() {
		assertEquals("", object.remove("A"));
	}
	
	@Test
	public void test1Characters2() {
		assertEquals("B", object.remove("B"));
	}
	
	@Test
	public void test2Characters1() {
		assertEquals("", object.remove("AA"));
	}
	
	@Test
	public void test2Characters2() {
		assertEquals("B", object.remove("AB"));
	}
	
	@Test
	public void test2Characters3() {
		assertEquals("B", object.remove("BA"));
	}
}

package com.manifestcorp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HandTester {

	private Hand cardHand;

	@Before
	public void before() {
		cardHand = new Hand();
	}

	@After
	public void after() {
		cardHand = null;
	}

	@Test
	public void test() {
		fail();
	}
}
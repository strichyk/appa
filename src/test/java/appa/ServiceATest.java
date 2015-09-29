package appa;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceATest {

	@Test
	public void testPlus() {
		IServiceA testServiceA = new ServiceA();
		assertEquals(20, testServiceA.plus(10, 10));
	}

}

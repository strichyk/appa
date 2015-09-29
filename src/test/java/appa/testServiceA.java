package appa;

import static org.junit.Assert.*;

import org.junit.Test;

public class testServiceA {

	@Test
	public void testPlus() {
		IServiceA testServiceA = new ServiceA();
		assertEquals(20, testServiceA.plus(10, 10));
		//fail("Not yet implemented");
	}

}

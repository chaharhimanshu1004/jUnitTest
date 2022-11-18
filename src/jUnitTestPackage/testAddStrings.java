package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String ans = junit.addStrings("Himanshu"," chahar");
		assertEquals("Himanshu chahar",ans);
//		fail("Not yet implemented");
	}

}

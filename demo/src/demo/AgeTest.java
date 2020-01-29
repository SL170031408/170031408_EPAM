 package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AgeTest {
		

	@Test
	public void test() {
		Age num=new Age();
		assertEquals(true,num.Pnc(4));
	}

	
}

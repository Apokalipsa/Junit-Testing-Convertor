package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import demo.Convertor;

public class ConvertorTest {
	private Convertor convert;

	@Before
	public void setUp() throws Exception {
		convert = new Convertor();
	}

	@After
	public void tearDown() throws Exception {
		convert = null;
	}

	@Test
	public void testCent2Inch() {
		double cent = 4;
		double formula = 0.39370079;
		double result = (cent * formula);

		assertEquals(1.57480316, result, 1e-15);

	}
	@Test
	public void testInch2Cent() {
		double inch = 2;
		double formula = 2.54;
		double result = (inch * formula);

		assertEquals(5.08, result, 1e-15);


	
	}
}


package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import demo.Methods;

public class ConvertorTest {
	private Methods convert;

	@Before
	public void setUp() throws Exception {
		convert = new Methods();
	}

	@After
	public void tearDown() throws Exception {
		convert = null;
	}

	@Test
	public void testCent2Inch() {

		assertEquals(1.968504, convert.cent2inch(5.0), 0.39370079);

	}

	@Test
	public void testInch2Cent() {

		assertEquals(5.08, convert.inch2cent(2.0), 2.54);

	}

	@Test
	public void testKg2Pounds() {

		assertEquals(3.30693393, convert.kg2pounds(1.5), 2.20462262);

	}

	@Test
	public void testPounds2Kg() {

		assertEquals(1.81436948, convert.pounds2kg(4), 0.45359237);

	}

	@Test
	public void testCel2Far() {

		assertEquals(89.6, convert.cel2far(32), 1e-15);

	}

	@Test
	public void testFar2Cel() {

		assertEquals(10.0, convert.far2cel(50), 1e-15);

	}
}

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(10, 20);
		assertEquals(30,calc.getResult());
	}
	
	@Test
	public void testSub() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.sub(10, 20);
		assertEquals(-10,calc.getResult());
	}
	
	@Test

	public void testMul() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.mul(10, 20);
		assertEquals(200,calc.getResult());
	}
	@Test
	public void testDiv() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.div(20, 10);
		assertEquals(2,calc.getResult());

	}

}

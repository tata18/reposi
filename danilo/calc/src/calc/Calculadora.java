package calc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Calculadora {
	
	CalculadoraTeste calc = new CalculadoraTeste();
	 @Before

	@Test
	public void test() {
		assertEquals(5, calc.somar(2,3));
		assertTrue("teste ok", calc.somar(0, 1)==1);
		assertTrue("teste false", calc.somar(0, 1)!=1);
		assertNotEquals("erro", calc.somar(2, 7) ==5);
	}
}

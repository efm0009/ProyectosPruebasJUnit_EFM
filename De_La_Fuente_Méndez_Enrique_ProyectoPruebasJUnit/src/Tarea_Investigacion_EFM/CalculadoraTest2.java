package Tarea_Investigacion_EFM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

	@Test
	public void testSumarConNegativos() {
		
	    Calculadora calc = new Calculadora();
	    assertEquals(-1, calc.sumar(2, -3)); // 2 + (-3) = -1

	}

}

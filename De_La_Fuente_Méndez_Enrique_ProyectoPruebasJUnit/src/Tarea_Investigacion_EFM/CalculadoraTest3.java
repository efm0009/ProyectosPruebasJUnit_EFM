package Tarea_Investigacion_EFM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest3 {

	@Test
	public void testSumarConCero() {

	    Calculadora calc = new Calculadora();
	    assertEquals(10, calc.sumar(10, 0)); // 10 + 0 = 10

	}

}

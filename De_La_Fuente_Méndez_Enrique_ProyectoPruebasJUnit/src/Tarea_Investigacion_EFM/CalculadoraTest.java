package Tarea_Investigacion_EFM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
    public void testSumar() {
		
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3)); // 2 + 3 = 5

    }

}

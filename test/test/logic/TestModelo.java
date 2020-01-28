package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		setUp2();
		assertEquals(CAPACIDAD, modelo.darTamano());
		modelo.agregar(""+666);
		assertEquals(CAPACIDAD + 1, modelo.darTamano());
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		modelo.agregar(""+333);
		modelo.agregar(""+666);
		assertEquals(2, modelo.darTamano());
		assertEquals(modelo.buscar(""+333), "333");
	}
	
	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
		assertEquals("6", modelo.buscar("6"));
		assertEquals("99", modelo.buscar(""+99));
		assertTrue(modelo.buscar(""+100)==null);
		
	}

	@Test
	public void testEliminar() {
		setUp2();
		modelo.agregar(""+3);
		modelo.agregar(""+3);
		assertTrue(modelo.buscar(""+3)!=null);
		modelo.eliminar(""+3);
		assertTrue(modelo.buscar(""+3)==null);
		assertEquals(modelo.darTamano(), 99);
		
		
		
	}

}
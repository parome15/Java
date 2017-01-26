package org.foobarspam.Test_Year_Bisiesto;

import static org.junit.Assert.*;

import org.foobarspam.Bisiesto.Yearclass.*;

import org.junit.Test;


public class Year_Testing {

	// Tenemos que los años bisiestos tienen terminaciones en: 0,2,4,6,8 aparte de estos
	// encontramos que cada multiplo de 400 tambien es bisiesto, pero en cambio multiplos
	// de 100 no lo son. 	
	
	@Test
	public void test_esBisiesto_cuatro() {
	Year any = new Year(1904);
	assertEquals("test año bisiesto acabado en 4", true, any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_seis(){
	Year any = new Year(2016);
	assertEquals("test año bisiesto acabado en 6", true, any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_ocho(){
	Year any = new Year(1908);
	assertEquals("test año bisiesto acabado en 8", true, any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_dos(){
	Year any = new Year(1912);
	assertEquals("test año bisiesto acabado en 2", true, any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_cero(){
	Year any = new Year(2000);
	assertEquals("test año bisiesto acabado en 0", true, any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_cuatrocientos(){
	Year any = new Year(400);
	assertEquals("test año bisiesto acabado en 400", true, any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_cien(){
	Year any = new Year(2100);
	assertEquals("test año no bisiesto acabado en 100", false, any.esBisiesto());
	}
	
}
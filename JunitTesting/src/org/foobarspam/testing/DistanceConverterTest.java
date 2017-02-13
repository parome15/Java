package org.foobarspam.testing;

import static org.junit.Assert.*;
import org.foobarspam.distanceconverter.*;
import org.junit.Before;
import org.junit.Test;


public class DistanceConverterTest {
	double feet, meters, inches, cm;
	
	@Before
	public void setUp() {
		
		feet = 1;
		meters = 1;
		cm = 10;

	}
	
	@Test
	public void testConvertFeettoMeters() {
		meters = DistanceConverter.convertFeettoMeters(feet);
		assertEquals(meters, 0.3048, 0.001);
	}

	@Test
	public void testConvertMeterstoFeet() {
		feet = DistanceConverter.convertMeterstoFeet(meters);
		assertEquals(3.281, feet, 0.001);
	}

	@Test
	public void testConvertFeettoInches() {
		inches = DistanceConverter.convertFeettoInches(feet);
		assertEquals(12, inches, 0.001);
	}

	@Test
	public void testConvertInchestoFeet() {
		inches = 12;
		feet = DistanceConverter.convertInchestoFeet(inches);
		assertEquals(1, feet, 0.001);
	}

	@Test
	public void testConvertCmtoFeet() {
		feet = DistanceConverter.convertCmtoFeet(cm);
		assertEquals(0.3281, feet, 0.001);
	}

	@Test
	public void testConvertFeettoCm() {
		cm = DistanceConverter.convertFeettoCm(feet);
		assertEquals(30.48, cm, 0.001);
	}

	@Test
	public void testConvertCmtoInches() {
		inches = DistanceConverter.convertCmtoInches(cm);
		assertEquals(3.9371, inches, 0.001);
	}

	@Test
	public void testConvertInchestoCm() {
		inches = 10;
		cm = DistanceConverter.convertInchestoCm(inches);
		assertEquals(25.4, cm, 0.001);
	}
}
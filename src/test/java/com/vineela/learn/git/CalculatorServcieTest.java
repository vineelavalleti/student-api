package com.vineela.learn.git;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.vineela.learn.git.service.CalculatorServcie;

@ExtendWith(MockitoExtension.class)
public class CalculatorServcieTest {
	
	
	
	@Test
	public void calculatorService_add_success() {
		CalculatorServcie ser = new CalculatorServcie();
		int actualValue = ser.add(20, 10);
		assertEquals(30, actualValue);
		
	}
	
	
	@Test
	public void calculatorService_sub_success() {
		CalculatorServcie ser = new CalculatorServcie();
		int actualValue = ser.sub(20, 10);
		assertEquals(10, actualValue);
		
	}
	
	
	@Test
	public void calculatorService_getLength_PositiveScceanrio() {
		try {
			CalculatorServcie ser = new CalculatorServcie();
			int actualValue = ser.getMessageLength("Vineela");
			assertEquals(7, actualValue);		
		} catch (Exception ex) {
			fail();
		}
	}
	
	@Test
	public void calculatorService_getLength_NegativeScceanrio_NullPointer() {
		CalculatorServcie ser = new CalculatorServcie();
		try {
			int actualValue = ser.getMessageLength(null);
			
			fail();
			
		} catch(NullPointerException ex) {
			
		}
		
			
	}
	

}

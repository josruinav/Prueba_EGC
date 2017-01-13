package EGC.Prueba_EGC;

import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.Assert;



public class PruebaDeveloperTest{


	
	@Test
	public void testPruebaEGC(){
		
		Prueba prueba = new Prueba();
		
		double result = Prueba.factorial(8);
		
		System.out.println(result);
		
		Assert.assertTrue(result == 40320.0);
		
		
	
	}
	
}
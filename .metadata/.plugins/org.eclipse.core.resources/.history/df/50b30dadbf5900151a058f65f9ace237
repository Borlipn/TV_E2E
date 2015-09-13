package core.Junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class PrimeNumber_JunitParamet_Contractor {

	//Fields
	
	private int inputNum;
	private boolean expected;
	
		//Constructor
	   // Each parameter should be placed as an argument here
	   // Every time runner triggers, it will pass the arguments
	   // from parameters we defined in primeNumbers() method
	public PrimeNumber_JunitParamet_Contractor (int Prime_Numbers, boolean expectedResult) {
		this.expected = expectedResult;
		this.inputNum = Prime_Numbers;
	}
	//Test data generator
	
	@Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
    	 return Arrays.asList(new Object[][]     {
        	   
        	   {1, false},
        	   {2, true},
        	   {3, true},
        	   {4, false},
        	   {5, false},
        					});}


	@Test
    public void testPrimeNumber() {
    	PrimeNumber add = new PrimeNumber();
   //System.out.println("Is " + inputNum + " a prime number? - " + expected);
    assertEquals(expected, add.isPrime(inputNum));
    }
}


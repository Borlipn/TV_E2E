package core.TV_E2E;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class Junit_Selenium_Webdriver_TestCases {

	@BeforeClass
	public static void BeforeClass01() throws Exception {
	}
	@Parameter(value =0)
	public String  test_id;
	
    @Parameter(value = 1)
    public String expected_Result;

	
    @Parameter(value = 2)
    public String actual_Result;
	
	@Parameters(name = "Iteration # {index}: Expected: {1}; Actualy {2}")
    public static Collection<String[]> data() throws Exception {
    	
    	core.TV_E2E.TV_Selenium  data_from_cvs = new core.TV_E2E.TV_Selenium();
    	 return Arrays.asList(data_from_cvs.Array2D());
    	 																}

	@Test
	public void Test_TV_Verification() {
		System.out.print("\n Test Case: " + test_id + "\n Expected Result: " + expected_Result + "\n Actual Result: " + actual_Result);
		assertEquals("FAILED", expected_Result, actual_Result);
	}

}

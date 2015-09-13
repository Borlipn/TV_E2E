package core.TV_E2E;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class TV_Selenium {
	
	public String[][] Array2D() throws IOException {
		
		//read from source file by use BufferedReader
		String csvFile = "./src/main/resources/properte_file_CSV.csv";
		BufferedReader br = null;
		String line = null;
		int lines = 0;
		int columns = 0;
		String SplitBy = ",";
		String[] column;
		String test_case_id = null;
		String url = null;
		String title_expected = null;
		
			//counting lines and columns
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				lines++;
				column = line.split(SplitBy);
				columns = column.length;
													}
			br.close();
			 
		String WebsiteTitleArray[][] = new String [lines][columns];
		br = new BufferedReader(new FileReader(csvFile));
		 WebDriver driver = new ChromeDriver();
		//WebDriver driver = new HtmlUnitDriver();
		//WebDriver driver = new FirefoxDriver();
		int i =0;
		while ((line = br.readLine()) != null) {
			String[] csv = line.split(SplitBy);
			
			test_case_id = csv[0];
			url = csv[1];
			title_expected = csv[2];
			
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			String title_actual = driver.getTitle();
						
			WebsiteTitleArray[i][0] = test_case_id ;
			WebsiteTitleArray[i][1] = title_expected ;
			WebsiteTitleArray[i][2] = title_actual ;
			
			i++;
												}
		driver.quit();
		br.close();
		return WebsiteTitleArray;
		}}

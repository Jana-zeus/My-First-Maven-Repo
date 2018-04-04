package testAutoCompanyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CompanyTabTest
{
    @Test
	public void CompanyTest() throws InterruptedException 
	{
    	System.setProperty("webdriver.gecko.driver","E:\\Testing Tools\\geckodriver-v0.20.0-win64\\geckodriver.exe\\");
		System.out.println("Test Started");
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://localhost:51589/Account/Login?ReturnUrl=%2f");
	 // driver.get("http://dev.ls2software.com/Account/Login?ReturnUrl=%2f ");
		     
		     driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("level0@baczor.com");
			 driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Level0&ls2");
			 driver.findElement(By.xpath("/html/body/div[1]/form/div[2]/div[3]/div/button")).click();
			 System.out.println("Login- Success");
			     
			 	 Thread.sleep(2000);
				//Selecting the companies tab
				 driver.findElement(By.xpath("/html/body/div[6]/nav/div/div[2]/ul/li[5]/a")).click();
				 
				//Clicking the Add button.      
			      Thread.sleep(5000);
			      driver.findElement(By.xpath("//*[contains(@class,'col-sm-3')]")).click();
			      System.out.println("Company Add page Opened");
				 
			    //Add company page
			      Thread.sleep(2000);
			      Select drop1 = new Select(driver.findElement(By.xpath("//*[@id=\"companytype-select\"]")));
			      drop1.selectByVisibleText("Landlord");
			      
			      Thread.sleep(2000);
			      driver.findElement(By.xpath("//*[@id=\"Company_FullName\"]")).sendKeys("Jana Demo");
			      driver.findElement(By.xpath("//*[@id=\"Company_CommonName\"]")).sendKeys("Ja_cop");
			      driver.findElement(By.xpath("//*[@id=\"CompanyAddresses_0__AddressLine1\"]")).sendKeys("#45, First Cross St");
			      driver.findElement(By.xpath("//*[@id=\"CompanyAddresses_0__AddressLine2\"]")).sendKeys("Mount road");
			      driver.findElement(By.xpath("//*[@id=\"CompanyAddresses_0__AddressLine3\"]")).sendKeys("Chennai");
			      driver.findElement(By.xpath("//*[@id=\"state-textbox-0\"]")).sendKeys("Tamilnadu");
			      driver.findElement(By.xpath("//*[@id=\"CompanyAddresses_0__PostCode\"]")).sendKeys("600010");
			      driver.findElement(By.xpath("//*[@id=\"Company_Reference\"]")).sendKeys("Refer");
			      driver.findElement(By.xpath("//*[@id=\"Company_WebSite\"]")).sendKeys("www.sample_website.com");
			      driver.findElement(By.xpath("//*[@id=\"Company_Switchboard\"]")).sendKeys("Switchboard");
			      
			      Thread.sleep(2000);
			
			      Select drop2 = new Select(driver.findElement(By.xpath("//*[@id=\"CompanyAddresses_0__Country_Code\"]")));
			      drop2.selectByVisibleText("India");
			      
			    //*[@id="Company_FiscalYearStart"]
			      driver.findElement(By.xpath("//*[@id=\"Company_FiscalYearStart\"]")).sendKeys("5/3/2018");
			      
			      Select drop3 = new Select(driver.findElement(By.xpath("//*[@id=\"client-select\"]")));
			      drop3.selectByVisibleText("Demo");
			      System.out.println("All the Mandatory Fields are entered.");
			      
			      
			      Thread.sleep(2000);
			      driver.findElement(By.id("btnSave")).click();
			      System.out.println("New Company saved  to the Client List");
			      
			     Thread.sleep(10000);
			      driver.findElement(By.xpath("//*[@id=\"btnClosecurrentMessage\"]")).click();
			      
			      Thread.sleep(2000);
			      Select drop4 = new Select(driver.findElement(By.xpath("//*[@id=\"client-combobox\"]")));
			      drop4.selectByVisibleText("Demo");
			      
			      Thread.sleep(1000);
			      Select drop5 = new Select(driver.findElement(By.xpath("//*[@id=\"type-combobox\"]")));
			      drop5.selectByVisibleText("Landlord");
			      System.out.println("Saved company has viewed form the list");
			    
			    //Click the Company to open details(Path to delete the added company)  
			      Thread.sleep(5000);
			      driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[2]/table/tbody/tr/td[1]")).click();
			      Thread.sleep(5000);
			      driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();  //Edit button (Path to Delete added company)
			      Thread.sleep(2000);
			      driver.findElement(By.xpath("//*[@id=\"btnDelete\"]")).click(); //Delete button
			      Thread.sleep(2000);
			      driver.findElement(By.xpath("//*[@id=\"btnYes\"]")).click(); //Delete confirmation ( NO/Yes )
			     // String text1 = driver.findElement(By.xpath("")).getText();
			     // System.out.println(text1);
			      System.out.println("Newly added company-'DELETED' ");
			      System.out.println("Test Completed Successfully");

		  
		
	}
	
}

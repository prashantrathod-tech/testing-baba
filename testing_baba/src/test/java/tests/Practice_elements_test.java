package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages_Utility.Practice_elements;

public class Practice_elements_test extends BaseLibrary
{
	Practice_elements ob;
   @BeforeTest
	public void launchurl() throws InterruptedException
	{	
		launchUrl();
		ob=new Practice_elements();
	
	}
   
	@Test(priority = 0)
	public void clickonclose()
	{
		ob.clickonelement();
	}
	@Test(priority = 1)
	public void clickontextbo()
	{
		ob.clickontexbox();
	}
	@Test(priority = 2)
	public void introduction()
	{
		ob.intro();
	}
	/*@AfterTest
	public void close()
	{
		driver.quit();
	}
*/
}

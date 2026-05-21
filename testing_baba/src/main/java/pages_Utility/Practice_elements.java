package pages_Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Practice_elements extends BaseLibrary
{
	public Practice_elements() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@class='btn btn-block p-0 text-left']")
	private WebElement element;
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement textbox;
	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement fullname;
	@FindBy(xpath = "//input[@id='fullemail1']")
	private WebElement email;
	@FindBy(xpath = "//textarea[@id='fulladdresh1']")
	private WebElement c_address;
	@FindBy(xpath = "//textarea[@id='paddresh1']")
	private WebElement p_address;
	@FindBy(xpath = "//input[@class='btn btn-success']")
	private WebElement submit;
	
	
	public void clickonelement()
	{
		element.click();
	}
	public void clickontexbox()
	{
		textbox.click();
	}
	public void intro()
	{
		fullname.sendKeys(getreadData(0, 2, 0));
		email.sendKeys(getreadData(0, 2, 1));
		c_address.sendKeys(getreadData(0, 2, 2));
		p_address.sendKeys(getreadData(0, 2, 3));
		submit.click();
	}
	
	

}

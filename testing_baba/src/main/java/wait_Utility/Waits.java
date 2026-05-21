package wait_Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Waits 
{
	WebElement waitForElementClickable(By locator, int seconds); 
	WebElement waitForElementVisible(By locator, int seconds);

}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LoginPage {

	
	public WebDriver driver;
	
	By username=By.cssSelector("[name='username']");
	By password=By.cssSelector("[name='password']");

	By login=By.cssSelector("[type='submit']");
	By forgotPassword = By.cssSelector("[href*='https://phptravels.com/blog/forgot-password']");
	

	public LoginPage() {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

	
}

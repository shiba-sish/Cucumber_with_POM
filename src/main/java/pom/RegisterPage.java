package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	public WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
        this.driver = driver;
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
  }
	
	@FindBy(xpath = "//input[@name='name']")
    public WebElement usernameField;
  
    @FindBy(xpath="//input[@name='password']")
    public WebElement passwordField;
     
  
    @FindBy(xpath = "//button[@class='btn text-light']")
    public  WebElement registerButton;
    
    
 // Set user name in textbox
    public void setUserName(String strUserName) {
    	usernameField.sendKeys(strUserName);
    }
  
    // Set password in password textbox
    public void setPassword(String strPassword) {
    	passwordField.sendKeys(strPassword);
    }
  
    // Click on login button
    public void clickRegisterButton() {
    	registerButton.click();
    }
}

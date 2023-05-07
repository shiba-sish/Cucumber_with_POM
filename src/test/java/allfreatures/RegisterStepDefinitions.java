package allfreatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.RegisterPage;

public class RegisterStepDefinitions 
{
	public WebDriver driver;
  
	@Given("^The user is already in the register page of ecoders$")
	public void the_user_is_already_in_the_register_page_of_ecoders() throws InterruptedException {
	    driver = new ChromeDriver();
	    Thread.sleep(2000);
	    driver.get("http://127.0.0.1:5000/register");
	    Thread.sleep(2000);
	}

	@When("^The user enters a new username$")
	public void the_user_enters_a_new_username() throws InterruptedException {
	    //find the username field. 
//		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Choose a username']"));
//		usernameField.sendKeys("amar1");
//		Thread.sleep(2000);
		RegisterPage rp  = new RegisterPage(driver);
		rp.setUserName("amar3");
		Thread.sleep(2000);
	}

	@When("^The user enters a new password$")
	public void the_user_enters_a_new_password() throws InterruptedException {
		// find the password field.
//		WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter your password.']"));
//		passwordField.sendKeys("abc123");
//		Thread.sleep(2000);
		
		RegisterPage rp  = new RegisterPage(driver);
		rp.setPassword("abc123");
		Thread.sleep(2000);
	}

	@When("^The user clicks on the register button$")
	public void the_user_clicks_on_the_register_button() {
		// find the register button and click on it.
//		WebElement registerButton = driver.findElement(By.xpath("//button[@class='btn btn-sm m-3 btn-outline-success']"));
//		registerButton.click();
		
		RegisterPage rp  = new RegisterPage(driver);
		rp.clickRegisterButton();
		
	}

	@Then("^The user should get navigated to the login page of ecoders$")
	public void the_user_should_get_navigated_to_the_login_page_of_ecoders() throws InterruptedException {
		// verify the title of the login page. 
         Thread.sleep(2000);
         String actualTitle = driver.getTitle();
         System.out.println(actualTitle);
         String expectedTitle = "FLASK-CRUD_APP_login_page.";
         if(expectedTitle.equals(actualTitle)) {
        	 System.out.println("Test case passed, Title is matching, New User Registration passed.");
         }
         else {
        	 System.out.println("Test Case Failed, Unable to register a new user.");
         }
         
         // close the browser
         Thread.sleep(3000);
         driver.quit();
	}
}

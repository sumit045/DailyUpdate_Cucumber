package stepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sprint_1 {
	
	WebDriver driver;
	@Given("^User launch browser$")
	public void User_launch_browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@And("^User open Amazon$")
	public void User_open_Amazon()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
}

package Stepdefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.Registerpage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration  {
	public WebDriver driver;
	
	Registerpage Registerpg;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Registerpg= new Registerpage(driver);
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("User enter personal information")
	public void user_enter_personal_information() {
		
		Registerpg.setFirstName("Ankit");
		Registerpg.setLastName("K");
		Registerpg.setAddress("56 sawantpark");
		Registerpg.setcity("Pune");
		Registerpg.setstateName("Maharastra");
		Registerpg.setzipcode("411043");
		Registerpg.setphone("7644557545");
		Registerpg.setssn("AFGHH6567");
		Registerpg.setusername("Sigma@234565");
		Registerpg.setpassword("Para@2182");
		Registerpg.setconfirmpassword("Para@2182");

	}

	@When("Click on Register")
	public void click_on_register() {
		
		Registerpg.clickonregisterbutton();

	}

	@Then("Page text should be {string}")
	public void page_text_should_be(String expectedtext) {
		
		String text=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")).getText();
		if(text.equals(expectedtext)) {
			Assert.assertTrue(true);
		}
		else {
			
			Assert.assertTrue(false);
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		Registerpg.clickonlogoutbutton();

	}
	
	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedtext1) {
		
		String text1=driver.getTitle();
		if(text1.equals(expectedtext1)) {
			Assert.assertEquals(text1, expectedtext1);
		}
		else {
			
			Assert.assertTrue(false);
		}
	}

	@Then("close browser")
	public void close_browser() {
		
		driver.quit();

	}

}

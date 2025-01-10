package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Basepage {

	public Registerpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\'customer.firstName\']")
	WebElement Firstaname;

	@FindBy(xpath = "//*[@id=\"customer.lastName\"]")
	WebElement Lastname;

	@FindBy(name = "customer.address.street")
	WebElement Address;

	@FindBy(name = "customer.address.city")
	WebElement City;

	@FindBy(name = "customer.address.state")
	WebElement Statename;

	@FindBy(name = "customer.address.zipCode")
	WebElement Zipcode;

	@FindBy(name = "customer.phoneNumber")
	WebElement Phone;

	@FindBy(id = "customer.ssn")
	WebElement SSN;

	@FindBy(name = "customer.username")
	WebElement Username;

	@FindBy(name = "customer.password")
	WebElement Password;

	@FindBy(name = "repeatedPassword")
	WebElement Confirm;
	
	@FindBy(xpath = "//*[@id=\'customerForm\']/table/tbody/tr[13]/td[2]/input")
	WebElement registerbutton;
	
	@FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[8]/a")
	WebElement logout;
	

	public void setFirstName(String fname) {
		Firstaname.sendKeys(fname);

	}

	public void setLastName(String lname) {
		Lastname.sendKeys(lname);

	}

	public void setAddress(String address) {
		Address.sendKeys(address);

	}

	public void setcity(String city) {
		City.sendKeys(city);
	}

	public void setstateName(String state) {
		Statename.sendKeys(state);

	}

	public void setzipcode(String zipcode) {
		Zipcode.sendKeys(zipcode);

	}

	public void setphone(String phone) {
		Phone.sendKeys(phone);

	}

	public void setssn(String ssn) {
		SSN.sendKeys(ssn);

	}
	
	public void setusername(String username) {
		Username.sendKeys(username);

	}

	public void setpassword(String password) {
		Password.sendKeys(password);

	}

	public void setconfirmpassword(String confirm) {
		Confirm.sendKeys(confirm);

	}
	
	public void clickonregisterbutton()
	{
		registerbutton.click();
	}
	
	public void clickonlogoutbutton()
	{
		logout.click();
	}
}

package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	WebDriver driver;
	
	public MyAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="floatRigth ng-scope") WebElement editDetailsLink;
	
	@FindBy(name="first_nameAccountDetails") WebElement firstName;
	@FindBy(name="last_nameAccountDetails") WebElement lastName;
	@FindBy(name="phone_numberAccountDetails") WebElement phoneNumber;
	@FindBy(name="countryListboxAccountDetails") WebElement country;
	@FindBy(name="cityAccountDetails") WebElement city;
	@FindBy(name="addressAccountDetails") WebElement address;
	@FindBy(name="postal_codeAccountDetails") WebElement postalCode;
	@FindBy(name="state_/_province_/_regionAccountDetails") WebElement state;
	
	//for payment preference
	@FindBy(className="floatRigth ng-scope") WebElement paymentPrefference;
	
	@FindBy(xpath="//img[@alt='Master credit']") WebElement masterCard;
	@FindBy(id="creditCard") WebElement masterCardnumber;
	@FindBy(name="cvv_number") WebElement masterCardpin;
	@FindBy(name="mmListbox") WebElement masterCardyear;
	@FindBy(name="yyyyListbox") WebElement masterCardmonth;
	@FindBy(name="cardholder_name") WebElement masterCardname;
	@FindBy(name="save_master_credit") WebElement masterCardcheckbox;
	
	@FindBy(xpath="//img[@alt='Safepay']") WebElement Safepay;
	@FindBy(name="safepay_username") WebElement SafepayUsername;
	@FindBy(name = "SafePay password") WebElement SafepayPassword;
	@FindBy(name="preferred_payment_safepay") WebElement SafepayCheckbox;
	
	//saving the card
	@FindBy(xpath="//button[@id='save_btn']") WebElement saveButton;
	
	@FindBy(xpath="//div[@class='deleteBtnText']") WebElement deleteAccountButton;
	
	public WebElement getEditDetailsLink() {
		return editDetailsLink;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getPostalCode() {
		return postalCode;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getpaymentprefference() {
		return paymentPrefference;
	}
	public WebElement getmasterCard() {
		return masterCard;
	}
	public WebElement getmasterCardnumber() {
		return masterCardnumber;
	}
	public WebElement getmasterCardpin() {
		return masterCardpin;
	}
	public WebElement getmasterCardyear() {
		return masterCardyear;
	}
	public WebElement getmasterCardmonth() {
		return masterCardmonth;
	}
	public WebElement getmasterCardname() {
		return masterCardname;
	}
	public WebElement getmasterCardcheckbox() {
		return masterCardcheckbox;
	}
	public WebElement getSafepay() {
		return Safepay;
	}
	public WebElement getSafepayUsername() {
		return SafepayUsername;
	}
	public WebElement getSafepayPassword() {
		return SafepayPassword;
	}
	public WebElement getSafepayCheckbox() {
		return SafepayCheckbox;
	}
	public WebElement getsaveButton() {
		return saveButton;
	}
	public WebElement getdeleteAccountButton() {
		return deleteAccountButton;
	}
}

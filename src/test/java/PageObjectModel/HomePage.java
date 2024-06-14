package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver = null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Home page links
	By speakers = By.id("speakersImg");
	By tablet = By.xpath("//div[@id='tabletsImg']");
	By laptop = By.className("laptopImg categoryCell");
	By mice = By.id("miceImg");
	By headphone = By.cssSelector("div[id='headphonesImg']");
	By specialOffer = By.xpath("//a[normalize-space()='SPECIAL OFFER']");
	By slidingPanel = By.xpath("//div[@className ='explore_now_btn']");
	By popularItem = By.xpath("//a[normalize-space()='POPULAR ITEMS']");
	By contactUs = By.xpath("//a[normalize-space()='CONTACT US']");
	By search = By.id("menuSearch");
	By account = By.id("menuUserLink");
	By cart = By.id("menuCart");
	By help = By.id("menuHelp");
	
	//User defined methods
	public WebElement speakers() {
		return driver.findElement(speakers);
    }
	public WebElement tablet() {
		return driver.findElement(tablet);
	}
	public WebElement laptop() {
		return driver.findElement(laptop);
    }
	public WebElement mice() {
		return driver.findElement(mice);
	}
	public WebElement headphone() {
		return driver.findElement(headphone);
    }
	public WebElement specialOffer() {
		return driver.findElement(specialOffer);
	}
	public WebElement slidingPanel() {
		return driver.findElement(slidingPanel);
	}
	public WebElement popularItem() {
		return driver.findElement(popularItem);
	}
	public WebElement contactUs() {
		return driver.findElement(contactUs);
	}
	public WebElement account() {
		return driver.findElement(account);
	}
	public WebElement search() {
		return driver.findElement(search);
	}
	public WebElement cart() {
		return driver.findElement(cart);
	}
	public WebElement help() {
		return driver.findElement(help);
	}
}

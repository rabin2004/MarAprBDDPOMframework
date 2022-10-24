package pageFactoryPkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class HomePage extends MainClass{
	// 1. Creating webElement -> @FindBy
	@FindBy(id="twotabsearchtextbox")
	WebElement searchTxtBox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchBtn;
	
	@FindBy(id="nav-link-accountList")
	WebElement accountList;
	
	// 2. Initialize webElement created to driver instance -> in constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	// 3. Action to be performed on webElement & page -> method
	public void enterProductInSearchField(String product) {
		searchTxtBox.sendKeys(product);
	}
	
	public void clickSearchBtn() {
		searchBtn.click();	
	}
	
	public void hittingEnterKey() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	public String returnHomePageTitle() {
		return driver.getTitle();
	}
	
	public void clickAccountList() {
		accountList.click();
	}
	
}

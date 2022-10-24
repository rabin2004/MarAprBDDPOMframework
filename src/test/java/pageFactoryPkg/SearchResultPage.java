package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class SearchResultPage extends MainClass{
	@FindBy(xpath="//div[@class='a-row']/span[1]")
	WebElement noResultErrorMsg;
	
	@FindBy(xpath="//span[@class='a-color-state a-text-bold']")
	WebElement productSearched;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateVisibiltyOfNoResultErrorMsg() {
		return noResultErrorMsg.isDisplayed();
	}
	
	public String returnNoResultErrorMsg() {
		return noResultErrorMsg.getText();
	}
	
	public String searchResultPageTitle() {
		return driver.getTitle();
	}
	
	public String actualProductSearchedMsgValidation() {
		return productSearched.getText();
	}

}

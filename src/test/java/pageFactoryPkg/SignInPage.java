package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class SignInPage extends MainClass{

	@FindBy(id="ap_email")
	WebElement userEmailAdd;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	public SignInPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserEmailAddress(String email) {
		userEmailAdd.sendKeys(email);
	}
	
	public void clickContinueBtn() {
		continueBtn.click();
	}
}

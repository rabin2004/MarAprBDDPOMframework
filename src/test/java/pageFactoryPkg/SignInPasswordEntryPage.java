package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class SignInPasswordEntryPage extends MainClass{
	
	@FindBy(id="ap_password")
	WebElement passwordTxtBox;
	
	@FindBy(id="signInSubmit")
	WebElement signInBtn;
	
	@FindBy(xpath="//span[@class='a-list-item']")
	WebElement loginErrorMsg;

	public SignInPasswordEntryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String password) {
		passwordTxtBox.sendKeys(password);
	}
	
	public void clickSignInBtn() {
		signInBtn.click();
	}
	
	public boolean validateLoginErrorMsg() {
		return loginErrorMsg.isDisplayed();
	}
}

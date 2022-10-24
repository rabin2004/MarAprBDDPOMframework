package stepDefination;

import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;
import pageFactoryPkg.SignInPage;
import pageFactoryPkg.SignInPasswordEntryPage;

public class LoginFunctionalityTest extends MainClass{
	String username = "test@gmail.com";
	String password = "test@123";
	String partialHomePageTitle = "Amazon.com";
	
	HomePage hp = new HomePage();
	SignInPage sip = new SignInPage();
	SignInPasswordEntryPage sipep = new SignInPasswordEntryPage();
	
	@Given("customer is in home page")
	public void customer_is_in_home_page() {
		Assert.assertTrue(hp.returnHomePageTitle().contains(partialHomePageTitle));
	}

	@And("clicks account list option")
	public void clicks_account_list_option() {
		hp.clickAccountList();
	}

	@When("customer enters invalid username")
	public void customer_enters_invalid_username() {
		sip.enterUserEmailAddress(username);
	}

	@And("clicks continue button")
	public void clicks_continue_button() {
		sip.clickContinueBtn();
	}

	@And("enters invalid password")
	public void enters_invalid_password() {
		sipep.enterPassword(password);
	}

	@And("clicks Sign in button")
	public void clicks_sign_in_buttong() {
		sipep.clickSignInBtn();
	}

	@Then("should show login error message")
	public void should_show_login_error_message() {
		Assert.assertTrue(sipep.validateLoginErrorMsg());
	}
}

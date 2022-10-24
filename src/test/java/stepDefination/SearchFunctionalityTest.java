package stepDefination;

import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;
import pageFactoryPkg.SearchResultPage;

public class SearchFunctionalityTest extends MainClass{
	String productForSearch = "apple";
	String invalidProductForSearch = "#*&#*()$KFNLKDFNDLKFNDLKFNLKNq092472834723894738924732894";
	String expectedPartialPageTitle = "Amazon.com";
	HomePage hp = new HomePage();
	SearchResultPage srp = new SearchResultPage();
	
	@Given("customer is in homepage")
	public void customer_is_in_homepage() {
		Assert.assertTrue(hp.returnHomePageTitle().contains(expectedPartialPageTitle));
	}

	@When("customer types in valid product in search text field")
	public void customer_types_in_valid_product_in_search_text_field() {
		hp.enterProductInSearchField(productForSearch);
	}

	@And("clicks search button")
	public void clicks_search_button() {
		hp.clickSearchBtn();
	}

	@Then("customer should be taken to search result page")
	public void customer_should_be_taken_to_search_result_page() {
		Assert.assertTrue(srp.searchResultPageTitle().contains(productForSearch));
	}

	@And("should be able to see related products")
	public void should_be_able_to_see_related_products() {
	  Assert.assertTrue(srp.actualProductSearchedMsgValidation().contains(productForSearch));
	}
	
	@When("hits enter key")
	public void hits_enter_key() {
	    hp.hittingEnterKey();
	}
	
	@When("customer types in invalid product in search text field")
	public void customer_types_in_invalid_product_in_search_text_field() {
		hp.enterProductInSearchField(invalidProductForSearch);
	}
	
	@Then("should see no result message")
	public void should_see_no_result_message() {
		Assert.assertTrue(srp.validateVisibiltyOfNoResultErrorMsg());
	}
	
	@When("^customer types in valid (.+) in search text field$")
    public void customer_types_in_valid_in_search_text_field(String product) {
		hp.enterProductInSearchField(product);
    }

    @Then("^customer should be taken to (.+) search result page$")
    public void customer_should_be_taken_to_search_result_page(String product) {
    	Assert.assertTrue(srp.searchResultPageTitle().contains(product));
    }

    @And("^should be able to see related (.+)$")
    public void should_be_able_to_see_related(String product) {
  	  Assert.assertTrue(srp.actualProductSearchedMsgValidation().contains(product));
    }

    @When("customer types in {string} in search text field")
    public void customer_types_in_in_search_text_field(String invalidProduct) {
    	hp.enterProductInSearchField(invalidProduct);
    }

    @Then("should see no result message {string}")
    public void should_see_no_result_message(String expectedMsg) {
    	Assert.assertEquals(srp.returnNoResultErrorMsg(),expectedMsg);
    }
}

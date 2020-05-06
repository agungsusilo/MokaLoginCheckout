package demo.steps_definition;

import demo.pages.MainPage;
import demo.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();
  MainPage mainPage = new MainPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @And("User input email {string} on email form")
  public void userInputEmailOnEmailForm(String email) {
    startPage.inputEmail(email);
  }

  @And("User input password {string} on password form")
  public void userInputPasswordOnPasswordForm(String password) {
    startPage.inputPassword(password);
  }

  @And("User click signIn button")
  public void userClickSignInButton() {
    startPage.clickbuttonSignIn();
  }

  @Then("user see main page")
  public void userSeeMainPage() {
    boolean result = startPage.isOnHomePage();
    Assert.assertTrue(result);
  }

  @When("User click {string} on favourite menu {int} times")
  public void userClickOnFavouriteMenuTimes(String namaitem, int banyak) {
    mainPage.addItem(namaitem, banyak);
  }

  @And("User see the {string} on shopping cart")
  public void userSeeTheOnShoppingCart(String namaitem) {
    boolean result = mainPage.itemOnShopchart(namaitem);
    Assert.assertTrue(result);
  }

  @And("User click charge button on shopping cart")
    public void userClickChargeButtonOnShoppingCart() {
    mainPage.clickCheckoutButton();
  }

  @And("User choose cash option with exact amount to be paid")
    public void userChooseCashOptionWithExactAmountToBePaid() {
    mainPage.clickLowestAmount();
  }

  @And("User click charge button on checkout pop-up")
    public void userClickChargeButtonOnCheckoutPopUp() {
    mainPage.clickFinalCharge();
  }

  @Then("User see the receipt page")
    public void userSeeTheReceiptPage() {
    boolean result = mainPage.isOnReceiptPage();
    Assert.assertTrue(result);
  }

  @And("User click No thank you button")
    public void userClickNoThankYouButton() {
    mainPage.clickNoThanks();
  }


}

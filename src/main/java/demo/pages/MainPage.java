package demo.pages;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {

    public void addItem(String itemName, int times){
        String xpath = "//android.widget.TextView[contains(@resource-id, 'grid_favourite_name') and @text = '%s']";
        for (int i=0; i<times; i++) {
            AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(xpath, itemName))).click();
        }
    }

    public boolean itemOnShopchart(String itemName) {
        String xpath = "//android.widget.TextView[contains(@resource-id, 'name_text_view') and @text = '%s']";
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(xpath, itemName)))).isDisplayed();
    }

    public void clickCheckoutButton(){
        AndroidElement buttonlogin = androidDriver.findElement((By.id("checkoutButton")));
        buttonlogin.click();
    }

    public void clickLowestAmount(){
        AndroidElement lowestbutton = androidDriver.findElement((By.id("cash_suggest_lowest")));
        lowestbutton.click();
    }

    public void clickFinalCharge(){
        AndroidElement chargebutton = androidDriver.findElement((By.id("tablet_ok_button")));
        chargebutton.click();
    }

    public boolean isOnReceiptPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("change_text_view"))).isDisplayed();
    }

    public void clickNoThanks(){
        AndroidElement noThanksBTN = androidDriver.findElement((By.id("no_send_button")));
        noThanksBTN.click();
    }


}

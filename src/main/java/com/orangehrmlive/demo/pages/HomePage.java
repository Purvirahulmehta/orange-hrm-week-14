package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.bouncycastle.util.Store;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
    PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement storeLogo;
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminLink;
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pimLink;
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leaveLink;
    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement dashboardLink;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;
    public void clickOnAdmin() {
        Reporter.log("Clicking onAdmin" + adminLink.toString() + "<br>");
        clickOnElement(adminLink);

    }

    public void clickOnPIM() {
        Reporter.log("Clicking onPIM" + pimLink.toString() + "<br>");
        clickOnElement(pimLink);
    }
    public void clickOnLeave() {
        Reporter.log("Clicking on Leave" + leaveLink.toString() + "<br>");
        clickOnElement(leaveLink);
    }
    public void clickOnDashboard() {
        Reporter.log("Clicking onDashboard" + dashboardLink.toString() + "<br>");
        clickOnElement(dashboardLink);
    }
    public String verifyTextMessage(String text) {
        Reporter.log("getting sTextMessage " + storeLogo.toString() + "<br>");
        return getTextFromElement(storeLogo);
    }
    public String verifyWelcomeText() {
        Reporter.log("getting WelcomeText " + welcomeText.toString() + "<br>");
        return getTextFromElement(welcomeText);
    }
}

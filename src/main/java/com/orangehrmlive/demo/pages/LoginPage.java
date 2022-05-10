package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.bouncycastle.util.Store;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userNameField;
    @FindBy(xpath ="//input[@id='txtPassword']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement logInTab;
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement logInPane,Text;
   public void enterUserName(String text){
       Reporter.log("Enter UserName"+text+ " to UserName field "+userNameField.toString() + "<br>");
       sendTextToElement(userNameField,text);
   }
   public void enterPassword(String text){
       Reporter.log("Enter Password"+text+ " to Password field "+passwordField.toString() + "<br>");
       sendTextToElement(passwordField,text);
   }
   public void clickOnLoginButton(){
       Reporter.log("Clicking on LoginButton"+ logInTab.toString()+ "<br>");
        clickOnElement(logInTab);
   }
   public String verifyTextMessage(String text){
       Reporter.log("getting TextMessage "+logInPane.toString()+"<br>");
       return getTextFromElement(logInPane);
   }

}

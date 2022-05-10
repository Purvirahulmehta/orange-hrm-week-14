package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import sun.security.util.Password;

public class AddUserPage extends Utility {
    public AddUserPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserText;
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleDropDown;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement status;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButtom ;
    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancelButton;
    public String getAddUserName(){
        return getTextFromElement(addUserText);
    }
    public void clickOnUserRole(String text){
      Reporter.log("Selecting  UserRole"+text+" from dropdown "+userRoleDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(userRoleDropDown,text);
    }
    public void enterEmployeeName(String text){
        Reporter.log("Enter EmployeeName"+text+ " to EmployeeName "+employeeName.toString() +"<br>");
        sendTextToElement(employeeName,text);
    }
    public void enterUserName(String text){
        Reporter.log("Enter UserName"+text+ " to UserName "+userName.toString() + "<br>");
        sendTextToElement(userName,text);
    }
    public void clickOnStatus(String text){
        Reporter.log("Selecting Status"+text+" from dropdown "+status.toString() + "<br>");
        selectByVisibleTextFromDropDown(status,text);
    }
    public void enterPassword(String text){
        Reporter.log("Enter Password"+text+ " to Password field "+password.toString() + "<br>");
        sendTextToElement(password,text);
    }
    public void enterConfirmPassword(String text){
        Reporter.log("Enter ConfirmPassword"+text+ " to ConfirmPassword field "+confirmPassword.toString() + "<br>");
        sendTextToElement(confirmPassword,text);
    }
    public void clickOnSaveButton(){
        Reporter.log("Clicking on SaveButton"+ saveButtom.toString()+ "<br>");
        clickOnElement(saveButtom);
    }
    public void clickOnCancelButton(){
        Reporter.log("Clicking on CancelButton"+ cancelButton.toString()+ "<br>");
        clickOnElement(cancelButton);
    }

}

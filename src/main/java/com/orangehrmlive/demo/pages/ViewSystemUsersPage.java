package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='head']/h1")
    WebElement systemUsersText;
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement usernameSystemUsers;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRole;
    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employeeName;
     @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement status;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement search;
    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement reset;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteButton;
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectRecord_49']")
    WebElement checkButton;
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement deleteOkButton;
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordsFoundText;
    public String verifyNoRecordsFound(){
        Reporter.log("getting NoRecordsFound text from "+noRecordsFoundText.toString()+"<br>");
        return getTextFromElement(noRecordsFoundText);

    }
    public void clickOnDeleteOkButton(){
        Reporter.log("Clicking on DeleteOkButton"+ deleteButton.toString()+ "<br>");
        clickOnElement(deleteOkButton);
    }
    public void clickOnCheckButton(){
        Reporter.log("Clicking on CheckButton"+ checkButton.toString()+ "<br>");
        clickOnElement(checkButton);
    }
    public String verifyMessage() {
        Reporter.log("getting verifyMessage text from "+systemUsersText.toString()+"<br>");
        return getTextFromElement(systemUsersText);
    }
    public void enterUserName(String text){
        Reporter.log("Enter UserName"+text+ " to UserName field "+usernameSystemUsers.toString() + "<br>");
        sendTextToElement(usernameSystemUsers,text);
    }
    public void clickOnUserRole(String text){
        Reporter.log("Clicking on UserRole"+ userRole.toString()+ "<br>");
        selectByVisibleTextFromDropDown(userRole,text);
    }
    public void enterOnEmployeeName(String text){
        Reporter.log("Enter EmployeeName"+text+ " to EmployeeName field "+employeeName.toString() + "<br>");
        sendTextToElement(employeeName,text);
    }
    public void clickOnStatus(String text){
        Reporter.log("Clicking onStatus"+ status.toString()+ "<br>");
        selectByVisibleTextFromDropDown(status,text);
    }
    public void clickOnSearchButton(){
        Reporter.log("Clicking on SearchButton"+search.toString()+ "<br>");
        clickOnElement(search);
    }
    public void clickOnResetButton(){
        Reporter.log("Clicking on ResetButton"+ reset.toString()+ "<br>");
        clickOnElement(reset);
    }
    public void clickOnAddButton()
    {
        Reporter.log("Clicking on AddButton"+ addButton.toString()+ "<br>");
        clickOnElement(addButton);
    }
    public void clickOnDeleteButton(){
        Reporter.log("Clicking on DeleteButton"+ deleteButton.toString()+ "<br>");
        clickOnElement(deleteButton);
    }






}

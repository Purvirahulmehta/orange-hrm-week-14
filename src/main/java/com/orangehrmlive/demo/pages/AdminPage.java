package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdminPage extends Utility {
    public AdminPage() {

        PageFactory.initElements(driver, this);
    }
    //UserManagement, Job, Organization Tabs Locators and it's actions
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagement;
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement jobsAdmin;
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organization;
    public void clickOnUserManagement(){
        Reporter.log("Clicking UserManagement"+ userManagement.toString()+ "<br>");
        clickOnElement(userManagement);
    }
    public void clickOnJobs(){
        Reporter.log("Clicking on Jobs"+ jobsAdmin.toString()+ "<br>");
        clickOnElement(jobsAdmin);
    }
    public void clickOnOrganization(){
        Reporter.log("Clicking on Organization"+ organization.toString()+ "<br>");
        clickOnElement(organization);
    }

}

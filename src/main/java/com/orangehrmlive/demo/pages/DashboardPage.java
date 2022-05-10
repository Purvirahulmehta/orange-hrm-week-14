package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DashboardPage extends Utility {
    public DashboardPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashBoardText;
    public String getDashBoardText(String text){
        Reporter.log("getting DashBoardText "+dashBoardText.toString()+"<br>");
        return getTextFromElement(dashBoardText);
    }

}

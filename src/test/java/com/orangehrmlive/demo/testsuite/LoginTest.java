package com.orangehrmlive.demo.testsuite;

import com.google.common.base.Verify;
import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    ViewSystemUsersPage viewSystemUsersPage;
    DashboardPage dashboardPage;
    AdminPage adminPage;
    AddUserPage addUserPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        viewSystemUsersPage = new ViewSystemUsersPage();
        dashboardPage = new DashboardPage();
        adminPage = new AdminPage();
        addUserPage = new AddUserPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(homePage.verifyWelcomeText().substring(1,7),"Welcome");

    }

}

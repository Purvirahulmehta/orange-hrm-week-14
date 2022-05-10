package com.orangehrmlive.demo.testsuite;

import com.google.common.base.Verify;
import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import javafx.scene.control.Tab;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sun.security.util.Password;

public class UsersTest extends TestBase {
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
    public void adminShouldAddUserSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.verifyMessage(), "System Users");
        softAssert.assertAll();
        viewSystemUsersPage.clickOnAddButton();
        softAssert.assertEquals(addUserPage.getAddUserName(), "Add User");
        addUserPage.clickOnUserRole("Admin");
        addUserPage.enterEmployeeName("Ananya Dash");
        addUserPage.enterUserName("Prime Testing");
        addUserPage.clickOnStatus("Disabled");
        addUserPage.enterPassword("primetesting");
        addUserPage.enterConfirmPassword("primetesting");
        addUserPage.clickOnSaveButton();

    }

    @Test(groups = {"smoke","regression"})
    public void searchTheUserCreatedAndVerifyIt() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.verifyMessage(), "System Users");
        softAssert.assertAll();
        viewSystemUsersPage.enterUserName("Prime Testing");
        viewSystemUsersPage.clickOnUserRole("Admin");
        viewSystemUsersPage.clickOnStatus("Disabled");
        viewSystemUsersPage.clickOnSearchButton();

    }

    @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.verifyMessage(), "System Users");
        softAssert.assertAll();
        viewSystemUsersPage.enterUserName("Prime Testing");
        viewSystemUsersPage.clickOnUserRole("Admin");
        viewSystemUsersPage.clickOnStatus("Disabled");
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.clickOnCheckButton();
        viewSystemUsersPage.clickOnDeleteButton();
        viewSystemUsersPage.clickOnDeleteOkButton();

    }
    @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){

        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.verifyMessage(), "System Users");
        softAssert.assertAll();
        viewSystemUsersPage.enterUserName("Prime Testing");
        viewSystemUsersPage.clickOnUserRole("Admin");
        viewSystemUsersPage.clickOnStatus("Disabled");
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.verifyNoRecordsFound();

    }
}



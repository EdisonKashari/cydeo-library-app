package com.cydeoLibrary.stepdefinitions;

import com.cydeoLibrary.pages.LoginPage;
import com.cydeoLibrary.utilities.BrowserUtils;
import com.cydeoLibrary.utilities.ConfigurationReader;
import com.cydeoLibrary.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Task4_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginUrl"));

    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);




    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        loginPage.sign_in_button.click();
        BrowserUtils.sleep(2);

        BrowserUtils.waitForVisibility(loginPage.dashboard,10);



    }
    @Then("there should be {string} users")
    public void there_should_be(String expectedUsers) {

        String  actualUsers = loginPage.users_numbers.getText();

        Assert.assertEquals(expectedUsers,actualUsers);



    }
}

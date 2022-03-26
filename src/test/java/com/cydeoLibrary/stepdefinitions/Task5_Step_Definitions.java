package com.cydeoLibrary.stepdefinitions;

import com.cydeoLibrary.pages.LoginPage;
import com.cydeoLibrary.utilities.BrowserUtils;
import com.cydeoLibrary.utilities.ConfigurationReader;
import com.cydeoLibrary.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5_Step_Definitions {
    LoginPage loginPage = new LoginPage();

    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginUrl"));
        loginPage.email.sendKeys(ConfigurationReader.getProperty("librarian_email"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        loginPage.sign_in_button.click();
    }

    @Given("I click on {string} link")
    public void i_click_on_link(String string) {

        if (string.equals(loginPage.users_link.getText())) {
            loginPage.users_link.click();
        }

    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedNames) {
        List<WebElement> actualName = loginPage.column_names;

        List<String> allNames = new ArrayList<>();

        for (WebElement each : actualName) {

            allNames.add(each.getText());
        }
        Assert.assertEquals(expectedNames, allNames);


    }
}

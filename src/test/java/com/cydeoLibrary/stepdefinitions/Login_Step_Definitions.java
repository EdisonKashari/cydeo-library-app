package com.cydeoLibrary.stepdefinitions;

import com.cydeoLibrary.pages.LoginPage;
import com.cydeoLibrary.utilities.BrowserUtils;
import com.cydeoLibrary.utilities.ConfigurationReader;
import com.cydeoLibrary.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Step_Definitions {

    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("loginUrl"));

        BrowserUtils.waitForClickablility(loginPage.email, 20);

        BrowserUtils.hover(loginPage.email);


    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {

        //   loginPage.email.click();
        loginPage.email.sendKeys(ConfigurationReader.getProperty("librarian_email"));


    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {

        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarian_password"));

    }



    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.email.sendKeys(ConfigurationReader.getProperty("student_email"));


    }

    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("student_password"));



    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        loginPage.sign_in_button.click();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";

        System.out.println("actualTitle = " + actualTitle);

       Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


}

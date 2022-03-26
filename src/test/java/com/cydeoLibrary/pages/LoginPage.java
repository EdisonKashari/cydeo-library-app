package com.cydeoLibrary.pages;

import com.cydeoLibrary.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    //email
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement email;

    //password
    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement password;


    // sign in button
    @FindBy(xpath = "//button")
    public WebElement sign_in_button;

    //dashboard
    @FindBy(xpath = "//span[text()='Dashboard']")
    public WebElement dashboard;

    //users numbers
    @FindBy(xpath = "//h2[text()='140']")
    public WebElement users_numbers;

    //users link

    @FindBy(xpath = "//span[.='Users']")
    public WebElement users_link;

    // column names
    @FindBy(xpath = "//th")
    public List<WebElement> column_names;


}

package com.afs.pages;

import com.afs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UspsAddressSearchPage {

    public UspsAddressSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "tAddress")
    public WebElement streetAddressBar;

    @FindBy(name = "tApt")
    public WebElement apartmentSuiteSearchBar;

    @FindBy(name = "tCity")
    public WebElement cityBar;

    @FindBy(name = "tState")
    public WebElement state;

    @FindBy(id = "zip-by-address")
    public WebElement findBtn;




}

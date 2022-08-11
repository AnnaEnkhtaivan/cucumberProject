package com.afs.pages;

import com.afs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UspsResultPage {

    public UspsResultPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='address-information-entered']")
    public WebElement resultElem;
}

package com.afs.step_definitions;

import com.afs.pages.UspsAddressSearchPage;
import com.afs.pages.UspsResultPage;
import com.afs.utilities.ConfigurationReader;
import com.afs.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class Usps_StepDefinitions {

    UspsAddressSearchPage searchPage = new UspsAddressSearchPage();


    @Given("User is on the usps Zip Code by Address page")
    public void user_is_on_the_usps_zip_code_by_address_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("usps.url"));
    }

    @When("User is able to enter Street address")
    public void user_is_able_to_enter_street_address() {
        searchPage.streetAddressBar.sendKeys("5440 N Sheridan Road" + Keys.ENTER);

    }

    @When("User is able to ender Apartment, suite number")
    public void user_is_able_to_ender_apartment_suite_number() {
        searchPage.apartmentSuiteSearchBar.sendKeys("308" + Keys.ENTER);

    }
    @When("User is able to enter City name")
    public void user_is_able_to_enter_city_name() {
        searchPage.cityBar.sendKeys("Chicago" + Keys.ENTER);


    }
    @When("User is able to select State from dropdowns")
    public void user_is_able_to_select_state_from_dropdowns() {
        Select selectState = new Select(searchPage.state);
        selectState.selectByValue("IL");


    }
    @When("User is able to click the Find button")
    public void user_is_able_to_click_the_find_button() {
        searchPage.findBtn.click();

    }

    @Then("result should be displayed")
    public void result_should_be_displayed() {
        UspsResultPage resultPage = new UspsResultPage();
        System.out.println("Result:  " + resultPage.resultElem.getText());
        //Assert.assertEquals(expectedResult, searchPage.resultElem.getText().trim());

        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "ZIP Code™ Lookup | USPS";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        Assert.assertEquals(actualTitle, expectedInTitle);
    }
}

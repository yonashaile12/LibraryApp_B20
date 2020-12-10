package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LandingPage;
import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PageNavigation_StepDefinitions {

    UsersPage usersPage = new UsersPage();
    LandingPage landingPage = new LandingPage();
    Select select;

    @When("I click on {string} link")
    public void i_click_on_link(String link) {

        BrowserUtils.waitForVisibility(landingPage.dashboardPageLink, 5);
            switch (link.toLowerCase()){
                case "dashboard":
                    landingPage.dashboardPageLink.click();
                    break;
                case "users":
                    landingPage.userPageLink.click();
                    break;

                case "books":
                    landingPage.booksPageLink.click();
                    break;
            }
    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {
        BrowserUtils.waitForVisibility(usersPage.showRecordsDropDown, 5);
        select = new Select(usersPage.showRecordsDropDown);
       String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected+"", actual );


    }
    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> options) {
//        System.out.println("options.size() = " + options.size());
//        System.out.println("options = " + options);

        select = new Select(usersPage.showRecordsDropDown);
        //select.getOptions(); // returning all the options from the dropdown
        List<WebElement> webElements = select.getOptions();

        List<String> actualText = BrowserUtils.getElementsText(webElements);
        Assert.assertEquals(options, actualText);


    }
}

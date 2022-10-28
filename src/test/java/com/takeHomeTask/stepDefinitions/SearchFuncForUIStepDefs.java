package com.takeHomeTask.stepDefinitions;

import com.takeHomeTask.pages.BasePage;
import com.takeHomeTask.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchFuncForUIStepDefs {

    BasePage basePage = new BasePage();

    @When("user clicks the privacy policy link")
    public void userClicksThePrivacyPolicyLinkFromTheRightFrame() {
        basePage.privacyPolicyLink.click();
    }

    @And("user goes to the privacy policy page")
    public void userGoesToThePrivacyPolicyPage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Privacy policy"));
    }

    @And("user clicks to the Turkish language link")
    public void userClicksToTheTurkishLanguageLink() {
        basePage.trLanguage.click();
    }

    @Then("user sees the page in Turkish")
    public void userSeesThePageInTurkish() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("tr"));
    }

    @When("user clicks to expand the advanced search menu")
    public void userClicksToExpandTheAdvancedSearchMenu() {

    }

    @And("user scrolls down and clicks to the file type menu")
    public void userScrollsDownAndClicksToTheFileTypeMenu() {
    }

    @And("from the dropdown menu, user clicks the .gif option")
    public void fromTheDropdownMenuUserClicksTheGifOption() {
    }

    @And("user scrolls up and clicks search button")
    public void userScrollsUpAndClicksSearchButton() {
    }

    @And("user clicks for the first result")
    public void userClicksForTheFirstResult() {
    }

    @Then("user sees the image as .gif format")
    public void userSeesTheImageAsGifFormat() {
    }
}

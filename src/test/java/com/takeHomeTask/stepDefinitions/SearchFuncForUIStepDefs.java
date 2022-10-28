package com.takeHomeTask.stepDefinitions;

import com.takeHomeTask.pages.BasePage;
import com.takeHomeTask.utilities.BrowserUtilities;
import com.takeHomeTask.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFuncForUIStepDefs {

    BasePage basePage = new BasePage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

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
        basePage.expandAdvancedSearch.click();
    }

    @And("user scrolls down and clicks to the file type menu")
    public void userScrollsDownAndClicksToTheFileTypeMenu() {
        jse.executeScript("window.scrollBy(0,100)");
        basePage.fileTypeDropdown.click();
    }

    @And("from the dropdown menu, user clicks the .gif option")
    public void fromTheDropdownMenuUserClicksTheGifOption() {
        basePage.gifOption.click();
    }

    @And("user scrolls up and clicks search button")
    public void userScrollsUpAndClicksSearchButton() {
        jse.executeScript("window.scrollBy(0,-100)");
        basePage.searchButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("gif"));

    }

    @And("user clicks for the first result")
    public void userClicksForTheFirstResult() {
        basePage.firstSearchResult.click();
        BrowserUtilities.waitFor(5);

    }

    @Then("user sees the image as .gif format")
    public void userSeesTheImageAsGifFormat() {
        Assert.assertTrue(basePage.gifImage.isDisplayed());

    }
}

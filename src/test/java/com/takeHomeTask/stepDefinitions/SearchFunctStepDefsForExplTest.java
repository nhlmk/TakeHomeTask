package com.takeHomeTask.stepDefinitions;

import com.takeHomeTask.pages.BasePage;
import com.takeHomeTask.utilities.BrowserUtilities;
import com.takeHomeTask.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchFunctStepDefsForExplTest {

    BasePage basePage = new BasePage();
    Hooks hooks = new Hooks();

    @Given("User is on the homepage")
    public void userIsOnTheHomepage() {
        Assert.assertTrue(basePage.mainSearchInput.isDisplayed());

    }

    @When("user enters the colors in the main search box, user see correct title and secure URL")
    public void userEntersTheColorsInTheMainSearchBox() throws FileNotFoundException {

        File file = new File("/Users/kaya/IdeaProjects/TakeHomeTask/colors.in");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\\Z");
        String str = scanner.next();

        for(String each : str.split("\\n")){
            basePage.mainSearchInput.sendKeys(each, Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(each));
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https"));
            hooks.setDriver();
        }
        BrowserUtilities.waitFor(10);

    }


    @When("user enters the colors in the search box on the top right corner, user see correct title and secure URL")
    public void userEntersTheColorsInTheSearchBoxOnTheTopRightCorner() throws FileNotFoundException {

        File file = new File("/Users/kaya/IdeaProjects/TakeHomeTask/colors.in");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\\Z");
        String str = scanner.next();

        for(String each : str.split("\\n")){
            basePage.searchInputTopRightCorner.sendKeys(each, Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(each));
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https"));
            hooks.setDriver();
        }
        BrowserUtilities.waitFor(10);

    }

}

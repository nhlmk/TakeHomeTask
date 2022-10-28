package com.takeHomeTask.pages;

import com.takeHomeTask.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement mainSearchInput;

    @FindBy(xpath = "(//input[@type='search'])[2]")
    public WebElement searchInputTopRightCorner;

    @FindBy(xpath = "//a[.='Privacy policy']")
    public WebElement privacyPolicyLink;

    @FindBy(xpath = "//a[.='Türkçe']")
    public WebElement trLanguage;

    @FindBy(xpath = "//a[@aria-controls='mw-advancedSearch-expandable-options']")
    public WebElement expandAdvancedSearch;

    @FindBy(xpath = "(//span[.='Select file type'])[1]")
    public WebElement fileTypeDropdown;

    @FindBy(xpath = "(//span[.='gif'])")
    public WebElement gifOption;

    @FindBy(xpath = "(//span[.='Search'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "(//a[contains(@title,'.gif')])[1]")
    public WebElement firstSearchResult;

    @FindBy(xpath = "(//img[contains(@alt,'gif')])[1]")
    public WebElement gifImage;





}

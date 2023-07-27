package com.zebrunner.carina.demo.gui.webTestingCommonPageBase;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class HomeWebPageBase extends AbstractPage {

    @FindBy(xpath = "//button[text()='Agree and proceed']")
    private ExtendedWebElement acceptCookies;
    public HomeWebPageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public abstract ABTestingPageBase getABTestingPage();
    public abstract AddRemovePageBase accessAddRemovePage();
    public abstract BrokenImagePageBase getBrokenImagePage();

    public abstract CheckboxesPageBase getCheckBoxesPage();

    public abstract DropDownPageBase getDropDownPage();

    public abstract KeyPressesPageBase getKeyPressesPage();
    @Override
    public void open() {
        super.open();
        acceptCookies.clickIfPresent(3);

    }

  }


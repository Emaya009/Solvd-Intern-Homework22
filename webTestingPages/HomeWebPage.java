package com.zebrunner.carina.demo.gui.webTestingPages;

import com.zebrunner.carina.demo.gui.webTestingCommonPageBase.*;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomeWebPage extends HomeWebPageBase {

    //Css Selector with Tag and Attribute
    @FindBy(css = "a[href='/abtest']")
    private ExtendedWebElement abTestingButton;
    @FindBy(linkText = "Add/Remove Elements")
    private ExtendedWebElement addremoveElements;
    @FindBy(linkText = "Broken Images")
    private ExtendedWebElement accessBrokenimagePage;

    @FindBy(css = "a[href*='checkboxes']")
    private ExtendedWebElement acessCheckboxPage;

    @FindBy(linkText = "Dropdown")
    private ExtendedWebElement accessDropDownPage;
    @FindBy(linkText = "Key Presses")
    private ExtendedWebElement keyPressesLink;
    public HomeWebPage(WebDriver driver) {
        super(driver);
    }
    public ABTestingPageBase getABTestingPage()
    {
        abTestingButton.click();
        return initPage(driver, ABTestingPageBase.class);
        //   driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    public AddRemovePageBase accessAddRemovePage()
    {
        addremoveElements.clickIfPresent();
        return initPage(driver, AddRemovePageBase.class);

    }

    public BrokenImagePageBase getBrokenImagePage()
    {
        accessBrokenimagePage.clickIfPresent();
        return  initPage(driver, BrokenImagePageBase.class);
    }

    @Override
    public CheckboxesPageBase getCheckBoxesPage() {
        acessCheckboxPage.clickIfPresent();
        return  initPage(driver, CheckboxesPageBase.class);
    }

    @Override
    public DropDownPageBase getDropDownPage() {
        accessDropDownPage.click();
        return  initPage(driver, DropDownPageBase.class);
    }
    @Override
    public KeyPressesPageBase getKeyPressesPage() {
        keyPressesLink.click();
        return initPage(driver, KeyPressesPageBase.class);
    }



}

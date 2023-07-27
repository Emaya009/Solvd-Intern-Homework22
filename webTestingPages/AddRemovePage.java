package com.zebrunner.carina.demo.gui.webTestingPages;

import com.zebrunner.carina.demo.gui.webTestingCommonPageBase.AddRemovePageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AddRemovePage extends AddRemovePageBase {

    @FindBy(className = "example")
    private ExtendedWebElement addElementbutton;

   // @FindBy(css = "button.added-manually")
    @FindBy(id = "elements")
     private ExtendedWebElement deleteButton;
    @FindBy(css = "button[onclick='addElement']")
    private ExtendedWebElement removeDeletebutton;

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }
    @Override
    public String addElement() {
        addElementbutton.clickIfPresent();
        return addElementbutton.getText();
    }
    public String deleteButton()
    {
        assertElementPresent(deleteButton);
        return deleteButton.getText();
    }
    public boolean removeDeleteButton()
    {
        removeDeletebutton.clickIfPresent();
        return removeDeletebutton.isElementNotPresent(1000);

    }
}

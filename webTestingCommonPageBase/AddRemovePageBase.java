package com.zebrunner.carina.demo.gui.webTestingCommonPageBase;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AddRemovePageBase extends AbstractPage {

    public AddRemovePageBase(WebDriver driver) {
        super(driver);
    }
    public abstract String addElement();
    public abstract String deleteButton();
    public abstract boolean removeDeleteButton();
}

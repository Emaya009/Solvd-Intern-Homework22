package com.zebrunner.carina.demo.gui.webTestingCommonPageBase;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class DropDownPageBase extends AbstractPage {
    public DropDownPageBase(WebDriver driver) {
        super(driver);
    }

public abstract List<ExtendedWebElement> selectDropDown();
}

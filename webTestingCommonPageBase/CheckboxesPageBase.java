package com.zebrunner.carina.demo.gui.webTestingCommonPageBase;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class CheckboxesPageBase extends AbstractPage {

    public CheckboxesPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract List<WebElement> clickAllCheckBoxes();
}

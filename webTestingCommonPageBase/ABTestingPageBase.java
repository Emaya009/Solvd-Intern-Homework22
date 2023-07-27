package com.zebrunner.carina.demo.gui.webTestingCommonPageBase;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ABTestingPageBase extends AbstractPage {

    public ABTestingPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String verifyTheText();

}

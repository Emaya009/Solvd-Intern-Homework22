package com.zebrunner.carina.demo.gui.webTestingCommonPageBase;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class KeyPressesPageBase extends AbstractPage {
    public KeyPressesPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getKeyText() throws InterruptedException;

}

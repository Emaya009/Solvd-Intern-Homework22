package com.zebrunner.carina.demo.gui.webTestingPages;

import com.zebrunner.carina.demo.gui.webTestingCommonPageBase.ABTestingPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class ABTestingPage extends ABTestingPageBase {
     @FindBy(tagName = "p")
     private ExtendedWebElement textMessage;
     public ABTestingPage(WebDriver driver) {
        super(driver);
    }
    public String verifyTheText()
    {
       String verifyTextmessage = textMessage.getText();
        return verifyTextmessage;
    }

}


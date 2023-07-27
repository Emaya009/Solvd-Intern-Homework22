package com.zebrunner.carina.demo.gui.webTestingPages;

import com.zebrunner.carina.demo.gui.webTestingCommonPageBase.CheckboxesPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckboxesPage extends CheckboxesPageBase {

    @FindBy(xpath = "//input[@type='checkbox' and contains(@id,'boxes')]")
    public List<WebElement> checkboxes;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public List<WebElement> clickAllCheckBoxes() {

        for (WebElement checkbox : checkboxes) {
            checkbox.click();

                    }
        return checkboxes;
    }
}

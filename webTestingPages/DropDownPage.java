package com.zebrunner.carina.demo.gui.webTestingPages;

import com.zebrunner.carina.demo.gui.webTestingCommonPageBase.DropDownPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage extends DropDownPageBase {

   @FindBy(css = "select#dropdown")
   private ExtendedWebElement dropDownbox;
   @FindBy(linkText = "Please select an option")
   List<ExtendedWebElement> selectDropDownelement;

    public DropDownPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public List<ExtendedWebElement> selectDropDown() {
        dropDownbox.clickIfPresent();
Select selectElement = new Select((WebElement) selectDropDownelement);
selectElement.selectByValue("1");
return selectDropDownelement;
    }
}


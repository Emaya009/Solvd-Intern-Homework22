package com.zebrunner.carina.demo;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.gui.webTestingPages.*;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class WebAutomationTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "Emaya")
    public void testABTestingPage()
    {
        //Open the herokuapp.com webpage
        HomeWebPage homePage = initPage(getDriver(), HomeWebPage.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
     // To click A/B Testing Link and open the page
        homePage.getABTestingPage();
        Assert.assertTrue(homePage.isPageOpened(),"A/B Testing Page is not opened");
        ABTestingPage abTestingPage=new ABTestingPage(getDriver());
        //Verify if the text message is displayed
        SoftAssert softAssert = new SoftAssert();
       softAssert.assertEquals(abTestingPage.verifyTheText(),"Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).","Message not displayed");
      softAssert.assertAll();

    }
    @Test
public void testAddRemovePage()
{
    //Open the herokuapp.com webpage
    HomeWebPage homePage = initPage(getDriver(), HomeWebPage.class);
    homePage.open();
    Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    // To click Add/Remove Elements Link and open the page
    homePage.accessAddRemovePage();
    Assert.assertTrue(homePage.isPageOpened(),"Add/Remove Web Element Page is not opened");
    AddRemovePage addRemovePage=new AddRemovePage(getDriver());
    //Verify if the Delete element is added once Add Element button is clicked and Delete button is removed when clicking on the delete button populated
    SoftAssert softAssert=new SoftAssert();
   softAssert.assertEquals(addRemovePage.addElement(),"Add Element","Add Element button is missing");
   softAssert.assertEquals(addRemovePage.deleteButton(),"Delete","Delete button is not populated");
   softAssert.assertTrue(addRemovePage.removeDeleteButton(),"Delete button is not removed");
    softAssert.assertAll();
}
@Test
public void testBrokenImage() {
    //Open the herokuapp.com webpage
    HomeWebPage homePage = initPage(getDriver(), HomeWebPage.class);
    homePage.open();
    Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    // To click Broken Images Link and open the page
    homePage.getBrokenImagePage();
    Assert.assertTrue(homePage.isPageOpened(), "Broken Image Page is not opened");
    BrokenImagePage brokenImagePage = new BrokenImagePage(getDriver());
// verify if the broken images are available and its height & width are captured
    SoftAssert softAssert = new SoftAssert();
    List<WebElement> images = brokenImagePage.getBrokenImageWidthHeight();
    softAssert.assertEquals(images.equals(120), "width is not as expected");
    softAssert.assertEquals(images.equals(90),"Height is not as expected ");
softAssert.assertAll();
    }
    @Test
    public void testCheckboxes() {
//Open the herokuapp.com webpage
        HomeWebPage homePage = initPage(getDriver(), HomeWebPage.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        // To click check boxes Link and open the page
        homePage.getCheckBoxesPage();
        Assert.assertTrue(homePage.isPageOpened(), "Checkboxes page is not opened");
        CheckboxesPage checkboxesPage = new CheckboxesPage(getDriver());
// verify if the check boxes are present and checked;
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> checkboxes = checkboxesPage.clickAllCheckBoxes();
        for (WebElement checkbox : checkboxes) {
            softAssert.assertTrue(checkbox.isSelected());
        }
    }
    @Test
    public void testDropDown()
    {
        //Open the herokuapp.com webpage
        HomeWebPage homePage = initPage(getDriver(), HomeWebPage.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        // To click Drop Down Link and open the page
        homePage.getDropDownPage();
        Assert.assertTrue(homePage.isPageOpened(), "Dropdown page is not opened");
        DropDownPage dropDownPage = new DropDownPage(getDriver());
        SoftAssert softAssert=new SoftAssert();
        List<ExtendedWebElement> dropdownvalue = dropDownPage.selectDropDown();
        softAssert.assertEquals(dropdownvalue,"Option 1","Selected Drop Down text is not matching");

    }
    @Test
    public void testKeyPresses() throws InterruptedException {
//Open the herokuapp.com webpage
        HomeWebPage homePage = initPage(getDriver(), HomeWebPage.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        // To click KeyPresses Link and open the page
        homePage.getKeyPressesPage();
        Assert.assertTrue(homePage.isPageOpened(), "KeyPresses page is not opened");
        KeyPressesPage keyPressesPage=new KeyPressesPage(getDriver());
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(keyPressesPage.getKeyText(),"Key pressed in the key board","Details of the key pressed is not displayed");

    }
}

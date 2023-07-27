package com.zebrunner.carina.demo.gui.webTestingPages;

import com.zebrunner.carina.demo.gui.webTestingCommonPageBase.KeyPressesPageBase;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class KeyPressesPage extends KeyPressesPageBase {

  @FindBy(css = "input#target")
    private WebElement keyPressesTextBox;

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getKeyText() throws InterruptedException {
     /*   JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("Elephant",keyPressesTextBox);
        return
        Robot robot = new Robot();
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = alphabet.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
        }
        String textDisplayed = keyPressesTextBox.getText();
    }*/
        Random random = new Random();
        String randomText = RandomStringUtils.randomAlphabetic(10);
        for (char c : randomText.toCharArray()) {
            keyPressesTextBox.sendKeys(Character.toString(c));
            Thread.sleep(random.nextInt(1000));
        }
        String displayedText = keyPressesTextBox.getText();
        return displayedText;
    }
}

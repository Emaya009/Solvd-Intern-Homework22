
package com.zebrunner.carina.demo.gui.webTestingPages;

import com.zebrunner.carina.demo.gui.webTestingCommonPageBase.BrokenImagePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class BrokenImagePage extends BrokenImagePageBase {
    @FindBy(tagName = "img")
    List<WebElement> images;

    private double width;
    private double height;

    public BrokenImagePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public List<WebElement> getBrokenImageWidthHeight() {
        for (WebElement image : images) {
            String src = image.getAttribute("src");
            try {
                BufferedImage bufferedImage = ImageIO.read(new File(src));
                width = bufferedImage.getWidth();
                height = bufferedImage.getHeight();
                System.out.println("Width: " + width + ", Height: " + height);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return images;
    }
}
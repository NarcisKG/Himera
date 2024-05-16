package PageMethods;

import Core.Attributes;
import Core.BasePage;
import Core.Locators;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DemoQaAlertsFramesWindows extends BasePage {

    public DemoQaAlertsFramesWindows verifydemoQaAFWListIsVisible(){
        Assert.isTrue(isElementVisible(By.xpath(Locators.ELEMENT_LIST_SHOW)),"Element list is not visible");
        return this;}

    public DemoQaAlertsFramesWindows verifyElementOptionsCount(){
        Assertions.assertEquals(5, getElementCount("//div[text()='Alerts, Frame & Windows']//ancestor::div[@class='element-group']//ul//li"),
        "Number Option is not as expected");
        return this;}

    public DemoQaAlertsFramesWindows clickOnAlerts(){
        clickOnElement(By.xpath(getLocator(Locators.SPAN_ELEMENT_BY_TEXT, Attributes.ALERTS_FRAMES_WINDOWS_ALERTS)));
        return this;}
}

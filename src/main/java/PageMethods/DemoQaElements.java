package PageMethods;

import Core.Attributes;
import Core.BasePage;
import Core.Locators;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DemoQaElements extends BasePage {

    public DemoQaElements clickOnTextBox(){
        clickOnElement(By.xpath(getLocator(Locators.SPAN_ELEMENT_BY_TEXT, Attributes.DEMO_QA_ELEMENTS_TEXT_BOX)));
        return this;}

    public DemoQaElements verifyElementsListIsVisible(){
        Assert.isTrue(isElementVisible(By.xpath(Locators.ELEMENT_LIST_SHOW)),"Element list is not visible");
        return this;}

    public DemoQaElements verifyElementMenuOptionsCount(){
        Assertions.assertEquals(9, getElementCount("//div[text()='Elements']//ancestor::div[@class='element-group']//ul//li"),
                "Number of options is not as expected");
        return this;}
}

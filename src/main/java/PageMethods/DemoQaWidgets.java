package PageMethods;

import Core.BasePage;
import Core.Attributes;
import Core.Locators;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


public class DemoQaWidgets extends BasePage {

    public DemoQaWidgets clickOnAccordian(){
        clickOnElement(By.xpath(getLocator(Locators.SPAN_ELEMENT_BY_TEXT,Attributes.DEMO_QA_WIDGETS_ACCORDIAN)));
        return this;
    }
    public DemoQaWidgets verifyWidgetListIsVisible(){
        Assert.isTrue(isElementVisible(By.xpath(Locators.ELEMENT_LIST_SHOW)),"Element List is not visible");
        return this;
    }
    public DemoQaWidgets verifyElementMenuOptionsCount(){
        Assertions.assertEquals(9,getElementCount("//div[text()='Widgets']//ancestor::div[@class='element-group']//ul//li"),
                "Number Option is not as expected");
        return this;
    }
}

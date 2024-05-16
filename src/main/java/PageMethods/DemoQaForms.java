package PageMethods;

import Core.Attributes;
import Core.BasePage;
import Core.Locators;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DemoQaForms extends BasePage {

    public DemoQaForms clickOnPracticeForm(){
        clickOnElement(By.xpath(getLocator(Locators.SPAN_ELEMENT_BY_TEXT, Attributes.DEMO_QA_FORMS_PRACTICE_FORM)));
        return this;}

    public DemoQaForms verifyFormsListIsVisible(){
        Assert.isTrue(isElementVisible(By.xpath(Locators.ELEMENT_LIST_SHOW)),"Element List is not visible");
        return this;}

    public  DemoQaForms verifyElementMenuOptionsCount(){
        Assertions.assertEquals(1,getElementCount("//div[text()='Forms']//ancestor::div[@class='element-group']//ul//li"),
                "Number of options is not as expected");
        return this;}
}

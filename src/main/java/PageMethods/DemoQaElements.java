package PageMethods;

import Core.Attributes;
import Core.BasePage;
import Core.Locators;
import org.openqa.selenium.By;

public class DemoQaElements extends BasePage {

    public DemoQaElements clickOnTextBox(){
        clickOnElement(By.xpath(getLocator(Locators.SPAN_ELEMENT_BY_TEXT, Attributes.DEMO_QA_ELEMENTS_TEXT_BOX)));
        return this;
    }
}

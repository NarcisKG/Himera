package PageMethods;

import Core.Attributes;
import Core.BasePage;
import Core.Locators;
import org.openqa.selenium.By;

public class DemoQaHomepage extends BasePage {

    public DemoQaElements clickOnElements(){
        scrollToElement(getLocator(Locators.DEMO_QA_SECTION, Attributes.DEMO_QA_ELEMENTS));
        clickOnElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION, Attributes.DEMO_QA_ELEMENTS)));
        return new DemoQaElements();}

    public DemoQaForms clickOnForms(){
        scrollToElement(getLocator(Locators.DEMO_QA_SECTION, Attributes.DEMO_QA_FORMS));
        clickOnElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION,Attributes.DEMO_QA_FORMS)));
        return new DemoQaForms();}

    public DemoQaWidgets clickOnWidgets(){
        scrollToElement(getLocator(Locators.DEMO_QA_SECTION, Attributes.DEMO_QA_WIDGETS));
        clickOnElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION,Attributes.DEMO_QA_WIDGETS)));
    return new DemoQaWidgets();}

    public DemoQaAlertsFramesWindows ClickOnAlertsFramesWindows(){
        scrollToElement(getLocator(Locators.DEMO_QA_SECTION, Attributes.ALERTS_FRAMES_WINDOWS));
        clickOnElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION, Attributes.ALERTS_FRAMES_WINDOWS)));
        return new DemoQaAlertsFramesWindows();
    }
}

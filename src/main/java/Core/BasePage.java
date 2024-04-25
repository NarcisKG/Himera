package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage extends Properties {

    protected void clickOnElement(By locator) {
        waitForElementToBeVisible(locator);//
        getDriver().findElement(locator).click();
    }

    protected void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void typeText(String text, By locator) {
        waitForElementToBeVisible(locator);//
        getDriver().findElement(locator).sendKeys(text);
    }

    protected String getElementText(By locator) {
        waitForElementToBeVisible(locator);
        return getDriver().findElement(locator).getText();

    }

    protected String getLocator(String locator, String arg) {
        return locator.replace("%ARG%", arg);
    }

    protected boolean isElementVisible(By locator) {
        boolean isVisible = true;
        try {
            waitForElementToBeVisible(locator);
        } catch (Exception e) {
            isVisible = false;

        }
        return isVisible;

    }

    protected int getElementCount(By locator){
      //  kreiranje liste;
      //  smestanje nadjenih promenljivih po lokatoru u listu; inicijalizacija liste
      // vracanje duzine liste;
    }

}

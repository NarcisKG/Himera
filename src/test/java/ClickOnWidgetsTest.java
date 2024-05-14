import PageMethods.DemoQaHomepage;
import PageMethods.DemoQaWidgets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;


public class ClickOnWidgetsTest extends DemoQaHomepage {

    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://demoqa.com/");
    }

    @Test
    public void test() {
        DemoQaHomepage demo = new DemoQaHomepage();
        demo.clickOnWidgets().verifyWidgetListIsVisible().verifyElementMenuOptionsCount();
    }

    @AfterEach
    public void close(){
        quitDriver();
    }
}

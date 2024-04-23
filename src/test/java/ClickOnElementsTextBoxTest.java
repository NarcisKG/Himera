import PageMethods.DemoQaHomepage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClickOnElementsTextBoxTest extends DemoQaHomepage {

    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://demoqa.com");}

    @Test
    public void test(){
        DemoQaHomepage demo=new DemoQaHomepage();
        demo.clickOnElements().clickOnTextBox();
        demo.clickOnForms();}

    @AfterEach
    public void close(){
        quitDriver();}
}

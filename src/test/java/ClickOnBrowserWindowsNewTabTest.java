import PageMethods.DemoQaBrowserWindow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClickOnBrowserWindowsNewTabTest extends DemoQaBrowserWindow {


    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://demoqa.com/browser-windows");}

    @Test
    public void test(){
        DemoQaBrowserWindow demoQaBrowserWindow = new DemoQaBrowserWindow();
        demoQaBrowserWindow.clickOnNewWindow().switchToNewlyOpenedWindow().verifyTextFromHeading();}

    @AfterEach
    public void close(){
        quitDriver();}






}

import PageMethods.DemoQaFrames;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VerifyFormHeadingText extends DemoQaFrames {

    @BeforeEach
    public void setup(){
        createDriver();
        getDriver().navigate().to("https://demoqa.com/frames");
    }

    @Test
    public void test(){
        DemoQaFrames demoQaFrames = new DemoQaFrames();
        demoQaFrames.switchToIFrame().verifyTextFromHeading();
    }

    @AfterEach
    public void close(){
    quitDriver();
    }
}

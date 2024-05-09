import PageMethods.PracticeFormPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VerifyPracticeFormInputsTest extends PracticeFormPage {

    private final static String FIRST_NAME = "Dusan";

    private final static String LAST_NAME = "Jovanovic";

    private final static String EMAIL = "dusan@jovanovic.rs";

    @BeforeEach

    public void setup(){
        createDriver();
        getDriver().navigate().to("https://demoqa.com/automation-practice-form");
    }
    @Test

    public void test(){
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        practiceFormPage.typeFirstName(FIRST_NAME).verifyFirstName(FIRST_NAME);
        practiceFormPage.typeLastName(LAST_NAME).verifyLastName(LAST_NAME);
        //practiceFormPage.typeUserEmail(EMAIL).
    }

    @AfterEach

    public void close(){
        quitDriver();
    }

}

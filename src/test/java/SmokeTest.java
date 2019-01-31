import TestPages.Kawsar;
import TestPages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.TestBase;

public class SmokeTest extends TestBase {

    @Test
    public void ALlTests(){

        Kawsar kawsars=PageFactory.initElements(driver, Kawsar.class);
        kawsars.allMytests();


    }

}

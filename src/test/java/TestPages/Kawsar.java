package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Kawsar extends TestBase {
    static Kawsar obj= PageFactory.initElements(driver, Kawsar.class);






    public void allMytests(){
        LoginPage log=new LoginPage();
        log.Managerlogin(driver);




    }


}

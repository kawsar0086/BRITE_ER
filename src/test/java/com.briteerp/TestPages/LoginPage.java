package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.TestBase;


public class LoginPage extends TestBase {


    static LoginPage obj=PageFactory.initElements(driver, LoginPage.class);
    static credentials infos= new credentials();

    static	@FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]")
    WebElement firstClick;

    static	    @FindBy(xpath = ".//*[@id='login']")
    WebElement email;

    static    @FindBy(xpath = ".//*[@id='password']")
    WebElement password;

    static    @FindBy(xpath = ".//*[@id='wrapwrap']/main/div/form/div[4]/button")
    WebElement singinButton;

    static	  @FindBy(xpath="//span[contains(text(),'Purchases')]")
    WebElement purchaseMoudle;

    public  void Managerlogin(WebDriver driver) {
        driver.get("http://52.39.162.23/web/login");
        wait.until(ExpectedConditions.visibilityOf(firstClick));
        firstClick.click();

        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(infos.getManagerEmail());

        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(infos.getManagerPassword());

        wait.until(ExpectedConditions.visibilityOf(singinButton));
        singinButton.click();

        purchaseMoudle.click();

    }
    public  void Userlogin() {
        driver.get("http://52.39.162.23/web/login");
        wait.until(ExpectedConditions.visibilityOf(firstClick));
        firstClick.click();

        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(infos.getUserEmail());

        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(infos.getUserPassword());

        wait.until(ExpectedConditions.visibilityOf(singinButton));
        singinButton.click();
    }


}

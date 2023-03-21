package page;

import junit.framework.TestCase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;



public class loginPO extends basePO {
    public loginPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"username-input\"]")
    public WebElement emailField;

    @FindBy(xpath = "//a[@class='btn js-lang' and @onclick='acceptAllAndClose()']")
    public WebElement popUpClick;

    @FindBy(xpath = "/html/body/app-root/ng-component/div/authentication-username/div/div/div/div[1]/section[2]/form/div[2]/input")
    public WebElement buttonEntrarEmail;

    @FindBy(id = "password-input")
    public WebElement passwordField;

    @FindBy(xpath = "/html/body/app-root/ng-component/div/authentication-password/div/div/div/div/form/div[3]/input")
    public WebElement buttonEntrarPass;

    @FindBy(xpath = "/html/body/app-root/ng-component/home-landingpage/div/div[1]/div[1]/div[1]")
    public WebElement classLoginValidationSuccessfully;

    @FindBy(className = "logout-label")
    public WebElement buttonFinishSession;


    public void checkPopupCookies(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement popUp = wait.until(ExpectedConditions.elementToBeClickable(popUpClick));

        if (popUp.isEnabled()){
            popUp.click();
        }else{
            System.out.println("The cookie's pop-up wasn't displayed");
        }

    }

    public void insertEmail(String email){
        emailField.sendKeys(email);
        buttonEntrarEmail.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }

    public void insertPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));

        passwordField.sendKeys(password);
        buttonEntrarPass.click();
    }

    public void validationLoginSuccessfully(){
        assertEquals("Informação de Conta", classLoginValidationSuccessfully.getText());
    }

    public void finishSession(){
        buttonFinishSession.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement butEntrar = wait.until(ExpectedConditions.elementToBeClickable(buttonEntrarEmail));

        assertTrue(butEntrar.isEnabled());

    }


}

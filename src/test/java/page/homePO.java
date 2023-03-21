package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class homePO extends basePO{

    public homePO(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='status-label']")
    public WebElement statusAutenticacao;

    @FindBy(xpath = "/html/body/app-root/ng-component/home-landingpage/div/div[1]/div[1]/div[1]")
    public WebElement detailInformacaoDeConta;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement fieldUsername;

    @FindBy(xpath = "/html/body/app-root/ng-component/div/account-info/div/div/div[2]/div/div[2]/form/div[2]/input[1]")
    public WebElement buttonGuardar;

    @FindBy(xpath = "/html/body/app-root/app-nosid-snackbar/nosid-snackbar/div/div[2]")
    public WebElement popUpAlteracaoSucesso;

    public homePO() {
        super();
    }


    public void validateStatusAutenticacao(String statusEsperado){
        
        Assert.assertEquals(statusAutenticacao.getText(), statusEsperado);
    }

    public void insertOrUpdateTheUsername(String username){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement butDetailsInformation = wait.until(ExpectedConditions.elementToBeClickable(detailInformacaoDeConta));

        if (butDetailsInformation.isEnabled()){
            butDetailsInformation.click();

            WebElement userNameField = wait.until(ExpectedConditions.elementToBeClickable(fieldUsername));

            userNameField.click();
            userNameField.sendKeys(Keys.PAGE_DOWN);
            userNameField.clear();
            userNameField.sendKeys(username);

            WebElement butGuardar = wait.until(ExpectedConditions.elementToBeClickable(buttonGuardar));

            if (butGuardar.isEnabled()){
                butGuardar.click();

                Assert.assertTrue(popUpAlteracaoSucesso.isEnabled());
            }
        }
    }

}

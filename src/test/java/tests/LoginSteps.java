package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.loginPO;
import page.homePO;

public class LoginSteps {

    public static loginPO loginPage;
    public static homePO homePage;



    @Given("^acesso a pagina de login da aplicacao$")
    public void acessoAPaginaDeLoginDaAplicacao() {
        WebDriver driver;
        String URL = "https://login.nos.pt";
        String LOCAL_DRIVER = "src/test/java/resource/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", LOCAL_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        loginPage = new loginPO(driver);
        homePage = new homePO(driver);

        loginPage.checkPopupCookies();
    }

    @And("^eu insiro o email \"([^\"]*)\"$")
    public void euInsiroOEmailCorreto(String email) {

        loginPage.insertEmail(email);
    }

    @And("^eu insiro o password \"([^\"]*)\"$")
    public void euInsiroOPasswordCorreto(String password) {
        loginPage.insertPassword(password);
        loginPage.checkPopupCookies();
    }

    @Then("^devo ser redirecionado para a pagina principal$")
    public void devoSerRedirecionadoParaAPaginaPrincipal() {

        loginPage.validationLoginSuccessfully();
    }

}

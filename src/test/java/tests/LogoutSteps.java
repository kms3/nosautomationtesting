package tests;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page.homePO;

public class LogoutSteps {

    @Given("^utilizador esteja logado com sucesso na plataforma$")
    public void utilizadorEstejaLogadoComSucessoNaPlataforma() {

        new LoginSteps().acessoAPaginaDeLoginDaAplicacao();
        new LoginSteps().euInsiroOEmailCorreto("karinamotaslv@gmail.com");
        new LoginSteps().euInsiroOPasswordCorreto("Nwkarinasilva23!");
        new LoginSteps().devoSerRedirecionadoParaAPaginaPrincipal();

    }

    @And("^ao clicar no botao terminar sessao$")
    public void aoClicarNoBotaoTerminarSessao(){

        LoginSteps.loginPage.finishSession();
    }

    @Then("^utilizador ser redirecionado para paginal de login$")
    public void utilizadorSeraRedirecionadoParaPaginaLogin(){
        //a validacao esta no finishSession();
    }
}

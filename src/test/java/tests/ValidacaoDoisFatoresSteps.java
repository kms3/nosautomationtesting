package tests;

import io.cucumber.java.en.Then;
import page.homePO;



public class ValidacaoDoisFatoresSteps {

    public static homePO homePage;

    @Then("^validar se o status atual da validacao de dois fatores seja \"([^\"]*)\"$")
    public void validarStatusDaValidacaoDeDoisFatores(String statusEsperado){

        LoginSteps.homePage.validateStatusAutenticacao(statusEsperado);

    }

}

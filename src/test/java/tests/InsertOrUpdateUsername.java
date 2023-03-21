package tests;

import io.cucumber.java.en.Then;
import page.homePO;



public class InsertOrUpdateUsername {

    public static homePO homePage;

    @Then("^ao clicar no campo username podera inserir o username \"([^\"]*)\" valido com sucesso$")
    public void validarStatusDaValidacaoDeDoisFatores(String username){

        LoginSteps.homePage.insertOrUpdateTheUsername(username);;

    }

}

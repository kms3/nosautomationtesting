package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import page.loginPO;
import page.homePO;

public class testscasesNOS extends baseTest {

    public static loginPO loginPage;
    public static homePO homePage;

    @BeforeClass
    public static void testPrepare() {
        loginPage = new loginPO(driver);
        homePage = new homePO(driver);
    }

    @Test
    public void testLoginSuccessfully() {
        loginPage.checkPopupCookies();
        loginPage.insertEmail("karinamotaslv@gmail.com");
        loginPage.insertPassword("Nwkarinasilva23!");
        loginPage.checkPopupCookies();
        loginPage.validationLoginSuccessfully();

    }

    @Test
    public void testLogout() {
        loginPage.checkPopupCookies();
        loginPage.insertEmail("karinamotaslv@gmail.com");
        loginPage.insertPassword("Nwkarinasilva23!");
        loginPage.checkPopupCookies();
        loginPage.validationLoginSuccessfully();
        loginPage.finishSession();

    }

    @Test
    public void validacaoStatusDoisFatores(){
        loginPage.checkPopupCookies();
        loginPage.insertEmail("karinamotaslv@gmail.com");
        loginPage.insertPassword("Nwkarinasilva23!");
        loginPage.checkPopupCookies();
        loginPage.validationLoginSuccessfully();
        homePage.validateStatusAutenticacao("Desativado");
    }

    @Test
    public void UpdateAnUserNameSuccessfully(){
        loginPage.checkPopupCookies();
        loginPage.insertEmail("karinamotaslv@gmail.com");
        loginPage.insertPassword("Nwkarinasilva23!");
        loginPage.checkPopupCookies();
        loginPage.validationLoginSuccessfully();
        homePage.insertOrUpdateTheUsername("karinasilva1215");
    }

}



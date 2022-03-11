package test.java.products.team_product_factory.web_defence_360;



import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.DefenceBase;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.ContractData;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.KladrValue;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.SparkValue;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.pages.BasePage;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.pages.ConfirmPage;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.pages.FormingPage;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.pages.PaymentPage;

import static com.codeborne.selenide.Selenide.sleep;

public class Defence extends DefenceBase {
    private FormingPage formingPage;
    private ConfirmPage confirmPage;
    private PaymentPage paymentPage;

    @BeforeMethod
    public void setUp(ITestContext context) {
        Selenide.open(testconfig.getStand().getHost() + "/defense360/");
        ContractData contractData = new ContractData();
        SparkValue sparkValue = new SparkValue();
        KladrValue kladrValue = new KladrValue();
        basepage = new BasePage(WebDriverRunner.getWebDriver(), contractData, sparkValue, kladrValue);
        formingPage = new FormingPage(WebDriverRunner.getWebDriver(), contractData, sparkValue, kladrValue);
        confirmPage = new ConfirmPage(WebDriverRunner.getWebDriver(), contractData, sparkValue, kladrValue);
        paymentPage = new PaymentPage(WebDriverRunner.getWebDriver(), contractData, sparkValue, kladrValue);
    }

    @org.testng.annotations.Test



    public void createPolicyUlWithSpark() {
        sleep(2000);
        basepage.checkBtnApplyPolicyIsViible();
        basepage.calculatePolicy();
        basepage.chooseTypeOfInsurer("Собственник");
        basepage.setNumberOfEmployees("Позитивный");
        basepage.addCovid19Protection();
        basepage.chooseObjectOfInsure(1);
        basepage.createPolicy();
//        formingPage.fillUlInfoSpark();
        formingPage.fillContactPhone("Позитивный");
//        formingPage.fillInsurerInfo();
        formingPage.activateCheckBoxPropertyAddressMatches();
        formingPage.createPolicy();
        sleep(4000);
        confirmPage.pressContinuieButton();

    }

    @Test
    public void createPolicyIpWithSpark() {
        basepage.calculatePolicy();
        basepage.chooseTypeOfInsurer("Арендатор");
        basepage.setNumberOfEmployees("Позитивный");
        basepage.addCovid19Protection();
        basepage.chooseObjectOfInsure(1);
        basepage.createPolicy();
        formingPage.fillIpInfoSpark();
        formingPage.fillContactPhone("Позитивный");
//        formingPage.fillInsurerInfo();
        formingPage.activateCheckBoxPropertyAddressMatches();
        formingPage.createPolicy();
    }
}

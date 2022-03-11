package ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.ContractData;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.KladrValue;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.SparkValue;
import ru.sberins.regressiontesting.services.helpers.TestHelpers;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;
import static ru.sberins.regressiontesting.services.allure.AllureLogger.logToAllure;

public class BasePage implements TestHelpers {

    protected WebDriver driver;
    protected ContractData contractData;
    protected SparkValue sparkValue;
    protected KladrValue kladrValue;

    public BasePage(WebDriver driver, ContractData contractData, SparkValue sparkValue, KladrValue kladrValue) {
        this.driver = driver;
        this.contractData = contractData;
        this.sparkValue = sparkValue;
        this.kladrValue = kladrValue;
    }


    //Buttons

    private final SelenideElement calculatePolicy = $(byText("Рассчитать")); // Кнопка рассчитать
    private final SelenideElement landlord = $(byText("Собственник здания/помещения")); // Собственник помещения
    private final SelenideElement tenant = $(byText("Арендую здание/помещение"));
    private final SelenideElement applyPromoCode = $(By.xpath("//button/span[text()=' Применить ']"));
    private final SelenideElement noFrachiseFirstSum = $(By.xpath("//table[1]/tr[2]/td[3]"));
    private final SelenideElement noFrachiseFirstAmmountIns = $(By.xpath("//table[1]/tr[2]/td[2]"));
    private final SelenideElement noFrachiseSecondSum = $(By.xpath("//table[1]/tr[3]/td[3]"));
    private final SelenideElement noFrachiseSecondAmmountIns = $(By.xpath("//table[1]/tr[3]/td[2]"));
    private final SelenideElement noFrachiseThirdSum = $(By.xpath("//table[1]/tr[4]/td[3]"));
    private final SelenideElement noFrachiseThirdAmmountIns = $(By.xpath("//table[1]/tr[4]/td[2]"));

    private final SelenideElement frachiseFirstSum = $(By.xpath("//table[2]/tr[2]/td[3]"));
    private final SelenideElement frachiseFirstAmmountIns = $(By.xpath("//table[2]/tr[2]/td[2]"));
    private final SelenideElement frachiseSecondSum = $(By.xpath("//table[2]/tr[3]/td[3]"));
    private final SelenideElement frachiseSecondAmmountIns = $(By.xpath("//table[2]/tr[3]/td[2]"));
    private final SelenideElement frachiseThirdSum = $(By.xpath("//table[2]/tr[4]/td[3]"));
    private final SelenideElement frachiseThirdAmmountIns = $(By.xpath("//table[2]/tr[3]/td[2]"));

    private final SelenideElement createPolicy = $(By.xpath("//button/span[text()=' Оформить полис ']"));
    private final SelenideElement errorPromoCode = $(By.xpath("//mat-error[text()=' Неверный промокод ']"));
//    private final SelenideElement applyReSendPolicy = $(By.xpath("//*[contains(text(), 'Применить')][2]"));


    //Fields

    private final SelenideElement numberOfEmployees = $(By.xpath("//input[@id='mat-input-2']"));
    private final SelenideElement promoCode = $(By.xpath("//input[@formcontrolname='promoCode']"));
    private final SelenideElement reSendPolicy = $(byText("Номер полиса/ИНН"));

    //CheckBoxes

    private final SelenideElement tickProtection = $(By.xpath("//div[text()='Защита от клеща']")); // Защита от клеща
    private final SelenideElement covid19Protection = $(By.xpath("//div[text()='Диагностирование COVID-19']"));

    //


    public void checkBtnApplyPolicyIsViible() {
        while (!frachiseFirstSum.is(visible)){
            sleep(2500);
            refresh();
        }
    }


    @Step("Добавление/ убирание  услуги 'Защита от клеща'")
    public void addTickProtection(){
        if (tickProtection.is(disabled)) {

            tickProtection
                    .shouldBe(visible)
                    .click();
            assertTrue(tickProtection
                    .is(enabled));
        }

        if (tickProtection.is(enabled)) {
            tickProtection
                    .shouldBe(visible)
                    .click();
            assertTrue(tickProtection
                    .is(disabled));
        }

        logToAllure("Услуга 'защита от клеща' добавлена / убрана");

    }

    @Step("Добавление/ убирание услуги 'Диагностирование COVID-19'")
    public void addCovid19Protection(){
        if (covid19Protection.is(disabled)) {
            covid19Protection
                    .shouldBe(visible)
                    .click();
            assertTrue(covid19Protection
                    .is(enabled));

        }
        if (covid19Protection.is(enabled)) {
            covid19Protection
                    .shouldBe(visible)
                    .click();
            assertTrue(covid19Protection
                    .is(disabled));
        }
        logToAllure("Услуга 'Диогностирование COVID-19' добавлена / убрана");
    }



    @Step("Использование промо кода")
    public void usePromoCode(String valid){
        if(valid.contains("Позитивный")){
        promoCode
                .shouldBe(visible)
                .setValue("PROMO");
        applyPromoCode
                .click();
        assertTrue(errorPromoCode
                .is(disappear));
        }

        if(valid.contains("Негативный")){
            promoCode
                    .shouldBe(visible)
                    .setValue(generateLatineText(7));
            applyPromoCode
                    .click();
            sleep(3000);
            assertTrue(errorPromoCode
                    .is(visible));
            refresh();

            promoCode
                    .shouldBe(visible)
                    .setValue(generateCyrillicText(7));
            applyPromoCode
                    .click();
            sleep(3000);
            assertTrue(errorPromoCode
                    .is(visible));
            refresh();

            promoCode
                    .shouldBe(visible)
                    .setValue(generateNumber(7));
            applyPromoCode
                    .click();
            sleep(3000);
            assertTrue(errorPromoCode
                    .is(visible));

        }
    }

    @Step("Выбор количества страхователей")
    public void setNumberOfEmployees(String valid){
        if (valid.contains("Позитивный")){
            int number = getRandomInt(1,50);
            numberOfEmployees
                    .setValue("" + number).pressEnter();
            assertEquals(numberOfEmployees.getValue(),"" + number + "" );
        }
        if (valid.contains("Негативный")){
            numberOfEmployees
                    .setValue(generateCyrillicText(10)).pressEnter();
            assertEquals(numberOfEmployees.getValue(),"1");

            numberOfEmployees
                    .setValue(generateLatineText(7)).pressEnter();
            assertEquals(numberOfEmployees.getValue(),"1");

            numberOfEmployees
                    .setValue("0").pressEnter();
            assertEquals(numberOfEmployees.getValue(),"1");

            numberOfEmployees
                    .setValue("" + getRandomInt(51, 100000000)).pressEnter();
            assertEquals(numberOfEmployees.getValue(),"50");
        }

    }


    public void createPolicy() {
        createPolicy.shouldBe(visible).click();
    }

    public void calculatePolicy() {
        calculatePolicy.click();
    }


    @Step("Выбор типа страхователя")
    public void chooseTypeOfInsurer(String insurer){

        if (insurer.contains("Собственник")) {
            landlord
                    .shouldBe(visible)
                    .click();
            assertEquals("Собственник здания/помещения", landlord.getText());
        }
        if (insurer.contains("Арендатор")){
            tenant
                    .shouldBe(visible)
                    .click();
            assertEquals("Арендую здание/помещение", tenant.getText());
        }
        logToAllure("Выбран тип страхователя: " + insurer);
    }

    @Step("Выбор тарифа страхования")
    public void chooseObjectOfInsure(int randomize) {
        switch (randomize) {
            case 1:
                contractData.setPolicyAmmount(noFrachiseFirstSum.getText());
                contractData.setpolicyInsureAmmount(noFrachiseFirstAmmountIns.getText());
                noFrachiseFirstSum.click();
                break;
            case 2:
                contractData.setPolicyAmmount(noFrachiseSecondSum.getText());
                contractData.setpolicyInsureAmmount(noFrachiseSecondAmmountIns.getText());
                noFrachiseSecondSum.click();
                break;
            case 3:
                contractData.setPolicyAmmount(noFrachiseThirdSum.getText());
                contractData.setpolicyInsureAmmount(noFrachiseThirdAmmountIns.getText());
                noFrachiseThirdSum.click();
                break;
            case 4:
                contractData.setPolicyAmmount(frachiseFirstSum.getText());
                contractData.setpolicyInsureAmmount(frachiseFirstAmmountIns.getText());
                frachiseFirstSum.click();
                break;
            case 5:
                contractData.setPolicyAmmount(frachiseSecondSum.getText());
                contractData.setpolicyInsureAmmount(frachiseSecondAmmountIns.getText());
                frachiseSecondSum.click();
                break;
            case 6:
                contractData.setPolicyAmmount(frachiseThirdSum.getText());
                contractData.setpolicyInsureAmmount(frachiseThirdAmmountIns.getText());
                frachiseThirdSum.click();
                break;
            default:
                break;
        }
        logToAllure("Тариф страхования выбран, страховая премия равна " + contractData.getPolicyAmmount());
    }

    @Step("Проходим страницу BasePage")
    public void goToFormingPage() {
        chooseObjectOfInsure(2);
        createPolicy();
    }
}

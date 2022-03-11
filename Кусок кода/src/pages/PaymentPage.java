package ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.pages;

import org.openqa.selenium.WebDriver;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.ContractData;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.KladrValue;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.SparkValue;

public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver driver, ContractData contractData, SparkValue sparkValue, KladrValue kladrValue) {
        super(driver, contractData, sparkValue, kladrValue);
    }
}
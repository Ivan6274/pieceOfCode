package ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.ContractData;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.KladrValue;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.SparkValue;


import static com.codeborne.selenide.Selenide.$;

public class ConfirmPage extends BasePage{
    public ConfirmPage(WebDriver driver, ContractData contractData, SparkValue sparkValue, KladrValue kladrValue) {
        super(driver, contractData, sparkValue, kladrValue);
    }
// Check boxes
    private final SelenideElement dataIsCorrect = $(By.xpath("//*[contains(text(), 'Данные проверены и не содержат')]"));
    private final SelenideElement applyDataIsFull = $(By.xpath("//*[contains(text(), 'Подтверждаю, что вышеуказанные')]"));
    private final SelenideElement insurerInfoIsFull = $(By.xpath("//*[contains(text(), 'Подтверждаю, что до заключения')]"));

// Buttons

    private final SelenideElement continuieButton = $(By.xpath("//*[contains(text(), 'Продолжить')]"));

// Подтверждение проверки данных и нажатие кнопки "Продолжить"

    public void pressContinuieButton() {
        dataIsCorrect.shouldBe(Condition.visible).click();
        applyDataIsFull.shouldBe(Condition.visible).click();
        insurerInfoIsFull.shouldBe(Condition.visible).click();
        continuieButton.shouldBe(Condition.visible).click();
    }

}

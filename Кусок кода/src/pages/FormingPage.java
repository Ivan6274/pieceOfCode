package ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.ContractData;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.KladrValue;
import ru.sberins.regressiontesting.products.team_product_factory.web_defence_360.data.SparkValue;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.AssertJUnit.*;
import static ru.sberins.regressiontesting.services.allure.AllureLogger.logToAllure;

public class FormingPage extends BasePage {
    public FormingPage(WebDriver driver, ContractData contractData, SparkValue sparkValue, KladrValue kladrValue) {
        super(driver, contractData, sparkValue, kladrValue);
    }


    //Buttons

    private final SelenideElement typeOfInsurerUL = $(By.xpath("//span[text()=' Юридическое лицо ']"));
    private final SelenideElement typeOfInsurerIP = $(By.xpath("//span[text()=' Индивидуальный предприниматель ']"));
    private final SelenideElement maleInsurer = $(By.xpath("//*[contains(text(), 'Мужской')][1]"));
    private final SelenideElement femaleInsurer = $(By.xpath("//*[contains(text(), 'Женский')][1]"));
    private final SelenideElement citizenshipRF = $(By.xpath("//*[contains(text(), 'Гражданин РФ')]"));
    private final SelenideElement citizenshipIG = $(By.xpath("//*[contains(text(), 'Иностранный гражданин')]"));
    private final SelenideElement createPolicy = $(By.xpath("//button[2]"));
    private final SelenideElement backButton = $(By.xpath("//button/span[text()='Назад']"));

    //Fields

    private final SelenideElement autoSearch = $(By.xpath("//input[@formcontrolname='autoSearch']"));
    private final SelenideElement contactPhone = $(By.xpath("//input[@type='phone']"));
    private final SelenideElement contactEmail = $(By.xpath("//input[@formcontrolname='contactEmail']"));
    private final SelenideElement additionalEmail = $(By.xpath("//input[@formcontrolname='additionalEmail']"));
    private final SelenideElement insurerLastName = $(By.xpath("/input[@formcontrolname='insurerLastName']"));
    private final SelenideElement insurerName = $(By.xpath("//input[@formcontrolname='insurerName']"));
    private final SelenideElement insurerMiddleName = $(By.xpath("//input[@formcontrolname='insurerMiddleName']"));
    private final SelenideElement insurerBirthday = $(By.xpath("//input[@formcontrolname='insurerBirthday']"));
    private final SelenideElement insurerInn = $(By.xpath("//input[@formcontrolname='insurerInn']"));
    private final SelenideElement registrationRegion = $(By.xpath("//input[@formcontrolname='registrationRegion']"));
    private final SelenideElement registrationCity = $(By.xpath("//input[@formcontrolname='registrationCity']"));
    private final SelenideElement registrationStreet = $(By.xpath("//input[@formcontrolname='registrationStreet'"));
    private final SelenideElement registrationHouse = $(By.xpath("//input[@formcontrolname='registrationHouse']"));
    private final SelenideElement reistrationFlat = $(By.xpath("//input[@formcontrolname='registrationFlat']"));
    private final SelenideElement ulRegistrationCountry = $(By.xpath("//input[@formcontrolname='registrationCountry']"));
    private final SelenideElement ulFullName = $(By.xpath("//input[@formcontrolname='insurerFullName']"));
    private final SelenideElement ulInn = $(By.xpath("//input[@formcontrolname='inn']"));
    private final SelenideElement ulKpp = $(By.xpath("//input[@formcontrolname='kpp']"));
    private final SelenideElement ulOgrn = $(By.xpath("//input[@formcontrolname='ogrn']"));
    private final SelenideElement lastName = $(By.xpath("//input[@formcontrolname='lastName']"));
    private final SelenideElement firstName = $(By.xpath("//input[@formcontrolname='firstName']"));
    private final SelenideElement middleName = $(By.xpath("//input[@formcontrolname='middleName']"));
    private final SelenideElement birthDate = $(By.xpath("//input[@formcontrolname='birthDate']"));
    private final SelenideElement propertyRegion = $(By.xpath("//input[@formcontrolname='propertyRegion']"));
    private final SelenideElement propertyCity = $(By.xpath("//input[@formcontrolname='propertyCity']"));
    private final SelenideElement propertyStreet = $(By.xpath("//input[@formcontrolname='propertyStreet']"));
    private final SelenideElement propertyHouse = $(By.xpath("//input[@formcontrolname='propertyHouse']"));
    private final SelenideElement propertyFlat = $(By.xpath("//input[@formcontrolname='propertyFlat']"));

    // CheckBoxes

    private final SelenideElement fillManual = $(By.xpath("//*[contains(text(), 'Заполнить вручную')]"));
    private final SelenideElement ipMiddleNameIsEmpty = $(By.xpath("//*[contains(text(), 'Отчество отсутствует')]"));
    private final SelenideElement propertyAddressMatches = $(By.xpath("//*[contains(text(), 'Адрес имущества совпадает')]"));
    private final SelenideElement streetIsEmpty = $(By.xpath("//mat-checkbox[@formcontrolname='withoutStreet']"));
    private final SelenideElement tickProtection = $(By.xpath("//*[contains(text(), 'Защита от клеща')]"));
    private final SelenideElement covid19Protection = $(By.xpath("//*[contains(text(), 'Диагностирование COVID')]"));
    private final SelenideElement propertyWithOutStreet = $(By.xpath("//*[contains(text(), 'Улица отсутствует')]"));
    private final SelenideElement insurerMiddleNameIsEmpty = $(By.xpath("//mat-checkbox[@formcontrolname='isEmptyMiddleName']"));

    // Choose SPARK

    private final SelenideElement chooseUlFullNameByName = $(By.xpath("//mat-option/span[text()=' ПАО \"ДЕТСКИЙ МИР\" ']"));
    private final SelenideElement chooseUlFullNameByInn = $(By.xpath("//mat-option/span[text()=' ООО \"ПУШКИНСКАЯ ПЛОЩАДЬ\" ']"));
    private final SelenideElement chooseUlFullNameByOgrn = $(By.xpath("//mat-option/span[text()=' ООО \"ЖЕМЧУЖИНА ПРИВЕТНОГО\" ']"));
    private final SelenideElement chooseIPFullNameByFio = $(By.xpath("//mat-option/span[text()=' Адамян Георгий Феликсович ']"));
    private final SelenideElement chooseIPFullNameByInn = $(By.xpath("//mat-option/span[text()=' Иванов Иван Сергеевич ']"));
    private final SelenideElement chooseIPFullNameByOgrnip = $(By.xpath("//mat-option/span[text()=' Иванов Иван Иванович ']"));

    // Choose KLADR

    private final SelenideElement chooseRegion = $(By.xpath("//div[@role='listbox']//span[text()=' Московская обл '])"));
    private final SelenideElement chooseCity = $(By.xpath("//div[@role='listbox']//span[text()=' Подольск г '])"));
    private final SelenideElement chooseStreet = $(By.xpath("//div[@role='listbox']//span[text()=' Февральская ул ']"));


    // Field to Equal

    private final SelenideElement countryOfRegistration = $(By.xpath("//div[1]/span[2]"));
    private final SelenideElement fullUlName = $(By.xpath("//div[2]/span[2]"));
    private final SelenideElement innKppOgrn = $(By.xpath("//div[3]/span[2]"));
    private final SelenideElement urAdress = $(By.xpath("//div[4]/span[2]"));

    // Incorrect input

    private final SelenideElement incorrectPhone = $(By.xpath("//mat-error[text()='Телефон введен некорректно']"));
    private final SelenideElement incorrectEmail = $(By.xpath("//mat-error[text()='Email введен некорректно']"));

    @Step("Выбор типа страхователя ЮЛ/ИП")
    public void chooseTypeInsurer(String typeInsurer) {
        if (typeInsurer.contains("ЮЛ")) {
            typeOfInsurerUL
                    .shouldBe(Condition.visible)
                    .click();
            contractData.setTypeOfInsurer(typeOfInsurerUL.getText());
        }
        if (typeInsurer.contains("ИП")) {
            typeOfInsurerIP.shouldBe(Condition.visible).hover().click();
            contractData.setTypeOfInsurer(typeOfInsurerIP.getText());
        }
        logToAllure("Выбран страхователь " + typeInsurer);
    }

    @Step("Проверка работы системы СПАРК")
    public void fillSpark(String spark) {
        switch (spark) {

            case "TITLE_UL":
                autoSearch
                        .sendKeys("Детский ");
                sleep(1000);
                autoSearch
                        .sendKeys("Мир");
                sleep(1000);
                autoSearch
                        .sendKeys(" ");
                chooseUlFullNameByName
                        .shouldBe(visible)
                        .click();
                assertEquals(autoSearch.getValue(), "ПАО \"ДЕТСКИЙ МИР\": 7729355029");
                break;

            case "INN_YUL":
                autoSearch
                        .shouldBe(visible)
                        .setValue("9710084080")
                        .sendKeys(" ");
                chooseUlFullNameByInn
                        .shouldBe(visible)
                        .click();
                assertEquals(autoSearch.getValue(), "ООО \"ПУШКИНСКАЯ ПЛОЩАДЬ\": 9710084080");
                break;
            case "OGRN":
                autoSearch
                        .shouldBe(visible)
                        .setValue("1149102075715")
                        .sendKeys(" ");
                chooseUlFullNameByOgrn
                        .shouldBe(visible)
                        .click();
                assertEquals(autoSearch.getValue(), "ООО \"ЖЕМЧУЖИНА ПРИВЕТНОГО\": 9101002561");

                break;
            case "FIO":
                autoSearch
                        .shouldBe(visible)
                        .sendKeys("Адамян ");
                sleep(1000);
                autoSearch
                        .sendKeys("Георгий ");
                sleep(1000);
                autoSearch
                        .sendKeys("Феликсович");
                sleep(1000);
                autoSearch
                        .sendKeys(" ");

                chooseIPFullNameByFio
                        .shouldBe(visible)
                        .click();
                assertEquals(autoSearch.getValue(), "Адамян Георгий Феликсович: 772576978959");

                break;

            case "INN_IP":
                autoSearch
                        .shouldBe(visible)
                        .setValue("694301910237")
                        .sendKeys(" ");
                chooseIPFullNameByInn
                        .shouldBe(visible)
                        .click();
                assertEquals(autoSearch.getValue(), "Иванов Иван Сергеевич: 694301910237");

                break;

            case "OGRNIP":
                autoSearch
                        .shouldBe(visible)
                        .setValue("313366811900090")
                        .sendKeys(" ");
                chooseIPFullNameByOgrnip
                        .shouldBe(visible)
                        .click();
                assertEquals(autoSearch.getValue(), "Иванов Иван Иванович: 366105845725");
                break;
        }
    }

    @Step("Валидация номера телефона")
    public void fillContactPhone(String phone) {
        if (phone.contains("Позитивный")) {
            contactPhone
                    .setValue(getRandomMobile())
                    .pressEnter();
            assertTrue(incorrectPhone.is(disappear));
        }
        if (phone.contains("Негативный")) {
            contactPhone
                    .setValue(generateCyrillicText(8))
                    .pressEnter();
            assertTrue(incorrectPhone.is(visible));
            contactPhone
                    .setValue(generateLatineString(8))
                    .pressEnter();
            assertTrue(incorrectPhone.is(visible));
            contactPhone
                    .setValue(generateCyrillicTextExcludeDuplicatedSpaces(8))
                    .pressEnter();
            assertTrue(incorrectPhone.is(visible));
            contactPhone
                    .setValue(generateNumber(getRandomInt(1, 7)))
                    .pressEnter();
            assertTrue(incorrectPhone.is(visible));
        }
    }

    @Step("Валидация Email")
    public void fillEmail(String mail) {
        if (mail.contains("Позитивный")) {
            contactEmail
                    .setValue(getRandomMobileWithoutPlusSeven())
                    .pressEnter();
            assertTrue(incorrectEmail.is(disappear));
        }
        if (mail.contains("Негативный")) {
            contactEmail
                    .setValue(generateNumber(10))
                    .pressEnter();
            assertTrue(incorrectEmail.is(visible));
            contactEmail
                    .setValue(generateCyrillicText(8))
                    .pressEnter();
            assertTrue(incorrectEmail.is(visible));
            contactEmail
                    .setValue(generateLatineString(8))
                    .pressEnter();
            assertTrue(incorrectEmail.is(visible));
        }
    }

    @Step("Заполнение имени застрахованного")
    public void fillInsurerFirstName(String value, String name) {
        if (value.contains("Позитивный")) {
            firstName
                    .setValue(name)
                    .pressEnter();
            assertEquals(firstName.getValue(), name);
        }
        if (value.contains("Негативный")) {
            firstName
                    .setValue(generateLatineFio(9))
                    .pressEnter();
            assertEquals(firstName.getValue(), "");

            firstName
                    .setValue(generateNumber(5))
                    .pressEnter();
            assertEquals(firstName.getValue(), "");
        }
    }

    @Step("Заполнение фамилии застрахованного")
    public void fillInsurerLastName(String value, String surname) {
        if (value.contains("Позитивный")) {
            lastName
                    .setValue(surname)
                    .pressEnter();
            assertEquals(lastName.getValue(), surname);
        }
        if (value.contains("Негативный")) {
            lastName
                    .setValue(generateLatineFio(9))
                    .pressEnter();
            assertEquals(lastName.getValue(), "");

            lastName
                    .setValue(generateNumber(5))
                    .pressEnter();
            assertEquals(lastName.getValue(), "");
        }
    }

    @Step("Заполнение отчества застрахованного")
    public void fillInsurerMiddleName(String value, String mdname) {
        if (value.contains("Позитивный")) {
            middleName
                    .setValue(mdname)
                    .pressEnter();
            assertEquals(middleName.getValue(), mdname);
        }
        if (value.contains("Негативный")) {
            middleName
                    .setValue(generateLatineFio(9))
                    .pressEnter();
            assertEquals(middleName.getValue(), "");

            middleName
                    .setValue(generateNumber(5))
                    .pressEnter();
            assertEquals(middleName.getValue(), "");
        }
    }

    @Step("Заполнение даты рождения застрахованного")
    public void fillInsurerBirthday(String value, String bDay) {
        if (value.contains("Позитивный")) {
            birthDate
                    .setValue(bDay)
                    .pressEnter();
            assertEquals(birthDate.getValue(), bDay);
        }
        if (value.contains("Негативный")) {
            birthDate
                    .setValue(generateLatineFio(9))
                    .pressEnter();
            assertEquals(birthDate.getValue(), "");

            birthDate
                    .setValue(generateFio(5))
                    .pressEnter();
            assertEquals(birthDate.getValue(), "");
        }
    }

    @Step("Использование чек бокса 'Отчество отсутвует'")
    public void useCheckBoxMiddleNameIsEmpty() {
        insurerMiddleNameIsEmpty
                .shouldBe(visible)
                .click();
        assertTrue(middleName.is(disabled));
    }

    @Step("Использование чек бокса 'Адрес имущества совпадает с адресом регистрации'")
    public void useCheckBoxAddressEqualsRegistration() {
        propertyAddressMatches
                .shouldBe(visible)
                .click();
        assertFalse(propertyRegion.is(visible));
    }

    @Step("Заполнение адреса имущества несовпадающего с адресом регистрации")
    public void fillPropertyAddress(String city, String street) {
        propertyRegion
                .shouldBe(visible)
                .click();
        chooseRegion
                .shouldBe(visible)
                .click();
        assertEquals(propertyRegion.getValue(), "Московская обл");
        propertyCity
                .hover()
                .setValue(city);
        sleep(1000);
        chooseCity
                .shouldBe(visible)
                .click();
        assertEquals(propertyCity.getValue(), "Подольск г");
        propertyStreet
                .setValue(street);
        sleep(1000);
        chooseStreet
                .shouldBe(visible)
                .click();
        assertEquals(propertyStreet.getValue(), "Февральская ул");
        propertyHouse
                .setValue(generateNumber(2));
        propertyFlat
                .setValue(generateNumber(3));
    }

//        contractData.setLastNameInsurer(lastName.getValue());
//        contractData.setNameInsurer(firstName.getValue());
//        contractData.setMiddleNameInsurer(middleName.getValue());
//        contractData.setBirthDateIsurer(birthDate.getValue());


    // Заполнение вручную данных ЮЛ
    public void manualFillInfoUL() {
        fillManual.click();
        ulRegistrationCountry.setValue("Росс");
        sleep(2000);
        $(By.xpath("//*[contains(text(), 'Российская')]")).shouldBe(Condition.visible).click();
        ulFullName.setValue("ООО Бурелом");
        ulInn.setValue("7734675810");
        ulKpp.setValue("773401001");
        ulOgrn.setValue("1127746183135");
        sparkValue.setUlRegistrationCountry(ulRegistrationCountry.getValue());
        sparkValue.setUlFullName(ulFullName.getValue());
        sparkValue.setUlInn(ulInn.getValue());
        sparkValue.setUlKpp(ulKpp.getValue());
        sparkValue.setUlOgrn(ulOgrn.getValue());
        fillManualAdress();
    }

    // Ввод адреса регистрации клиента ИП/ЮЛ
    public void fillManualAdress() {
        registrationRegion.setValue("Московская");
        $(byText("Московская обл")).shouldBe(Condition.visible).click();
        sleep(2000);
        registrationCity.shouldBe(Condition.visible).setValue("Подоль");
        sleep(2000);
        $(By.xpath("//*[contains(text(), 'Подольск')]")).shouldBe(Condition.visible).click();
        sleep(2000);
        registrationStreet.setValue("Революцион");
        sleep(2000);
        $(By.xpath("//*[contains(text(), 'Революционный')]")).shouldBe(Condition.visible).click();
        registrationHouse.setValue("123");
        reistrationFlat.setValue("22а");
        kladrValue.setRegistrationRegion(registrationRegion.getValue());
        kladrValue.setRegistrationCity(registrationCity.getValue());
        kladrValue.setRegistrationStreet(registrationStreet.getValue());
        kladrValue.setRegistrationHouse(registrationHouse.getValue());
        kladrValue.setReistrationFlat(reistrationFlat.getValue());
    }


    // Запись значений ЮЛ после погрузки СПАРК
    public void setInfoUl() {
        contractData.setCountryOfRegistration(countryOfRegistration.shouldBe(Condition.visible).getText());
        contractData.setFullUlName(fullUlName.shouldBe(Condition.visible).getText());
        contractData.setInnKppOgrn(innKppOgrn.shouldBe(Condition.visible).getText());
        contractData.setUrAdress(urAdress.shouldBe(Condition.visible).getText());

    }

    // Заполнение данных ИП используя сервис СПАРК
    public void fillIpInfoSpark() {
        typeOfInsurerIP.click();
        autoSearch.setValue("Корчажников Александр");
        sleep(4000);
        $(By.xpath("//*[contains(text(), 'Вячеславович')]")).click();
        fillManual.click();
        sleep(3000);
        insurerBirthday.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        insurerBirthday.setValue("02021988");
        fillManualAdress();

    }

    // Ручное заполнение данных ИП
    public void fillInfoIpWithOutSpark() {
        chooseTypeOfInsurer("ЮЛ");
        fillManual.click();
        sleep(1000);
        fillManualInfo();
        chooseGenderIP(maleInsurer);
        fillManualAdress();
    }

    public void fillManualInfo() {
        insurerLastName.setValue("Тестов");
        insurerName.setValue("Тест");
        insurerMiddleName.setValue("Тестович");
        insurerBirthday.setValue("01012000");
        insurerInn.setValue("123456789012");

        contractData.setiPInsurerName(insurerName.getValue());
        contractData.setiPInsurerLastName(insurerLastName.getValue());
        contractData.setiPInsurerMiddleName(insurerMiddleName.getValue());
        contractData.setiPInsurerBirthDate(insurerBirthday.getValue());
        contractData.setiPInnInsurer(insurerInn.getValue());

    }


    // Чек бокс "Адрес имущества совпадает с адресом регистрации"
    public void activateCheckBoxPropertyAddressMatches() {
        propertyAddressMatches.click();
    }

    // Чек бокс "Защита от клеща"
    public void activateTickProtection() {
        tickProtection.click();
    }

    // Чек бокс "Диагностирование КОВИД19"
    public void activateCOVID19Protection() {
        covid19Protection.click();
    }

    // кнопка "Оформить полис"
    public void createPolicy() {
        sleep(2000);
        createPolicy.shouldBe(Condition.visible).hover().click();
    }

    // Заполнение адреса застрахованного имущества (если отличается от адреса регистрации)
    public void fillInsuredAdress() {
        propertyRegion.setValue("Московская ");
        $(byText("Московская обл")).shouldBe(Condition.visible).click();
        sleep(2000);
        propertyCity.shouldBe(Condition.visible).setValue("Подол");
        propertyCity.sendKeys(Keys.chord(Keys.CONTROL, "v"));
        sleep(2000);
        $(By.xpath("//*[contains(text(), 'Подольск')]")).shouldBe(Condition.visible).click();
        sleep(2000);
        propertyStreet.setValue("Революци");
        sleep(2000);
        $(By.xpath("//*[contains(text(), 'Революционный ')]")).shouldBe(Condition.visible).click();
        propertyHouse.setValue("123");
        propertyFlat.setValue("22а");
        kladrValue.setPropertyRegion(propertyRegion.getValue());
        kladrValue.setPropertyCity(propertyCity.getValue());
        kladrValue.setPropertyStreet(propertyStreet.getValue());
        kladrValue.setPropertyHouse(propertyHouse.getValue());
        kladrValue.setPropertyFlat(propertyFlat.getValue());


    }

    // Выбор гражданства ИП
    public void chooseCitizenship(SelenideElement citizenship) {
        if (citizenship == citizenshipRF) {
            citizenship.shouldBe(Condition.visible).click();
        }
        if (citizenship == citizenshipIG) {
            citizenship.shouldBe(Condition.visible).click();
        }
        contractData.setCitizenshipIns(citizenship.getText());
    }

    // Выбор пола ИП
    public void chooseGenderIP(SelenideElement genderIP) {
        if (genderIP == maleInsurer) {
            genderIP.shouldBe(Condition.visible).click();
        }
        if (genderIP == femaleInsurer) {
            genderIP.shouldBe(Condition.visible).click();
        }
        contractData.setGenderIP(genderIP.getText());
    }


    public void activateMiddleNameIpIsEmpty() {
        ipMiddleNameIsEmpty.click();
    }

    public void pressBtnBack() {
        backButton
                .shouldBe(Condition.visible)
                .click();
    }


}


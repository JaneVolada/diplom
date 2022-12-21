package ru.netology.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CardPaymentPage {
    private SelenideElement formPayment = $(byText("Оплата по карте"));
    private SelenideElement cardNumberField = $(byText("Номер карты"));
    private SelenideElement monthField = $(byText("Месяц"));
    private SelenideElement yearField = $(byText("Год"));
    private SelenideElement ownerField = $(byText("Владелец"));
    private SelenideElement cvcField = $(byText("CVC/CVV"));
    private SelenideElement continueButton = $(byText("Продолжить"));

    public CardPaymentPage() {
        formPayment.shouldBe(Condition.visible);
    }

    public void fillingPaymentForm (DataHelper.CardInfo cardInfo) {
        cardNumberField.setValue(cardInfo.getCardNumber());
        monthField.setValue(cardInfo.getMonth());
        yearField.setValue(cardInfo.getYear());
        ownerField.setValue(cardInfo.getName());
        cvcField.setValue(cardInfo.getCvc());
        continueButton.click();
    }
    private SelenideElement successNotification = $(byText("Успешно"))
            .shouldBe(visible, Duration.ofSeconds(15));
    private SelenideElement errorNotification = $(byText("Ошибка"))
            .shouldBe(visible, Duration.ofSeconds(15));

    private SelenideElement formatError = $(byText("Неверный формат"))
            .shouldBe(visible);;
    private SelenideElement ownerRequiredField = $(byText("Поле обязательно для заполнения"))
            .shouldBe(visible);;
    private SelenideElement expiredLastMonthField = $(byText("Невено указан срок действия карты"))
            .shouldBe(visible);;
    private SelenideElement expiredLastYearField = $(byText("Истек срок действия карты"))
            .shouldBe(visible);;



    public void successfulPayment() {
        successNotification.shouldBe(visible, Duration.ofSeconds(15));
    }
    public void errorPayment() {
        errorNotification.shouldBe(visible, Duration.ofSeconds(15));
    }
    public void requiredField() {
        ownerRequiredField.shouldBe(visible);
    }
    public void invalidFormatField() {
        formatError.shouldBe(visible);
    }
    public void expiredLastMonth() {
        expiredLastMonthField.shouldBe(visible);
    }
    public void expiredLastYear() {
        expiredLastYearField.shouldBe(visible);
    }




}

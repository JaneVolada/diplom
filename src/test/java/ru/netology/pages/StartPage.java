package ru.netology.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StartPage {
    private SelenideElement cardPaymentButton = $(byText("Купить"));
    private SelenideElement creditCardButton = $(byText("Ккупить в кредит"));

    public CardPaymentPage cardPayment() {
        cardPaymentButton.click();
        return new CardPaymentPage();
    }
    public CreditCardPage creditCard() {
        creditCardButton.click();
        return new CreditCardPage();
    }

}

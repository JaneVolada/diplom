package ru.netology.data;
import com.github.javafaker.Faker;
import lombok.Data;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHelper {
    private DataHelper(){
    }
    static Faker faker = new Faker(new Locale("en"));

    @Value
    public static class CardInfo{
        private String cardNumber;
        private String month;
        private String year;
        private String name;
        private String cvc;
    }
    public static CardInfo getCardInfoValidValues () {
        return new CardInfo("444444444441",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoCardNumberDeclined(){
        return new CardInfo("444444444442",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoCardNumberNull(){
        return new CardInfo("000000000000",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoCardNumberEmpty(){
        return new CardInfo(" ",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoCardNumberLess(){
        return new CardInfo("111111",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoMonthEmpty() {
        return new CardInfo("444444444441",
                " ",
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoMonthNull() {
        return new CardInfo("444444444441",
                "00",
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoMonthMore() {
        return new CardInfo("444444444441",
                "13",
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoExpiredLastMonth() {
        return new CardInfo("444444444441",
                LocalDate.now().minusMonths(1).format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoYearEmpty() {
        return new CardInfo("444444444441",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                " ",
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoExpiredLastYear() {
        return new CardInfo("444444444441",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().minusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(),
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoOwnerEmpty() {
        return new CardInfo("444444444441",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                " ",
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoCyrillicName() {
        return new CardInfo("444444444441",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                "Иван Петров",
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoSymbolName() {
        return new CardInfo("444444444441",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                "123456%)",
                Integer.toString(faker.number().numberBetween(100,999)));
    }
    public static CardInfo getCardInfoCVCEmpty() {
        return new CardInfo("444444444441",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(), " ");
    }
    public static CardInfo getCardInfoCVCNull() {
        return new CardInfo("444444444441",
                LocalDate.now().format(DateTimeFormatter.ofPattern("MM")),
                LocalDate.now().plusYears(1).format(DateTimeFormatter.ofPattern("yy")),
                faker.name().firstName() + " " + faker.name().lastName(), "000");
    }


}

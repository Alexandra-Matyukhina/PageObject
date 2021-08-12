package ru.netology.web.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCode(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class CardInfo {
        private String cardNumber;
        private String cardBalance;
    }

    public static CardInfo getFirstCardInformation() {
        return new CardInfo("5559000000000001", "10000");
    }

    public static CardInfo getSecondCardInformation() {
        return new CardInfo("5559000000000002", "10000");
    }

    public static int checkBalanceOfWriteOffCard(int balance, int amountForTransfer) {
        int finalBalance = balance - amountForTransfer;
        return finalBalance;
    }

    public static int checkBalanceOfRechargeCard(int balance, int amountForTransfer) {
        int finalBalance = balance + amountForTransfer;
        return finalBalance;
    }
}
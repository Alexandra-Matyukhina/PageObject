package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private static SelenideElement amountField = $("[data-test-id=\"amount\"] input");
    private static SelenideElement fromField = $("[data-test-id=from] input");
    private SelenideElement toField = $("[data-test-id=to] input");
    private static SelenideElement transferButton = $("[data-test-id=action-transfer]");
    private SelenideElement cancelButton = $("[data-test-id=action-cancel]");

    public static void rechargeCard(DataHelper.CardInfo fromCardInfo) {
        String amountToAddForTest = "550";
        amountField.setValue(amountToAddForTest);
        fromField.setValue(fromCardInfo.getCardNumber());
        transferButton.click();
    }
}

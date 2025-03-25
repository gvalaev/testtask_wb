package pageobject;

import io.qameta.allure.Step;

import static steps.SeleniumSteps.openPage;

public class ProductCard {

    private static final String productCardPageUrl = "https://www.wildberries.ru/catalog/264220770/detail.aspx";

    @Step("Открываем страницу карточки товара")
    public void openMainPage() {
        openPage(productCardPageUrl);
    }
}

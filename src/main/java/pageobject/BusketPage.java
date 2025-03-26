package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static steps.CheckSteps.checkIfElementIsDisplayed;
import static steps.SeleniumSteps.openPage;
import static steps.WaitSteps.waitForElementToBeVisible;

public class BusketPage {
    private static final String basketPageUrl = "https://www.wildberries.ru/lk/basket";
    private static final By basketPageTitle = By.xpath("//h1[contains(@class, 'basket-section__header')]");
    private static final By emptyBasketElement = By.xpath("//div[@class='basket-empty__wrap empty-page']");
    private static final By addedGood = By.xpath("//a[@title = 'Щелкунчик по балету Чайковского. Сказка для детей 3-6 лет']");

    @Step("Проверяем, что мы на странице корзины")
    public BusketPage openedBusketPage() {
        waitForElementToBeVisible(basketPageTitle);
        return this;
    }

    @Step("Открываем страницу корзины")
    public BusketPage openBusketPage() {
        openPage(basketPageUrl);
        checkIfElementIsDisplayed(emptyBasketElement);
        return this;
    }

    @Step("Проверяем, что искомый товар в корзину добавлен")
    public BusketPage goodsAddedToBusket() {
        checkIfElementIsDisplayed(addedGood);
        return this;
    }
}

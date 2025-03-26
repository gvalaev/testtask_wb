package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static steps.SeleniumSteps.clickButton;
import static steps.SeleniumSteps.openPage;
import static steps.WaitSteps.waitForElementToBeClickable;
import static steps.WaitSteps.waitForElementToBeVisible;

public class ProductCardPage {

    private static final String productCardPageUrl = "https://www.wildberries.ru/catalog/264220770/detail.aspx";
    private static final By okeyCookiesButton = By.xpath("//button[@class='cookies__btn btn-minor-md']");
    private static final By productPageTitle = By.xpath("//h1[@class='product-page__title']");
    //Длинный локатор, т.к. на странице две одинаковые кнопки. Нужно выбрать вторую
    private static final By addToBusketButton = By.xpath("//div[@class='product-page__order-buttons']//button[@aria-label='Добавить в корзину']");
    private static final By goodsInBusket = By.xpath("//span[contains(@class, 'navbar-pc__notify')]");
    //По-другому выбираю из двух кнопок нужную
    private static final By goToBusketFirstButton = By.xpath("(//a[text()[contains(., 'Перейти в корзину')]])[2]");
    private static final By goToBusketSecondButton = By.xpath("(//a[contains(@class, 'j-go-to-basket')])[2]");

    @Step("Открываем страницу карточки товара")
    public ProductCardPage openProductCardPage() {
        openPage(productCardPageUrl);
        waitForElementToBeVisible(productPageTitle);
        clickButton(okeyCookiesButton);
        return this;
    }

    @Step("Кликаем по кнопке \"Добавить в корзину\"")
    public ProductCardPage clickAddToBusketButton() {
        waitForElementToBeClickable(addToBusketButton);
        clickButton(addToBusketButton);
        waitForElementToBeVisible(goodsInBusket);
        waitForElementToBeVisible(goToBusketFirstButton);
        return this;
    }

    @Step("Кликаем по кнопке \"Корзина\"")
    public ProductCardPage clickGoToBusketButton() {
        waitForElementToBeClickable(goToBusketSecondButton);
        clickButton(goToBusketSecondButton);
        return this;
    }
}
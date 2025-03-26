import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.BusketPage;
import pageobject.ProductCardPage;

final class ProductCardPageTest extends BaseTest {

    private final ProductCardPage productCard = new ProductCardPage();
    private final BusketPage busketPage = new BusketPage();

    @Test
    @DisplayName("Позитивный тест проверки добавления товара в корзину")
    public void productCardOpenSuccessTest() {
        productCard
                .openProductCardPage()
                .clickAddToBusketButton()
                .clickGoToBusketButton();
        busketPage
                .openedBusketPage()
                .goodsAddedToBusket();
    }
}
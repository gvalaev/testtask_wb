import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.BusketPage;

final class BusketPageTest extends BaseTest {

    private final BusketPage busketPage = new BusketPage();

    @Test
    @DisplayName("Позитивный тест открытия страницы корзины")
    public void busketPageOpenSuccessTest() {
        busketPage.openBusketPage();
    }
}
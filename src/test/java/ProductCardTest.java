import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.ProductCard;

public class ProductCardTest extends BaseTest {

    private final ProductCard productCard = new ProductCard();

    @Test
    @DisplayName("Позитивный тест открытия карточки продукта")
    public void productCardOpenSuccessTest() {
        productCard
                .openMainPage();
    }
}
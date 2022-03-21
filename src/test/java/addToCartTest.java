import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("nigmatullinf")
public class addToCartTest {

    @Test
    @DisplayName("Добавление товара в корзину через быструю корзину")
    public void shouldAddToFastCart() {
        open("http://automationpractice.com/index.php");

        step("При нажатии на кнопку добавления в корзину открывается модалка о добавлении товара в корзину", () -> {
            Pages.mainPage.productCards()
                    .first()
                    .hover();
            Pages.mainPage.addToCartButton()
                    .first()
                    .click();
            Pages.mainPage.addToCartModal()
                    .shouldBe(visible);
        });
    }

}

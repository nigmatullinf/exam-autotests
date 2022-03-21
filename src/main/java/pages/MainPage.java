package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    public ElementsCollection productCards() {
        return $$(".ajax_block_product");
    }

    public SelenideElement cartButton() {
        return $("[title='View my shopping cart']");
    }

    public ElementsCollection addToCartButton() {
        return $$(".ajax_add_to_cart_button");
    }

    public SelenideElement addToCartModal() {
        return $("#layer_cart .clearfix");
    }

    public SelenideElement continueShoppingModalButton() {
        return $("[title='Continue shopping']");
    }

    public SelenideElement checkoutModalButton() {
        return $("[title='Proceed to checkout']");
    }


}

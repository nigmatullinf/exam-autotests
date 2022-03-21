
import io.qameta.allure.Owner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.open;

import static org.junit.jupiter.params.provider.Arguments.arguments;


@Owner("nigmatullinf")
public class SkuTest {
    @DisplayName("Проверка размера товара")
    @MethodSource("sizeArg")
    @ParameterizedTest(name = "{displayName} : {0}")
public void shouldOpenCorrectProductSize(String sizeLink, String size) {
        open("http://automationpractice.com/index.php?id_product=2&controller=product#/color-black/"
                + sizeLink);
        Pages.productPage.currentProductSize()
                .shouldHave(text(size));
    }
    static Stream<Arguments> sizeArg() {
        return Stream.of(
                arguments("size-s", "s"),
                arguments("size-m", "m"),
                arguments("size-l", "l")
        );
    }
}

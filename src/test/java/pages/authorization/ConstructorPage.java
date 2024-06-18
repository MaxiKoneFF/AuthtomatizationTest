package pages.authorization;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class ConstructorPage {
           private final By AFTER_BUTTON = By.xpath("//button[contains(text(), 'Оформить заказ')]");
        public SelenideElement getAftherButton() { return element(AFTER_BUTTON); }
    }

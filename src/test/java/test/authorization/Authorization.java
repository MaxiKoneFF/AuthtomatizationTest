package test.authorization;

import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.authorization.ConstructorPage;
import services.authorization.AuthorizationService;

import static com.codeborne.selenide.Condition.visible;

public class Authorization {

  private final AuthorizationService authorizationService = new AuthorizationService();
  private final AuthorizationPage authorizationPage = new AuthorizationPage();
  private final ConstructorPage constructorPage = new ConstructorPage();

  @Test
  public void checkAuthorization() {
    String email = "konev.tonystark@gmail.com";
    String password = "94949697";

    authorizationService.openAutorizationPage();
    authorizationPage.setEmail(email);
    authorizationPage.setPassword(password);
    authorizationPage.getEnterButton().click();
    constructorPage.getAftherButton().click();
    constructorPage.getAftherButton().shouldBe(visible.because("Пользователь не авторизован"));
  }
}
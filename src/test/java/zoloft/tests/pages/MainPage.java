package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //locators
    SelenideElement
            collaborationButton = $$(".btn-default").findBy(Condition.text("Начать сотрудничество")),
            collaborationFormHeader = $(".form-header"),
            productMenu = $$(".wrap").findBy(Condition.text("Продукты и услуги")),
            serviceSupportButton = $$(".menu_body").findBy(Condition.text("Сервисная поддержка"));

    //actions
    public MainPage openPage() {
        open("https://www.ussc.ru/");
        return this;
    }

    public void activateCollaborationForm() {
        collaborationButton.click();
    }

    public void collaborationFormCheck() {
        collaborationFormHeader.should(Condition.have(Condition.text("Обратная связь")));
    }

    public void productMenuActivate() {
        productMenu.hover();
    }
    public void serviceSupportPageTransfer() {
        serviceSupportButton.click();
    }
}

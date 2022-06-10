package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SupportProgramsPage {

    //locators
    SelenideElement
    supportContent = $(".content");

    //actions
    public void supportProgramsPageCheck() {
        supportContent.shouldHave(Condition.text("Описание программ сервисного обслуживания"));
    }
}

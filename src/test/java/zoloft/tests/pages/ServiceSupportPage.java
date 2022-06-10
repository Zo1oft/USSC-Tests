package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ServiceSupportPage {

    //locator
    SelenideElement
            serviceProgramsMenu = $("#bx_651765591_200");

    //action
    public void serviceProgramsPageTransfer() {
        serviceProgramsMenu.click();
    }
}

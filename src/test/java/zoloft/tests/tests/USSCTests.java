package zoloft.tests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zoloft.tests.helpers.DriverUtils;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class USSCTests extends TestBase {

    @Test
    @Description("Проверка работы кнопки 'Начать сотрудничество'")
    @DisplayName("Начать сотрудничество")
    void collaborationFormTest() {
        step("Открываем сайт Уральского центра систем безопасности", () -> {
           mainPage.openPage();
        });

        step("Нажимаем на кнопку 'Начать сотрудничество'", () -> {
            mainPage.activateCollaborationForm();
        });


        step("Проверяем, что форма обратной связи открылась", () -> {
            mainPage.collaborationFormCheck();
        });
    }

    @Test
    @Description("Проверка работы страницы программ сервисного обслуживания")
    @DisplayName("Программа сервисного обслуживания")
    void supportPageTest() {
        step("Открываем сайт Уральского центра систем безопасности", () -> {
            mainPage.openPage();
        });

        step("Переходим в 'Продукты и услуги --> 'Сервисная поддержка'", () -> {
            mainPage.productMenuActivate();
            mainPage.serviceSupportPageTransfer();
        });


        step("Выбираем 'Программы сервисного обслуживания'", () -> {
            serviceSupportPage.serviceProgramsPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            supportProgramsPage.supportProgramsPageCheck();
        });
    }

    @Test
    @Description("Проверка наличия Title на странице")
    @DisplayName("Работоспособность сайта")
    void titleTest() {
        step("Открываем сайт Уральского центра систем безопасности", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие Title", () -> {
            String expectedTitle = "Уральский центр систем безопасности УЦСБ - Интегратор сильных решений";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Проверка наличия ошибок в консоли")
    @DisplayName("Логи консоли страницы не должны содержать ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт Уральского центра систем безопасности", () -> {
            mainPage.openPage();
        });

        step("Логи в консоле не должны иметь 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
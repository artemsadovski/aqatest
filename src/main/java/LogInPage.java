import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import jdk.jfr.Description;

import java.time.Duration;
//import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LogInPage {

    private final SelenideElement login = $x("//*[@id='username']");
    private final SelenideElement password = $x("//*[@id='password']");
    private final SelenideElement btnlogIn = $x("//*[@name='login']");
    private final SelenideElement loginConfirmation = $x("//nav/label[contains(text(), '" + Consts.name+ "')]");

    @Step("Авторизация")
    public void login(String name, String pass) {
        open(Consts.baseUIUrl);
        login.setValue(name);
        password.setValue(pass);
        btnlogIn.click();
        loginConfirmation.shouldBe(Condition.visible, Duration.ofSeconds(5));
    }

}

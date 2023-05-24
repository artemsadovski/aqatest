import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LogInForm {

    private final SelenideElement login = $x("//*[@id='username']");
    private final SelenideElement password = $x("//*[@id='password']");
    private final SelenideElement logInButton = $x("//*[@name='login']");

    public LogInForm inputLoginName() {
        login.setValue("artsiom");
        return this;
    }

//    public LogInForm inputLoginName() {
//        login.setValue("test");
//        return this;
//    }

    public LogInForm inputPassword() {
        password.setValue("1379724_Art");
        return this;
    }

//    public LogInForm inputPassword() {
//        password.setValue("test");
//        return this;
//    }

    public LogInForm clickLoginButton() {
        logInButton.click();
        return this;
    }

}

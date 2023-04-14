import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class NotTls {

    private final SelenideElement useResourses = $x("//*[@id='details-button']"); // использование ресурска
    private final SelenideElement GoLogin = $x("//*[@id='proceed-link']"); // переход к логину



    public NotTls clickNoTls1() {
        useResourses.click();
        return this;
    }

    public NotTls clickNoTls2() {
        GoLogin.click();
        return this;
    }


}

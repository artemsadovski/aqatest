import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Header {

    private final SelenideElement filterTab = $x("//span[text()='Фильтры']");//кнопка добавить

    public Header clickFilter() {
        filterTab.click();
        return this;
    }

}

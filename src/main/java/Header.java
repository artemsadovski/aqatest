import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Header {

    private final SelenideElement filterTab = $x("//span[text()='Фильтры']");//кнопка добавить
    private final SelenideElement riskProfileTab = $x("//span[text()='Риск-профили']");//кнопка добавить

    public Header clickFilter() {
        filterTab.click();
        return this;
    }

    public Header clickRiskProfile(){
        riskProfileTab.click();;
        return this;
    }

}

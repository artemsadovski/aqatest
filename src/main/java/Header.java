import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Header {

    private final SelenideElement filterTab = $x("//span[text()='Фильтры']");//перейти н авкладку фильтры
    private final SelenideElement riskProfileTab = $x("//span[text()='Риск-профили']");//перейти на вкладку риск профиль
    private final SelenideElement docTab = $x("//span[text()='Документы']");//перейти на вкладку документ
    private final SelenideElement varTab = $x("//span[text()='Переменные']");//перейти на вкладку документ

    public Header clickFilter() {
        filterTab.click();
        return this;
    }

    public Header clickRiskProfile(){
        riskProfileTab.click();
        return this;
    }

    public Header clickDoc(){
        docTab.click();
        return this;
    }

    public Header clickVar(){
        varTab.click();
        return this;
    }
}

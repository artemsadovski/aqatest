import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Header {

    private final SelenideElement filterTab = $x("//span[text()='Фильтры']");//перейти н авкладку фильтры
    private final SelenideElement riskProfileTab = $x("//span[text()='Риск-профили']");//перейти на вкладку риск профиль
    private final SelenideElement docTab = $x("//span[text()='Документы']");//перейти на вкладку документ
    private final SelenideElement varTab = $x("//span[text()='Переменные']");//перейти на вкладку переменные
    private final SelenideElement factorTab = $x("//span[text()='Факторы']");//перейти на вкладку факторы
    private final SelenideElement rullsTab = $x("//span[text()='Правила']");//перейти на вкладку правила
    private final SelenideElement taskTab = $x("//span[text()='Задачи']");//перейти на вкладку задачи

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

    public Header clickFactor(){
        factorTab.click();
        return this;
    }

    public Header clickRull(){
        rullsTab.click();
        return this;
    }

    public Header clickTasks(){
        taskTab.click();
        return this;
    }
}

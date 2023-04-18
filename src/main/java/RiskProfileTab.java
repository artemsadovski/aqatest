import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RiskProfileTab {
    private final SelenideElement addButtonRiskProfile = $x("//span[text()='Риск-профили']");// кнопка добавить и вызов формы
    private final SelenideElement addNameRiskProfile = $x("//span[text()='Риск-профили']");// поле ввода имени риск профиля
    private final SelenideElement addAnchorRiskProfile = $x("//app-text-box[@formcontrolname='anchor']/input");// поле ввода якоря риск профиля
    private final SelenideElement addDescriptionRiskProfile = $x("//app-text-area[@formcontrolname='description']/textarea");// поле ввода описания риск профиля
    private final SelenideElement listRiskProfile = $x("//app-select-box[@placeholder='Не выбрано']/*[text()='keyboard_arrow_down']");// список риск профилей
    private final SelenideElement addAfRiskProfile = $x("//app-select-box/ul/li[text()='AF']");// выбор AF workflow



}

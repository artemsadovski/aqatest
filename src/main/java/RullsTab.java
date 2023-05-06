import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class RullsTab {
    private final SelenideElement addRullTab = $x("//*[text()='Добавить']");// кнопка добавить правило
    private final SelenideElement addRullName = $x("//input[@formcontrolname='ruleName']"); // поле имени правила
    private final SelenideElement listRullRiskProfile = $x("//app-select-box/app-icon[text()='keyboard_arrow_down']"); // список риск профилей
    private final SelenideElement addRullRiskProfile = $x("//ul/li[text()='Default']"); //выбор риск профиля
    private final SelenideElement editRullRiskProfile = $x("//ul/li[text()='User_test_aqa']"); //редактирование риск профиля
    private final SelenideElement addRullDescr = $x("//textarea[@formcontrolname='description']"); //поле описание
    private final SelenideElement addRullPostCheck = $x("//div/input[@value='true']"); //чек бокс правило пост проверки
    private final SelenideElement addRullNoPostCheck = $x("//div/input[@value='false']"); //чек бокс правило не пост проверки
    private final SelenideElement addRullFactor = $x("//app-rule-factors-grid//p[text()='F_AML_in_500_age_21']/../preceding-sibling::td/app-icon"); //добавление для задачи
    private final SelenideElement editRullFactor = $x("//app-rule-factors-grid//p[text()='F_test_factor']/../preceding-sibling::td/app-icon"); //добавление фактора
    private final SelenideElement addRull = $x("//*[text()='Добавить']"); //Создание правила
    private final SelenideElement closePopApFactor = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //закрыть поп-ап создания правила
    private final SelenideElement searchFieldRulls = $x("//input[@class='no-inner-label']"); // поле поиска правила
    private final SelenideElement listRullActive = $x("//app-select-box[@formcontrolname='status']/app-icon"); // список активных правил
    private final SelenideElement selectRullActive = $x("//app-select-box/ul/li[text()='Активный']"); // выбор активных правила
    private final SelenideElement listRullCreated = $x("//app-select-box[@formcontrolname='creator']/app-icon"); // список создателей
    private final SelenideElement selectRullCreated = $x("//ul/li[text()='art sad (artsiom)']"); // выбор создателя
    private final SelenideElement listRullRiskProfileSearch = $x("//app-select-box[@formcontrolname='riskProfile']/app-icon"); // список риск профилей
    private final SelenideElement selectRullRiskProfileSearch = $x("//ul/li[text()='User_test_aqa']"); // выбор риск профиля
    private final SelenideElement rullDescr = $x("//td/a[text()='R_test_rule']/../preceding-sibling::td[@class='show-more']/app-icon"); // выбор риск профиля
    private final SelenideElement workToRull = $x("//td/a[text()='R_test_rule']/../following-sibling::td/app-icon"); // выбор списка с действиями для удаления правила
    private final SelenideElement selectDeleteRull = $x("//td/a[text()='R_test_rule']/../following-sibling::td/div/ul/li[text()='Удалить']"); // удаление правила
    private final SelenideElement selectEditRull = $x("//td/a[text()='R_test_rule']/../following-sibling::td/div/ul/li[text()='Редактировать']"); // редактирование правила
    private final SelenideElement approveSelectDeleteRull = $x("//footer/button[text()='Да']"); // подтвеждение удаления
    private final SelenideElement popApDelete = $x("//div/app-icon[text()='close']"); // поп-ап удаления
    private final SelenideElement headRulls = $x("//h2[normalize-space(text())='Список правил']"); // проверка заголовка
    //private final SelenideElement noActiveRull = $x("//app-icon[normalize-space(text())='radio_button_unchecked']"); // неактивное правило
    private final SelenideElement unchekedRull = $x("//app-icon[normalize-space(text())='radio_button_unchecked']"); // активное правило
    private final SelenideElement deleteFactorFromList = $x("//app-rule-form//p[text()='F_AML_in_500_age_21']/../preceding-sibling::td/app-icon"); // удаление правила из списка
    private final SelenideElement saveAfterEdit = $x("//*[text()='Сохранить']"); // сохранение после редактирвоания





    public RullsTab clickAddRullTab() {
        addRullTab.click();
        return this;
    }

    public RullsTab inputAddRullName() {
        addRullName.setValue("R_test_rule");
        return this;
    }

    public RullsTab clickListRullRiskProfile() {
        listRullRiskProfile.click();
        return this;
    }

    public RullsTab clickAddRullRiskProfile() {
        addRullRiskProfile.click();
        return this;
    }

    public RullsTab clickEditRullRiskProfile() {
        editRullRiskProfile.click();
        return this;
    }

    public RullsTab inputAddRullDescr() {
        addRullDescr.setValue("Описание правила верси 1");
        return this;
    }

    public RullsTab editRullDescr() {
        addRullDescr.setValue("Описание правила верси 2");
        return this;
    }

    public RullsTab clickAddRullPostCheck() {
        addRullPostCheck.click();
        return this;
    }

    public RullsTab clickAddRullNoPostCheck() {
        addRullNoPostCheck.click();
        return this;
    }

    public RullsTab clickAddRullFactor() {
        addRullFactor.click();
        return this;
    }

    public RullsTab clickEditRullFactor() {
        editRullFactor.click();
        return this;
    }

    public RullsTab clickAddRull() {
        addRull.click();
        return this;
    }

    public RullsTab clickClosePopApFactor() {
        closePopApFactor.click();
        return this;
    }

    public RullsTab inputSearchFieldRulls() {
        searchFieldRulls.setValue("R_test_rule");
        return this;
    }

    public RullsTab clickListRullActive() {
        listRullActive.click();
        return this;
    }

    public RullsTab clickSelectRullActive() {
        selectRullActive.click();
        return this;
    }

    public RullsTab clickListRullCreated() {
        listRullCreated.click();
        return this;
    }

    public RullsTab clickSelectRullCreated() {
        selectRullCreated.click();
        return this;
    }

    public RullsTab clickListRullRiskProfileSearch() {
        listRullRiskProfileSearch.click();
        return this;
    }

    public RullsTab clickSelectRullRiskProfileSearch() {
        selectRullRiskProfileSearch.click();
        return this;
    }

    public RullsTab clickRullDescr() {
        rullDescr.click();
        return this;
    }

    public RullsTab clickWorkToRull() {
        workToRull.click();
        return this;
    }

    public RullsTab clickSelectDeleteRull() {
        selectDeleteRull.click();
        return this;
    }
    public RullsTab clickSelectEditRull() {
        selectEditRull.click();
        return this;
    }
    public RullsTab clickApproveSelectDeleteRull() {
        approveSelectDeleteRull.click();
        return this;
    }

    public RullsTab clickPopApDelete() {
        popApDelete.click();
        return this;
    }

    public RullsTab checkHeadRulls() {
        headRulls.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }

    public RullsTab clickUnchekedRull() {
        unchekedRull.click();
        return this;
    }
    public RullsTab clickDeleteFactorFromList() {
        deleteFactorFromList.click();
        return this;
    }
    public RullsTab clickSaveAfterEdit() {
        saveAfterEdit.click();
        return this;
    }







}

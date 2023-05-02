import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RiskProfileTab {
    private final SelenideElement addButtonRiskProfile = $x("//*[text()='Добавить']");// кнопка добавить и вызов формы
    private final SelenideElement addNameRiskProfile = $x("//app-text-box[@formcontrolname='name']/input");// поле ввода имени риск профиля
    private final SelenideElement addAnchorRiskProfile = $x("//app-text-box[@formcontrolname='anchor']/input");// поле ввода якоря риск профиля
    private final SelenideElement addDescriptionRiskProfile = $x("//app-text-area[@formcontrolname='description']/textarea");// поле ввода описания риск профиля
    private final SelenideElement listRiskWorkProcces = $x("//app-select-box[@placeholder='Не выбрано']/*[text()='keyboard_arrow_down']");// список рабочих процессов
    private final SelenideElement addAfRiskProfile = $x("//app-select-box/ul/li[text()='AF']");// выбор AF workflow
    private final SelenideElement addRiskProfileInList = $x("//footer/*[text()='Добавить']"); //добавление риск профиля
    private final SelenideElement closePopApProfile = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //Закрыть поп-ап создания
    private final SelenideElement riskProfileDescriptionInTable = $x("//td/a[text()='User_test_aqa']/../preceding-sibling::td/app-icon");
    private final SelenideElement deleteRiskProfile = $x("//td/a[text()='User_test_aqa']/../following-sibling::td/app-icon"); //// выбор списка с действиями для удаления риск профиль
    private final SelenideElement selectDeleteRiskProfile = $x("//td/a[text()='User_test_aqa']/../following-sibling::td/div/ul/li[text()='Удалить']"); // удаление риск-профиля
    private final SelenideElement approveSelectDeleteRiskProfile = $x("//footer/button[text()='Да']"); // подтверждение удаления





    public RiskProfileTab addButtonProfile() {
        addButtonRiskProfile.click();
        return this;
    }

    public RiskProfileTab addName(){
        addNameRiskProfile.setValue("User_test_aqa");
        return this;
    }

    public RiskProfileTab addAnchor(){
        addAnchorRiskProfile.setValue("USER_ID");
        return this;
    }

    public RiskProfileTab dropList(){
        listRiskWorkProcces.click();
        return this;
    }

    public RiskProfileTab afWorkProcces(){
        addAfRiskProfile.click();
        return this;
    }

    public RiskProfileTab addDescription(){
        addDescriptionRiskProfile.setValue("Описание bla bla bla");
        return this;
    }

    public RiskProfileTab addRiskProfile(){
        addRiskProfileInList.click();
        return this;
    }

    public RiskProfileTab closePopApRisk(){
        closePopApProfile.click();
        return this;
    }

    public RiskProfileTab lookDescrTable(){
        riskProfileDescriptionInTable.click();
        return this;
    }

    public RiskProfileTab clickDeleteRiskProfile(){
        deleteRiskProfile.click();
        return this;
    }

    public RiskProfileTab clickSelectDeleteRiskProfile(){
        selectDeleteRiskProfile.click();
        return this;
    }

    public RiskProfileTab clickApproveSelectDeleteRiskProfile(){
        approveSelectDeleteRiskProfile.click();
        return this;
    }
}

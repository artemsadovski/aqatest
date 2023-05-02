import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FactorTab {

    private final SelenideElement addFactorTab = $x("//*[text()='Добавить']"); //кнопка добавить фактор
    private final SelenideElement selectMathFactor = $x("//div/ul/li[text()='MATH-фактор']"); //выбор мат фактора
    private final SelenideElement addNameFactor = $x("//app-text-box[@formcontrolname='factorName']/input"); //поле ввода имени фактора
    private final SelenideElement addDescrFactor = $x("//app-text-area/textarea"); //поле ввода описани фактора
    private final SelenideElement addConditionFactor = $x("//div/div[@class='program-editor']"); //поле ввода условия фактора
    private final SelenideElement validationFactor = $x("//button/span[text()='Валидация']"); //валидация фактора
    private final SelenideElement windowTest = $x("//button/span[text()='Тест']"); //вызов окна тест
    private final SelenideElement addFieldTestUser = $x("//div/label[text()='USER_ID']//following-sibling::app-text-box/input"); //поле user_id
    private final SelenideElement addFieldTestVar = $x("//div/label[text()='var_test']//following-sibling::app-text-box/input"); //поле поле переменной
    private final SelenideElement checkFactor = $x("//footer/button[text()='Проверить']"); //Проверка переменной
    private final SelenideElement backToFactor = $x("//nav/button[@class='transparent']"); //вернуться к фактору
    private final SelenideElement addFactor = $x("//footer/button[@class='popup-action']"); //Добавить фактор
    private final SelenideElement closePopApFactor = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //закрыть поп-ап создания фактора
    private final SelenideElement searchFieldFactor = $x("//input[@class='no-inner-label']"); // поле поиска фактора
    private final SelenideElement factorDescr = $x("//td/a[text()='F_test_factor']/../preceding-sibling::td[@class='show-more']/app-icon"); // поле поиска фактора
    private final SelenideElement deleteFactor = $x("//td/a[text()='F_test_factor']/../following-sibling::td/app-icon"); // выбор списка с действиями для удаления фактора
    private final SelenideElement selectDeleteFactor = $x("//td/a[text()='F_test_factor']/../following-sibling::td/div/ul/li[text()='Удалить']"); // удаление фактора
    private final SelenideElement approveSelectDeleteFactor = $x("//footer/button[text()='Да']"); // подтвеждение удаления

    private final SelenideElement popApDelete = $x("//div/app-icon[text()='close']"); // поп-ап удаления



    public FactorTab clickAddFactorTab(){
        addFactorTab.click();;
        return this;
    }

    public FactorTab clickSelectMathFactor(){
        selectMathFactor.click();
        return this;
    }

    public FactorTab inputAddNameFactor(){
        addNameFactor.setValue("F_test_factor");
        return this;
    }

    public FactorTab inputAddDescrFactor(){
        addDescrFactor.setValue("bla bla bla bla");
        return this;
    }

    public FactorTab inputAddConditionFactor(){
        addConditionFactor.setValue("IF var_test > 10*BV");
        return this;
    }

    public FactorTab clickValidationFactor(){
        validationFactor.click();
        return this;
    }

    public FactorTab clickWindowTest(){
        windowTest.click();
        return this;
    }

    public FactorTab inputFieldTestUser(){
        addFieldTestUser.setValue("12345");
        return this;
    }

    public FactorTab inputAddFieldTestVar(){
        addFieldTestVar.setValue("3000");
        return this;
    }

    public FactorTab clickCheckFactor(){
        checkFactor.click();
        return this;
    }

    public FactorTab clickBackToFactor(){
        backToFactor.click();
        return this;
    }

    public FactorTab clickAddFactor(){
        addFactor.click();
        return this;
    }

    public FactorTab clickClosePopApFactor(){
        closePopApFactor.click();
        return this;
    }

    public FactorTab clickSearchFieldFactor(){
        searchFieldFactor.setValue("F_test_factor");
        return this;
    }

    public FactorTab clickFactorDescr(){
        factorDescr.click();
        return this;
    }

    public FactorTab clickDeleteFactor(){
        deleteFactor.click();
        return this;
    }

    public FactorTab clickSelectDeleteFactor(){
        selectDeleteFactor.click();
        return this;
    }

    public FactorTab clickApproveSelectDeleteFactor(){
        approveSelectDeleteFactor.click();
        return this;
    }

    public FactorTab clickPopApDelete(){
        popApDelete.click();
        return this;
    }




}


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class VariableTab {
    private final SelenideElement addVarButton  = $x("//*[text()='Добавить']"); //кнопка добавленя переменной
    private final SelenideElement addVarId = $x("//app-text-box[@formcontrolname='id']/input[@class = 'no-inner-label']"); //поле id перменной
    private final SelenideElement listDocType = $x("//app-search-select-box[@formcontrolname='documentType']/app-icon"); //список типов документа
    private final SelenideElement fieldFindDocType = $x("//app-search-select-box/div/app-text-box/input[@class='no-inner-label']"); //поле поиска документа
    private final SelenideElement selectFindDocType = $x("//app-search-select-box/div/ul/li[@title='doc_test_name']"); //выбор найденного документа
    private final SelenideElement listAtr = $x("//app-search-select-box[@formcontrolname='fieldName']/app-icon"); //список атрибута документа
    private final SelenideElement fieldAtr = $x("//app-search-select-box/div/app-text-box/input[@class='no-inner-label']"); //поле поиска атрибута
    private final SelenideElement selectAtr = $x("//app-search-select-box/div/ul/li[@class='with-tooltip']"); //выбор найденного атрибута
    private final SelenideElement listAnchor = $x("//app-search-select-box[@class='ng-untouched ng-pristine ng-invalid']"); //список якорей
    private final SelenideElement selectAnchor = $x("//ul/li[@title='Идентификатор пользователя']"); //выбор якоря
    private final SelenideElement listFunc = $x("//app-select-box[@formcontrolname='function']/app-icon"); //список функций
    private final SelenideElement selectFunc = $x("//app-select-box[@formcontrolname='function']//ul/li[text()='Sum']"); //выбор функции
    private final SelenideElement periodFunc = $x("//div/input[@value='M']"); //период функции
    private final SelenideElement periodNumber = $x("//app-number-box/input[@type='number']"); //время накопления
    private final SelenideElement addVar = $x("//footer/button[@class='popup-action']"); //добавление переменной
    private final SelenideElement closePopApVar = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //закрыть поп-ап создания
    private final SelenideElement searchVar = $x("//input[@class='no-inner-label']"); //поиск по названию переменной
    private final SelenideElement varDescr = $x("//td/a[text()='var_test']/../preceding-sibling::td[@class='show-more']/app-icon"); //описание перменной

    public VariableTab clickButtonVar(){
        addVarButton.click();
        return this;
    }

    public VariableTab addVarId(){
        addVarId.setValue("var_test");
        return this;
    }

    public VariableTab listTypeDocument(){
        listDocType.click();
        return this;
    }

    public VariableTab cLickfieldTypeDoc(){
        fieldFindDocType.click();
        return this;
    }

    public VariableTab selectTypeDoc(){
        selectFindDocType.click();
        return this;
    }

    public VariableTab listAtr(){
        listAtr.click();
        return this;
    }

    public VariableTab clickFieldAtr(){
        fieldAtr.click();;
        return this;
    }

    public VariableTab addAtr(){
        selectAtr.click();
        return this;
    }

    public VariableTab clickListAnchor(){
        listAnchor.click();
        return this;
    }

    public VariableTab addAnchorVar(){
        selectAnchor.click();
        return this;
    }

    public VariableTab listFuncVar(){
        listFunc.click();
        return this;
    }

    public VariableTab addFuncVar(){
        selectFunc.click();
        return this;
    }

    public VariableTab addPeriodFunc(){
        periodFunc.click();
        return this;
    }

    public VariableTab addPeriodNumber(){
        periodNumber.setValue("10");
        return this;
    }

    public VariableTab addVariable(){
        addVar.click();
        return this;
    }

    public VariableTab closePopApVar(){
        closePopApVar.click();
        return this;
    }

    public VariableTab searchVar(){
        searchVar.click();
        return this;
    }

    public VariableTab findVarDescr(){
        varDescr.click();
        return this;
    }

}

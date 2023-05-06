
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class VariableTab {
    private final SelenideElement addVarButton  = $x("//*[text()='Добавить']"); //кнопка добавленя переменной
    private final SelenideElement addVarId = $x("//app-text-box[@formcontrolname='id']/input[@class = 'no-inner-label']"); //поле id перменной
    private final SelenideElement listDocTypeOne = $x("//div[@formarrayname='fields']/div[1]/div/div/app-search-select-box[@formcontrolname='documentType']/app-icon"); //список типов документа
    private final SelenideElement listDocTypeTwo = $x("//div[@formarrayname='fields']/div[2]/div/div/app-search-select-box[@formcontrolname='documentType']/app-icon"); //список типов документа
    private final SelenideElement fieldFindDocType = $x("//app-search-select-box/div/app-text-box/input[@class='no-inner-label']"); //поле поиска документа
    private final SelenideElement selectFindDocType = $x("//app-search-select-box/div/ul/li[@title='doc_test_name']"); //выбор найденного документа
    private final SelenideElement listAtrOne = $x("//div[@formarrayname='fields']/div[1]/div/div/app-search-select-box[@formcontrolname='fieldName']/app-icon"); //список атрибута документа 1
    private final SelenideElement listAtrTwo = $x("//div[@formarrayname='fields']/div[2]/div/div/app-search-select-box[@formcontrolname='fieldName']/app-icon"); //список атрибута документа 2
    private final SelenideElement fieldAtr = $x("//app-search-select-box/div/app-text-box/input[@class='no-inner-label']"); //поле поиска атрибута
    private final SelenideElement selectAtrOne = $x("//app-search-select-box/div/ul/li[normalize-space(text())='Количество']"); //выбор найденного атрибута
    private final SelenideElement selectAtrTwo = $x("//app-search-select-box/div/ul/li[normalize-space(text())='Тип документа для проверки']"); //выбор найденного атрибута
    private final SelenideElement editselectAtr = $x("//app-search-select-box/div/ul/li[normalize-space(text())='Сумма транзакции']"); //выбор найденного атрибута
    private final SelenideElement listAnchorOne = $x("//div/div[1]/div/div/app-search-select-box[@class='ng-untouched ng-pristine ng-invalid']"); //список якорей 1
    private final SelenideElement editAnchorOne = $x("//div/div[1]/div/div[1]/app-search-select-box[@class='ng-untouched ng-pristine ng-valid']/app-icon"); //редактирование переменной
    private final SelenideElement listAnchorTwo = $x("//div/div[2]/div/div/app-search-select-box[@class='ng-untouched ng-pristine ng-invalid']"); //список якорей 2
    private final SelenideElement addAnchor = $x("//button/span[text()='Добавить якорь']"); //добавление якоря
    private final SelenideElement selectAnchorOne = $x("//ul/li[@title='Тип документа для проверки']"); //выбор якоря 1
    private final SelenideElement selectAnchorTwo = $x("//ul/li[@title='Источник транзакции ']"); //выбор якоря 2
    private final SelenideElement editSelectAnchor = $x("//ul/li[@title='Идентификатор пользователя']"); //выбор якоря
    private final SelenideElement listFunc = $x("//app-select-box[@formcontrolname='function']/app-icon"); //список функций
    private final SelenideElement selectFuncSum = $x("//app-select-box[@formcontrolname='function']//ul/li[text()='Sum']"); //выбор функции SUM
    private final SelenideElement selectFuncMin = $x("//app-select-box[@formcontrolname='function']//ul/li[text()='Min']"); //выбор функции MIN
    private final SelenideElement periodFuncMinut = $x("//div/input[@value='M']"); //период функции минуты
    private final SelenideElement periodFuncDay = $x("//div/input[@value='d']"); //период функции день
    private final SelenideElement periodNumber = $x("//app-number-box/input[@type='number']"); //время накопления
    private final SelenideElement addAccuracy = $x("//input[@label='Скользящий']"); //добавление точности
    private final SelenideElement addDescr = $x("//app-text-area/textarea"); //добавление описания к переменной
    private final SelenideElement addVar = $x("//footer/button[@class='popup-action']"); //добавление переменной
    private final SelenideElement closePopApVar = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //закрыть поп-ап создания
    private final SelenideElement searchVar = $x("//input[@class='no-inner-label']"); //поиск по названию переменной
    private final SelenideElement varDescr = $x("//td/a[text()='var_test']/../preceding-sibling::td[@class='show-more']/app-icon"); //описание перменной
    private final SelenideElement workToVar = $x("//td/a[text()='var_test']/../following-sibling::td/app-icon"); //выбор списка с действиями для переменной
    private final SelenideElement selectDeleteVar = $x("//td/a[text()='var_test']/../following-sibling::td/div/ul/li[text()='Удалить']"); //удаление переменной
    private final SelenideElement approveSelectDeleteVar = $x("//footer/button[text()='Да']"); // подтвеждение удаления
    private final SelenideElement popApDelete = $x("//div/app-icon[text()='close']"); // поп-ап удаления
    private final SelenideElement headVar = $x("//h2[normalize-space(text())='Переменные']"); // проверка заголовка
    private final SelenideElement checkVarSearch = $x("//td/a[text()='var_test']"); // проверка заголовка
    private final SelenideElement addTypeAndAtr = $x("//button//span[text()='Добавить тип и атрибут']"); //добавление типа и документа
    private final SelenideElement selectEditVar = $x("//td/a[text()='var_test']/../following-sibling::td/div/ul/li[text()='Редактировать']"); //удаление переменной
    private final SelenideElement deleteDocTypeTwo = $x("//div[2]/div/div[3]/app-icon[normalize-space(text())='close']"); //удаление второго документа
    private final SelenideElement deleteAnchorTwo = $x("//div/div[2]/div/div[2]/app-icon[normalize-space(text())='close']"); //удаление второго якоря
    private final SelenideElement approveEditVar = $x("//footer/button[text()='Да']"); //подтверждение редактирования






    public VariableTab clickButtonVar(){
        addVarButton.click();
        return this;
    }

    public VariableTab addVarId(){
        addVarId.setValue("var_test");
        return this;
    }

    public VariableTab listTypeDocumentOne(){
        listDocTypeOne.click();
        return this;
    }

    public VariableTab listTypeDocumentTwo(){
        listDocTypeTwo.click();
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

    public VariableTab listAtrOne(){
        listAtrOne.click();
        return this;
    }
    public VariableTab listAtrTwo(){
        listAtrTwo.click();
        return this;
    }
    public VariableTab clickFieldAtr(){
        fieldAtr.click();;
        return this;
    }

    public VariableTab addAtrOne(){
        selectAtrOne.click();
        return this;
    }

    public VariableTab addAtrTwo(){
        selectAtrTwo.click();
        return this;
    }
    public VariableTab editAtr(){
        editselectAtr.click();
        return this;
    }


    public VariableTab clickListAnchorOne(){
        listAnchorOne.click();
        return this;
    }

    public VariableTab clickListAnchorTwo(){
        listAnchorTwo.click();
        return this;
    }
    public VariableTab addAnchorVarOne(){
        selectAnchorOne.click();
        return this;
    }

    public VariableTab addAnchorVarTwo(){
        selectAnchorTwo.click();
        return this;
    }

    public VariableTab listFuncVar(){
        listFunc.click();
        return this;
    }

    public VariableTab addFuncVarSum(){
        selectFuncSum.click();
        return this;
    }

    public VariableTab addFuncVarMin(){
        selectFuncMin.click();
        return this;
    }

    public VariableTab addPeriodFuncMinut(){
        periodFuncMinut.click();
        return this;
    }
    public VariableTab addPeriodFuncDay(){
        periodFuncDay.click();
        return this;
    }

    public VariableTab addPeriodNumberMinute(){
        periodNumber.setValue("10");
        return this;
    }

    public VariableTab addPeriodNumberDay(){
        periodNumber.setValue("45");
        return this;
    }

    public VariableTab addVariable(){
        addVar.click();
        return this;
    }
    public VariableTab clickAddAccuracy(){
        addAccuracy.click();
        return this;
    }
    public VariableTab clickAddDescr(){
        addDescr.setValue("переменная версия 1");
        return this;
    }
    public VariableTab editAddDescr(){
        addDescr.setValue("переменная версия 2");
        return this;
    }
    public VariableTab closePopApVar(){
        closePopApVar.click();
        return this;
    }

    public VariableTab searchVar(){
        searchVar.setValue("var_test");
        return this;
    }

    public VariableTab findVarDescr(){
        varDescr.click();
        return this;
    }

    public VariableTab clickWorkToVar(){
        workToVar.click();
        return this;
    }

    public VariableTab clickSelectDeleteVar(){
        selectDeleteVar.click();;
        return this;
    }
    public VariableTab clickSelectEditVar(){
        selectEditVar.click();;
        return this;
    }
    public VariableTab clickApproveSelectDeleteVar(){
        approveSelectDeleteVar.click();
        return this;
    }

    public VariableTab checkPopApDelete(){
        popApDelete.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }

    public VariableTab checkHeadVar(){
        headVar.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }

    public VariableTab checkVar(){
        checkVarSearch.shouldNotBe(visible);
        return this;
    }

    public VariableTab clickAddTypeAndAtr(){
        addTypeAndAtr.click();
        return this;
    }

    public VariableTab clickEditSelectAnchor(){
        editSelectAnchor.click();
        return this;
    }
    public VariableTab clickAddAnchor(){
        addAnchor.click();
        return this;
    }
    public VariableTab clickDeleteDocTypeTwo(){
        deleteDocTypeTwo.click();
        return this;
    }
    public VariableTab clickEditAnchorOne(){
        editAnchorOne.click();
        return this;
    }
    public VariableTab clickDeleteAnchorTwo(){
        deleteAnchorTwo.click();
        return this;
    }
    public VariableTab clickApproveEditVar(){
        approveEditVar.click();
        return this;
    }






}


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import com.codeborne.selenide.ex.ElementNotFound;

import java.util.Random;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class VariableTab {
    private DocumentTab documentTab = new DocumentTab();
    private final SelenideElement clickVarTab = $x("//span[text()='Переменные']");//перейти н авкладку фильтры
    private final SelenideElement btnAddVariable = $x("//*[text()='Добавить']"); //кнопка добавленя переменной
    private final SelenideElement variableName = $x("//app-text-box[@formcontrolname='id']/input[@class = 'no-inner-label']"); //поле id перменной
    private final SelenideElement listDocTypeOne = $x("//div[@formarrayname='fields']/div[1]/div/div/app-search-select-box[@formcontrolname='documentType']/app-icon"); //список типов документа
    private final SelenideElement listDocTypeTwo = $x("//div[@formarrayname='fields']/div[2]/div/div/app-search-select-box[@formcontrolname='documentType']/app-icon"); //список типов документа
    private final SelenideElement fieldFindDocType = $x("//app-search-select-box/div/app-text-box/input[@class='no-inner-label']"); //поле поиска документа
    private final SelenideElement selectFindDocType = $x("//app-search-select-box/div/ul/li[@title='doc_test_name']"); //выбор найденного документа
    private final SelenideElement listAtrOne = $x("//div[@formarrayname='fields']/div[1]/div/div/app-search-select-box[@formcontrolname='fieldName']/app-icon"); //список атрибута документа 1
    private final SelenideElement listAtrTwo = $x("//div[@formarrayname='fields']/div[2]/div/div/app-search-select-box[@formcontrolname='fieldName']/app-icon"); //список атрибута документа 2
    private final SelenideElement fieldFindAtr = $x("//app-search-select-box/div/app-text-box/input[@class='no-inner-label']"); //поле поиска атрибута
    private final SelenideElement selectAtrOne = $x("//app-search-select-box/div/ul/li[normalize-space(text())='Количество']"); //выбор найденного атрибута
    private final SelenideElement selectAtrTwo = $x("//app-search-select-box/div/ul/li[normalize-space(text())='Тип документа для проверки']"); //выбор найденного атрибута
    private final SelenideElement editselectAtr = $x("//app-search-select-box/div/ul/li[normalize-space(text())='Сумма транзакции']"); //выбор найденного атрибута
    private final SelenideElement fieldFindAnhors = $x("//app-search-select-box/div/app-text-box/input[@class='no-inner-label']"); //поле поиска якоря
    private final SelenideElement listAnchorOne = $x("//div/div/div[@class='anchors']/div/app-search-select-box/app-icon"); //список якорей 1
    private final SelenideElement editAnchorOne = $x("//div/div[1]/div/div[1]/app-search-select-box[@class='ng-untouched ng-pristine ng-valid']/app-icon"); //редактирование переменной
    private final SelenideElement listAnchorTwo = $x("//div/div[2]/div/div/app-search-select-box[@class='ng-untouched ng-pristine ng-invalid']"); //список якорей 2
    private final SelenideElement addAnchor = $x("//button/span[text()='Добавить якорь']"); //добавление якоря
    private final SelenideElement selectAnchorOne = $x("//ul/li[@title='Тип документа для проверки']"); //выбор якоря 1
    private final SelenideElement selectAnchorTwo = $x("//ul/li[@title='Источник транзакции ']"); //выбор якоря 2
    private final SelenideElement editSelectAnchor = $x("//ul/li[@title='Идентификатор пользователя']"); //выбор якоря
    private final SelenideElement listFunction = $x("//app-select-box[@formcontrolname='function']/app-icon"); //список функций
    private final SelenideElement selectFuncSum = $x("//app-select-box[@formcontrolname='function']//ul/li[text()='Sum']"); //выбор функции SUM
    private final SelenideElement selectFuncMin = $x("//app-select-box[@formcontrolname='function']//ul/li[text()='Min']"); //выбор функции MIN
    private final SelenideElement periodFunc = $x("//div/input[@value='M']"); //период функции минуты
    private final SelenideElement periodFuncDay = $x("//div/input[@value='d']"); //период функции день
    private final SelenideElement periodNumber = $x("//app-number-box/input[@type='number']"); //время накопления
    private final SelenideElement addAccuracy = $x("//input[@label='Скользящий']"); //добавление точности
    private final SelenideElement fieldVarDescription = $x("//app-text-area/textarea"); //добавление описания к переменной
    private final SelenideElement btnCreateVar = $x("//footer/button[@class='popup-action']"); //добавление переменной
    private final SelenideElement btnClosePopUpVar = $x("//div/app-icon[text()='close']"); //Закрыть поп-ап создания 
    private final SelenideElement searchVar = $x("//input[@class='no-inner-label']"); //поиск по названию переменной
    private final SelenideElement varDescr = $x("//td/a[text()='var_test']/../preceding-sibling::td[@class='show-more']/app-icon"); //описание перменной
    private final SelenideElement btnApprove = $x("//footer/button[text()='Да']"); // подтвеждение удаления
    private final SelenideElement headCheckVar = $x("//h2[normalize-space(text())='Переменные']"); // проверка заголовка
    private final SelenideElement checkVarSearch = $x("//td/a[text()='var_test']"); // проверка заголовка
    private final SelenideElement btnAddDocumentAndAttribute = $x("//button//span[text()='Добавить тип и атрибут']"); //добавление типа и документа
    private final SelenideElement btnEditVar = $x("//div/ul/li[text()='Редактировать']"); //редактирование переменной
    private final SelenideElement deleteDocTypeTwo = $x("//div[2]/div/div[3]/app-icon[normalize-space(text())='close']"); //удаление второго документа
    private final SelenideElement deleteAnchorTwo = $x("//div/div[2]/div/div[2]/app-icon[normalize-space(text())='close']"); //удаление второго якоря
    private final SelenideElement approveEditVar = $x("//footer/button[text()='Да']"); //подтверждение редактирования
    private final ElementsCollection listDocAtrAnchor = $$x("//div/ul/li"); //список атрибутов/документов/якорей
    private final ElementsCollection listFun = $$x("//app-select-box/ul/li"); //список функций
    private final ElementsCollection variablePeriodQuantity = $$x("//app-radio-button[@formcontrolname='period']//input"); //период
    private final ElementsCollection variablePrecisionQuantity = $$x("//app-radio-button[@formcontrolname='precision']//input"); //точность
    private final SelenideElement popUpVarCreated = $x("//div/label[text()='Агрегатная переменная добавлена']"); // поп-ап создания фильтра
    private final ElementsCollection varNamesList = $$x("//app-aggregates-grid//tr/td[3]/a"); //таблица переменных
    private final SelenideElement varDescriptionInTable = $x("//tr[@class='information']"); //описание в таблице
    private final SelenideElement btnDeleteVar = $x("//div/ul/li[text()='Удалить']"); //удаление переменной
    private final ElementsCollection btnActionForVar = $$x("//app-aggregates-grid//tr/td[3]/a/../following-sibling::td[8]"); //выбор списка с действиями для переменной Удалить/редактировать
    private final SelenideElement popUpVarDelete = $x("//div/label[text()='Агрегатная переменная удалена']"); //поп-ап удаления фильтра
    private final SelenideElement btnSaveVar = $x("//*[text()='Сохранить']"); //кнопка сохранить
    private final SelenideElement popUpVarEdit = $x("//div/label[text()='Агрегатная переменная обновлена']");
    private final SelenideElement popUpVarConfirmation = $x("//app-confirmation-popup"); // поп-ап накопления данных, подтверждение
    private final SelenideElement btnApproveVar = $x("//app-confirmation-popup//button[contains(text(), 'Да')]"); // поп-ап накопления данных, подтверждение
    private final SelenideElement btnCancellCreateVariable = $x("//footer/button[normalize-space(text())='Отмена']"); // конопка отмены создания/редактирования переменной
    private final String btnDescriotion = "//a[contains(text(), '%s')]/../../td[1]"; // открыть описание переменной
    private final String btnCrudVariable = "//app-aggregates-grid//tr/td[3]/a[text()='%s']/../following-sibling::td[8]/app-icon"; // //кнопка редактировани/удаления переменной



    public void createVariable(String variableName, String documentName, String attributeName, String anchor, String function,
                               String period, String precision, String description, String periodNumber) {
        try {
            checkVarTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка переменные не найдена (стоит не тот контур или нет прав)");
            return;
        }
        btnAddVariable.click();
        this.variableName.setValue(variableName);
        listDocTypeOne.click();
        WebElement elementDocument = searchForName(listDocAtrAnchor, documentName);
        if (elementDocument != null) {
            elementDocument.click();
            listAtrOne.click();
            fieldFindAtr.click();
            WebElement elementAttribute = searchForName(listDocAtrAnchor, attributeName);
            if (elementAttribute != null) {
                elementAttribute.click();
            } else {
                System.out.println("Атрибут не найден!");
            }
            listAnchorOne.click();
            WebElement elementAnchor = searchForName(listDocAtrAnchor, anchor);
            if (elementAnchor != null) {
                elementAnchor.click();
            } else {
                System.out.println("Якорь не найден!");
            }
            listFunction.click();
            WebElement elementFun = searchForName(listFun, function);
            if (elementFun != null) {
                elementFun.click();
            } else {
                System.out.println("Функция не найдена");
            }
            WebElement elementPeriod = searchForValue(variablePeriodQuantity, period);
            if (elementPeriod != null) {
                elementPeriod.click();
            } else {
                System.out.println("Период не найден");
            }
            this.periodNumber.setValue(periodNumber);
            WebElement elementPrecision = searchForValue(variablePrecisionQuantity, precision);
            if (elementPrecision != null) {
                elementPrecision.click();
            } else {
                System.out.println("Точность не найдена");
            }
        } else {
            System.out.println("Документ не найден! Сейчас создам");
            btnCancellCreateVariable.click();
            btnApprove.click();
            documentTab.createDocument(documentName);
            checkVarTabIsOpen();
            btnAddVariable.click();
            this.variableName.setValue(variableName);
            listDocTypeOne.click();
            WebElement elementDocument1 = searchForName(listDocAtrAnchor, documentName);
            if (elementDocument1 != null) {
                elementDocument1.click();
            }
            listAtrOne.click();
            fieldFindAtr.click();
            WebElement elementAttribute = searchForName(listDocAtrAnchor, attributeName);
            if (elementAttribute != null) {
                elementAttribute.click();
            } else {
                System.out.println("Атрибут не найден!");
            }
            listAnchorOne.click();
            WebElement elementAnchor = searchForName(listDocAtrAnchor, anchor);
            if (elementAnchor != null) {
                elementAnchor.click();
            } else {
                System.out.println("Якорь не найден!");
            }
            listFunction.click();
            WebElement elementFun = searchForName(listFun, function);
            if (elementFun != null) {
                elementFun.click();
            } else {
                System.out.println("Функция не найдена");
            }
            WebElement elementPeriod = searchForValue(variablePeriodQuantity, period);
            if (elementPeriod != null) {
                elementPeriod.click();
            } else {
                System.out.println("Период не найден");
            }
            this.periodNumber.setValue(periodNumber);
            WebElement elementPrecision = searchForValue(variablePrecisionQuantity, precision);
            if (elementPrecision != null) {
                elementPrecision.click();
            } else {
                System.out.println("Точность не найдена");
            }
        }
        fieldVarDescription.setValue(description);
        btnCreateVar.click();
        popUpVarCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpVar.click();
        WebElement elementVar = searchForName(varNamesList, variableName);
        if (elementVar != null) {
            $x(String.format(btnDescriotion, elementVar.getText())).click();
            //$x("//a[contains(text(), '" + elementVar.getText() + "')]/../../td[1]").click();
            this.varDescriptionInTable.shouldBe(Condition.text(description)); // получаем текст из открытого описания и сравниваем с тем, что было передано как аргумент функции
            $x(String.format(btnDescriotion, elementVar.getText())).click();
        } else {
            System.out.println("Переменная не создана!");
        }

    }

    public void createVariable(String variableName) {
        try {
            checkVarTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка переменные не найдена (стоит не тот контур или нет прав)");
            return;
        }
        btnAddVariable.click();
        this.variableName.setValue(variableName);
        listDocTypeOne.click();
        WebElement elementDocument = searchForName(listDocAtrAnchor, Consts.documentName);
        if (elementDocument != null) {
            elementDocument.click();
            listAtrOne.click();
            fieldFindAtr.click();
            WebElement elementAttribute = searchForName(listDocAtrAnchor, Consts.attributeNameForVar);
            if (elementAttribute != null) {
                elementAttribute.click();
            } else {
                System.out.println("Атрибут не найден!");
            }
            listAnchorOne.click();
            WebElement elementAnchor = searchForName(listDocAtrAnchor, Consts.anchorName);
            if (elementAnchor != null) {
                elementAnchor.click();
            } else {
                System.out.println("Якорь не найден!");
            }
            listFunction.click();
            WebElement elementFun = searchForName(listFun, Consts.functionName);
            if (elementFun != null) {
                elementFun.click();
            } else {
                System.out.println("Функция не найдена");
            }
            WebElement elementPeriod = searchForValue(variablePeriodQuantity, Consts.periodVariable);
            if (elementPeriod != null) {
                elementPeriod.click();
            } else {
                System.out.println("Период не найден");
            }
            periodNumber.setValue(Consts.periodNumber);
            WebElement elementPrecision = searchForValue(variablePrecisionQuantity, Consts.precisionVariable);
            if (elementPrecision != null) {
                elementPrecision.click();
            } else {
                System.out.println("Точность не найдена");
            }
        } else {
            System.out.println("Документ не найден! Сейчас создам");
            btnCancellCreateVariable.click();
            btnApprove.click();
            documentTab.createDocument(Consts.documentName);
            checkVarTabIsOpen();
            btnAddVariable.click();
            this.variableName.setValue(variableName);
            listDocTypeOne.click();
            WebElement elementDocument1 = searchForName(listDocAtrAnchor, Consts.documentName);
            if (elementDocument1 != null) {
                elementDocument1.click();
            }
            listAtrOne.click();
            fieldFindAtr.click();
            WebElement elementAttribute = searchForName(listDocAtrAnchor, Consts.attributeNameForVar);
            if (elementAttribute != null) {
                elementAttribute.click();
            } else {
                System.out.println("Атрибут не найден!");
            }
            listAnchorOne.click();
            WebElement elementAnchor = searchForName(listDocAtrAnchor, Consts.anchorName);
            if (elementAnchor != null) {
                elementAnchor.click();
            } else {
                System.out.println("Якорь не найден!");
            }
            listFunction.click();
            WebElement elementFun = searchForName(listFun, Consts.functionName);
            if (elementFun != null) {
                elementFun.click();
            } else {
                System.out.println("Функция не найдена");
            }
            WebElement elementPeriod = searchForValue(variablePeriodQuantity, Consts.periodVariable);
            if (elementPeriod != null) {
                elementPeriod.click();
            } else {
                System.out.println("Период не найден");
            }
            periodNumber.setValue(Consts.periodNumber);
            WebElement elementPrecision = searchForValue(variablePrecisionQuantity, Consts.precisionVariable);
            if (elementPrecision != null) {
                elementPrecision.click();
            } else {
                System.out.println("Точность не найдена");
            }
        }
        fieldVarDescription.setValue(Consts.descriptionVariable);
        btnCreateVar.click();
        popUpVarCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpVar.click();
        WebElement elementVar = searchForName(varNamesList, variableName);
        if (elementVar != null) {
            $x(String.format(btnDescriotion, elementVar.getText())).click();
            //$x("//a[contains(text(), '" + elementVar.getText() + "')]/../../td[1]").click();
            this.varDescriptionInTable.shouldBe(Condition.text(Consts.descriptionVariable)); // получаем текст из открытого описания и сравниваем с тем, что было передано как аргумент функции
            $x(String.format(btnDescriotion, elementVar.getText())).click();
        } else {
            System.out.println("Переменная не создана!");
        }

    }

    public void deleteVar(String name) {
        checkVarTabIsOpen();
        WebElement element = searchForName(varNamesList, name);
        if (element != null) {
            deleteProcess(name);
        } else {
            createVariable(name);
            deleteProcess(name);
        }
    }

    public void checkVarTabIsOpen() {
        if (!headCheckVar.isDisplayed()) {
            clickVarTab.click();
            headCheckVar.shouldBe(Condition.visible, Duration.ofSeconds(5));
        }
    }

//    public WebElement searchForName(ElementsCollection collection, String name) {
//        WebElement element = collection.stream()
//                .filter(el -> name.equals(el.getText()))
//                .findAny()
//                .orElse(null);
//        return element;
//    }
//
    public WebElement searchForValue(ElementsCollection collection, String value) {
        WebElement element = collection.asFixedIterable().stream()
                .filter(el -> value.equals(el.getValue()))
                .findAny()
                .orElse(null);
        return element;
    }

    public WebElement searchForName(ElementsCollection collection, String name) {
        WebElement element = collection.asFixedIterable().stream()
                //.peek(el -> System.out.println("Найденный элемент: " + el))
                .filter(el -> name.equals(el.getText()))
                .findAny()
                .orElse(null);
        return element;
    }


    public void deleteProcess(String variableName) {
        WebElement elementAction = searchForName(varNamesList, variableName);
        if (elementAction != null) {
            $x(String.format(btnCrudVariable, variableName)).click();
            //$x("//app-aggregates-grid//tr/td[3]/a[text()='" + elementAction.getText() + "']/../following-sibling::td[8]/app-icon").click();
        } else {
            System.out.println("Переменной нет!");
        }
        btnDeleteVar.click();
        btnApprove.click();
        popUpVarDelete.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpVar.click();
    }

    public SelenideElement randSearch(ElementsCollection collection) {
        if (collection.size() > 0) {
            int randomIndex = new Random().nextInt(collection.size());
            SelenideElement randomElement = collection.get(randomIndex);
            return randomElement;
        } else {
            System.out.println("Сущности нет");
            return null;
        }
    }

    public boolean collectionVisibilityCheck(ElementsCollection collection) {
        int visibleElementsCount = collection.filterBy(Condition.visible).size();
        if (visibleElementsCount == collection.size() && collection.size() > 0) {
            System.out.println("Все элементы видны.");
            return true;
        } else {
            System.out.println("Не все элементы видны.");
            return false;
        }
    }

    public boolean collectionVisibilityCheck(ElementsCollection collection, SelenideElement element) {
        element.click();
        int visibleElementsCount = collection.filterBy(Condition.visible).size();
        if (visibleElementsCount == collection.size() && collection.size() > 0) {
            System.out.println("Все элементы видны.");
            return true;
        } else {
            System.out.println("Не все элементы видны.");
            return false;
        }
    }

    public void simpleEditProcess(String nameVar, String period, String description) {
        WebElement elementAction = searchForName(varNamesList, nameVar);
        if (elementAction != null) {
            $x(String.format(btnCrudVariable, nameVar)).click();
        } else {
            System.out.println("Переменной нет!");
        }
        btnEditVar.click();
        listDocTypeOne.click();
        randSearch(listDocAtrAnchor).click();
        listAtrOne.click();
        randSearch(listDocAtrAnchor).click();
        listAnchorOne.click();
        randSearch(listDocAtrAnchor).click();
        listFunction.click();
        randSearch(listFun).click();
        if (collectionVisibilityCheck(variablePeriodQuantity) && collectionVisibilityCheck(variablePrecisionQuantity)) {
            randSearch(variablePeriodQuantity).click();
            randSearch(variablePrecisionQuantity).click();
            periodNumber.setValue(period);
            fieldVarDescription.setValue(description);
        } else {
            fieldVarDescription.setValue(description);
        }
        btnSaveVar.click();
        try {
            popUpVarConfirmation.shouldBe(Condition.visible, Duration.ofSeconds(3));
            btnApproveVar.click();
        } catch (ElementNotFound e) {
            e.printStackTrace();
        }
        popUpVarEdit.shouldBe(Condition.visible, Duration.ofSeconds(3));
        btnClosePopUpVar.click();
    }

    public void editVar(String name, String editperiod, String editdescription) {
        checkVarTabIsOpen();
        WebElement element = searchForName(varNamesList, name);
        if (element != null) {
            simpleEditProcess(name, editperiod, editdescription);
        } else {
            createVariable(name);
            simpleEditProcess(name, editperiod, editdescription);
        }
    }
}


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class FactorTab {
    VariableTab variableTab = new VariableTab();
    //    private final SelenideElement addFactorTab = $x("//*[text()='Добавить']"); //кнопка добавить фактор
    private final SelenideElement btnAddFactor = $x("//*[@class = 'action']"); //кнопка добавить
    private final SelenideElement btnSelectMathFactorFromList = $x("//div/ul/li[text()='MATH-фактор']"); //выбор мат фактора
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
    private final SelenideElement selectDeleteFactor = $x("//td/a[text()='F_test_factor']/../following-sibling::td/div/ul/li[text()='Удалить']"); // удаление фактора
    private final SelenideElement selectEditFactor = $x("//td/a[text()='F_test_factor']/../following-sibling::td/div/ul/li[text()='Редактировать']"); // редактирование фактора
    private final SelenideElement approveSelectDeleteFactor = $x("//footer/button[text()='Да']"); // подтвеждение удаления
    private final SelenideElement popApDelete = $x("//div/app-icon[text()='close']"); // поп-ап удаления
    private final SelenideElement headCheckFactor = $x("//h2[normalize-space(text())='Факторы']"); // проверка заголовка
    private final SelenideElement approveEditFactor = $x("//app-confirmation-popup/footer/button[@class='popup-action']"); //подтверждение редактирования
    private final SelenideElement clickFactorTab = $x("//span[text()='Факторы']");//перейти на вкладку факторы
    private final ElementsCollection factorsNamesList = $$x("//app-factors-grid//tr/td[3]/a"); //фактор в таблице
    private final SelenideElement factorName = $x("//app-text-box[@formcontrolname='factorName']/input"); //поле имени фактора
    private final SelenideElement factorDescription = $x("//app-text-area[@formcontrolname='description']/textarea"); //описание фактора
    private final SelenideElement factorCondition = $x("//*[@class='program-editor-wrap']/div[@class='program-editor']"); //Форма Добавления фактора, условие фактора
    private final SelenideElement btnFactorValidation = $x("//button/span[text()='Валидация']"); //Форма Добавления фактора, кнопка валидация
    private final SelenideElement iconValidationPast = $x("//app-icon[text()='check_circle_outline']"); //значок валидации (зеленый)
    private final SelenideElement btnFactorTest = $x("//button/span[text()='Тест']"); //Форма Добавления фактора, кнопка тест
    private final String factorTestField = "//div/label[text()='%s']//following-sibling::app-text-box/input"; // поле ввода значения для теста
    private final SelenideElement btnFactorTestCond = $x("//footer/button[text() ='Проверить']"); //Форма проверки фактора, кнопка проверить
    private final SelenideElement bntGoBackCreatedFactor = $x("//button[@class='transparent']"); //Форма проверки фактора, вернуться к форме создания
    private final SelenideElement btnCreateFactor = $x("//*[@class='popup-action']"); //Форма Добавления фактора, кнопка добавить
    private final SelenideElement btnCancelCreateFactor = $x("//*[@class='cancel']"); //Форма Добавления фактора, кнопка отменить
    private final SelenideElement popUpFactorCreated = $x("//div/label[text()='Фактор добавлен']"); // поп-ап создания фактора
    private final SelenideElement btnClosePopUpFactor = $x("//div/app-icon[text()='close']"); //Закрыть поп-ап создания
    private final String btnDescriotion = "//a[contains(text(), '%s')]/../../td[1]"; // поле ввода значения для теста
    private final SelenideElement factorDescriptionInTable = $x("//tr[@class='information']"); //описание в таблице
    private final String elementVariableForTest = "//div/label[contains(text(),'%s')]"; //атрибут для проверки переменной, если его нет идет создание переменной
    private final SelenideElement btnApproveCancelCreateFactor = $x("//app-confirmation-popup/footer/button[@class='popup-action']"); //кнопка подтверждения отмены создания фактора
    private final String btnCrudFactor = "//td/a[text()='%s']/../following-sibling::td/app-icon"; // выбор списка с действиями для фактора
    private final SelenideElement btnDeleteFactor = $x("//div/ul/li[text()='Удалить']"); // удаление фактора
    private final SelenideElement btnApproveDeleteFactor = $x("//footer/button[text()='Да']"); // подтверждение удаления фактора
    private final SelenideElement popUpFactorDelete = $x("//div/label[text()='Фактор удален']"); //поп-ап удаления фильтра


    public void createMathFactor(String name, String description, String condition, String testField, String varName, String userId) {
        try {
            checkFactorTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка факторы не найдена (стоит не тот контур)");
            return;
        }
        WebElement element1 = searchFactorForName(factorsNamesList, name);
        if (element1 != null) {
            deleteFactor(name);
        } else {
            System.out.println("Фактора с таким же названием нет");
        }
        btnAddFactor.click();
        if (btnSelectMathFactorFromList.isDisplayed()) {
            btnSelectMathFactorFromList.click();
            factorName.setValue(name);
            factorDescription.setValue(description);
            factorCondition.setValue(condition);
            btnFactorValidation.click();
            iconValidationPast.shouldBe(Condition.visible, Duration.ofSeconds(5));
            btnFactorTest.click();
            if ($x(String.format(elementVariableForTest, userId)).isDisplayed()){
                $x(String.format(factorTestField, userId)).setValue(testField);
                $x(String.format(factorTestField, varName)).setValue(testField);
                btnFactorTestCond.click();
                bntGoBackCreatedFactor.click();
                btnCreateFactor.click();
                popUpFactorCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
                btnClosePopUpFactor.click();
                WebElement element = searchFactorForName(factorsNamesList, name);
                if (element != null) {
                    $x(String.format(btnDescriotion, element.getText())).click();
                    this.factorDescriptionInTable.shouldBe(Condition.text(condition)); // получаем текст из открытого описания и сравниваем с тем, что было передано как аргумент функции
                    $x(String.format(btnDescriotion, element.getText())).click();
                } else {
                    Assert.isTrue(element == null, "Фактор " + name + " отсуствует");
                    //System.out.println("Фильтр не создан!");
                }
            }
            else {
                bntGoBackCreatedFactor.click();
                btnCancelCreateFactor.click();
                btnApproveCancelCreateFactor.click();
                variableTab.createVariable(varName);
                checkFactorTabIsOpen();
                btnAddFactor.click();
                btnSelectMathFactorFromList.click();
                factorName.setValue(name);
                factorDescription.setValue(description);
                factorCondition.setValue(condition);
                btnFactorValidation.click();
                iconValidationPast.shouldBe(Condition.visible, Duration.ofSeconds(5));
                btnFactorTest.click();
                $x(String.format(factorTestField, userId)).setValue(testField);
                $x(String.format(factorTestField, varName)).setValue(testField);
                btnFactorTestCond.click();
                bntGoBackCreatedFactor.click();
                btnCreateFactor.click();
                popUpFactorCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
                btnClosePopUpFactor.click();
                WebElement element = searchFactorForName(factorsNamesList, name);
                if (element != null) {
                    $x(String.format(btnDescriotion, element.getText())).click();
                    this.factorDescriptionInTable.shouldBe(Condition.text(condition)); // получаем текст из открытого описания и сравниваем с тем, что было передано как аргумент функции
                    $x(String.format(btnDescriotion, element.getText())).click();
                } else {
                    Assert.isTrue(element == null, "Фактор " + name + " отсуствует");
                    //System.out.println("Фильтр не создан!");
                }
            }


        } else {
            Assert.isTrue(btnSelectMathFactorFromList.isDisplayed() == false, "Создание MATH фактора невозможно, стоит контур без этой возможности");
        }
    }

    public boolean createMathFactor(String name) {
        checkFactorTabIsOpen();
        btnAddFactor.click();
        btnSelectMathFactorFromList.isDisplayed();
        btnSelectMathFactorFromList.click();
        factorName.setValue(name);
        factorDescription.setValue(Consts.factorDescr);
        factorCondition.setValue(Consts.factorCond);
        btnFactorValidation.click();
        iconValidationPast.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnFactorTest.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if ($x(String.format(elementVariableForTest, Consts.factorTestAtr)).isDisplayed() &&
                $x(String.format(elementVariableForTest, Consts.varName)).isDisplayed()) {
            bntGoBackCreatedFactor.click();
            btnCreateFactor.click();
            popUpFactorCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
            btnClosePopUpFactor.click();
            WebElement element = searchFactorForName(factorsNamesList, name);
            if (element != null) {
                return true;
            } else {
                return false;
            }
        }else {
            bntGoBackCreatedFactor.click();
            btnCancelCreateFactor.click();
            btnApproveCancelCreateFactor.click();
            variableTab.createVariable(Consts.varName);
            checkFactorTabIsOpen();
            btnAddFactor.click();
            btnSelectMathFactorFromList.isDisplayed();
            btnSelectMathFactorFromList.click();
            factorName.setValue(name);
            factorDescription.setValue(Consts.factorDescr);
            factorCondition.setValue(Consts.factorCond);
            btnCreateFactor.click();
            popUpFactorCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
            btnClosePopUpFactor.click();
            WebElement element = searchFactorForName(factorsNamesList, name);
            if (element != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void deleteFactor(String name) {
        try {
            checkFactorTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка факторы не найдена (стоит не тот контур)");
            return;
        }
        WebElement element = searchFactorForName(factorsNamesList, name);
        if (element != null) {
            deleteProcess(name);
        } else {
            if (createMathFactor(name)) deleteProcess(name);
            else System.out.println("Невозможно создать фактор для его удаления");
        }
    }

//    public void editFilter(String name, String descr, String cond) {
//        try {
//            checkFiltersTabIsOpen();
//        } catch (ElementNotFound e) {
//            System.out.println("Вкладка фильтр не найдена (стоит не тот контур)");
//            return;
//        }
//        WebElement element = searchFilterForName(filtersNamesList, name);
//        if (element != null) {
//            editProcess(name, descr, cond);
//        } else {
//            if (createFilter(name)) editProcess(name, descr, cond);
//            else System.out.println("Невозможно отредактировать фильтр для его редактирования");
//        }
//    }
//
//
//    private void editProcess(String element, String descr, String cond) {
//        $x("//a[contains(text(), '" + element + "')]/../../td[7]/app-icon").click();
//        btnEditFilter.click();
//        filterDescription.setValue(descr);
//        filterCondition.setValue(cond);
//        btnFilterValidation.click();
//        iconValidationPast.shouldBe(Condition.visible, Duration.ofSeconds(5));
//        btnCreateFilter.click();
//        popUpFilterEditApprove.shouldBe(Condition.visible, Duration.ofSeconds(5));
//        btnApproveEditFilter.click();
//        popUpFilterEdit.shouldBe(Condition.visible, Duration.ofSeconds(5));
//        btnClosePopUpFilter.click();
//        //deleteFilter(element);
//    }


    private void deleteProcess(String element) {
        if (element != null) {
            $x(String.format(btnCrudFactor, element)).click();
            //$x("//a[contains(text(), '" + element + "')]/../../td[7]/app-icon").click();
        } else {
            System.out.println("Фактора нет!");
        }
        btnDeleteFactor.click();
        btnApproveDeleteFactor.click();
        popUpFactorDelete.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpFactor.click();
    }

    public WebElement searchFactorForName(ElementsCollection collection, String name) {
        WebElement element = collection.asFixedIterable().stream()
                .filter(el -> name.equals(el.getText()))
                .findAny()
                .orElse(null);
        return element;
    }

    //
//
    public void checkFactorTabIsOpen() {
        if (!headCheckFactor.isDisplayed()) {
            clickFactorTab.click();
            headCheckFactor.shouldBe(Condition.visible, Duration.ofSeconds(5));
        }
    }
}
//
//
//    public FactorTab clickAddFactorTab() {
//        addFactorTab.click();
//        ;
//        return this;
//    }
//
//    public FactorTab clickSelectMathFactor() {
//        selectMathFactor.click();
//        return this;
//    }
//
//    public FactorTab inputAddNameFactor() {
//        addNameFactor.setValue("F_test_factor");
//        return this;
//    }
//
//    public FactorTab inputAddDescrFactor() {
//        addDescrFactor.setValue("Комментарий редакция 1");
//        return this;
//    }
//
//    public FactorTab editDescrFactor() {
//        addDescrFactor.setValue("Комментарий редакция 2");
//        return this;
//    }
//
//    public FactorTab editConditionFactor() {
//        addConditionFactor.setValue("IF var_test > 10*BV");
//        return this;
//    }
//
//    public FactorTab inputConditionFactor() {
//        addConditionFactor.setValue("IF var_test > 1000");
//        return this;
//    }
//
//    public FactorTab clickValidationFactor() {
//        validationFactor.click();
//        return this;
//    }
//
//    public FactorTab clickWindowTest() {
//        windowTest.click();
//        return this;
//    }
//
//    public FactorTab inputFieldTestUser() {
//        addFieldTestUser.setValue("12345");
//        return this;
//    }
//
//    public FactorTab inputAddFieldTestVar() {
//        addFieldTestVar.setValue("3000");
//        return this;
//    }
//
//    public FactorTab clickCheckFactor() {
//        checkFactor.click();
//        return this;
//    }
//
//    public FactorTab clickBackToFactor() {
//        backToFactor.click();
//        return this;
//    }
//
//    public FactorTab clickAddFactor() {
//        addFactor.click();
//        return this;
//    }
//
//    public FactorTab clickClosePopApFactor() {
//        closePopApFactor.click();
//        return this;
//    }
//
//    public FactorTab clickSearchFieldFactor() {
//        searchFieldFactor.setValue("F_test_factor");
//        return this;
//    }
//
//    public FactorTab clickFactorDescr() {
//        factorDescr.click();
//        return this;
//    }
//
//    public FactorTab clickWorkToFactor() {
//        workToFactor.click();
//        return this;
//    }
//
//    public FactorTab clickSelectDeleteFactor() {
//        selectDeleteFactor.click();
//        return this;
//    }
//
//    public FactorTab clickSelectEditFactor() {
//        selectEditFactor.click();
//        return this;
//    }
//
//    public FactorTab clickApproveSelectDeleteFactor() {
//        approveSelectDeleteFactor.click();
//        return this;
//    }
//
//    public FactorTab clickPopApDelete() {
//        popApDelete.click();
//        return this;
//    }
//
//    public FactorTab checkHeadFactor() {
//        headFactor.shouldBe(Condition.visible, Duration.ofSeconds(5));
//        return this;
//    }
//
//    public FactorTab clickApproveEditFactor() {
//        approveEditFactor.click();
//        return this;
//    }




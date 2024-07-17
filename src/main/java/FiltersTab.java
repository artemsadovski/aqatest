import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;
import io.qameta.allure.Severity;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import java.nio.channels.ScatteringByteChannel;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class FiltersTab {
    private final SelenideElement clickFilterTab = $x("//span[normalize-space(text())='Фильтры']");//перейти н авкладку фильтры
    private final SelenideElement btnAddFilter = $x("//*[@class = 'action']"); //кнопка добавить
    private final SelenideElement searchFilter = $x("//app-text-box/input"); //фильтер в таблице
    private final SelenideElement btnFilterDescrInTable = $x("//td/a[normalize-space(text())='" + Consts.filterName + "']/../preceding-sibling::td/app-icon"); //просмотр описания фильтра в таблице
    private final SelenideElement putFilter = $x("//td/a[normalize-space(text())='FL_TEST_AQA']/../following-sibling::td/app-icon"); //вызов кнопки редактирования
    private final SelenideElement filterName = $x("//app-text-box[@formcontrolname='factorName']/input"); //Форма Добавления фильтра, наименование фильтра
    private final SelenideElement filterDescription = $x("//app-text-area[@formcontrolname='description']/textarea"); //Форма Добавления фильтра, описание фильтра
    //private final SelenideElement filterCondition = $x("//*[@class='program-editor-wrap']/div[@class='program-editor']"); //Форма Добавления фильтра, условие фильтра
    private final SelenideElement filterCondition = $x("//*[@class='cursor monaco-mouse-cursor-text ']"); //Форма Добавления фильтра, условие фильтра
    //private final SelenideElement filterCondition = $x("//*[@class='view-lines monaco-mouse-cursor-text']"); //Форма Добавления фильтра, условие фильтра
    private final SelenideElement btnFilterValidation = $x("//button/span[normalize-space(text())='Валидация']"); //Форма Добавления фильтра, кнопка валидация
    private final SelenideElement btnFilterTest = $x("//button/span[normalize-space(text())='Тест']"); //Форма Добавления фильтра, кнопка тест
    private final SelenideElement filterTestField = $x("//div/label[normalize-space(text())='TEST_FIELD']//following-sibling::app-text-box/input"); //Форма проверки фильтра, поле ввода TestField
    private final SelenideElement btnCreateFilter = $x("//*[@class='popup-action']"); //Форма Добавления фильтра, кнопка добавить
    private final SelenideElement popUpFilterCreated = $x("//div/label[normalize-space(text())='Фильтр добавлен']"); // поп-ап создания фильтра
    private final SelenideElement btnClosePopUpFilter = $x("//div/app-icon[normalize-space(text())='close']"); //Закрыть поп-ап создания
    private final SelenideElement btnFilterTestCond = $x("//footer/button[normalize-space(text()) ='Проверить']"); //Форма проверки фильтра, кнопка проверить
    private final SelenideElement bntGoBackCreatedFilter = $x("//button[@class='transparent']"); //Форма проверки фильтра, вернуться к форме создания
    private final ElementsCollection btnCrudFilter = $$x("//tbody/tr/td/app-icon[normalize-space(text())='more_horiz']"); // выбор списка с действиями для фильтра
    private final SelenideElement btnDeleteFilter = $x("//div/ul/li[normalize-space(text())='Удалить']"); // удаление фильтра
    //private final SelenideElement btnEditFilter = $x("//td/a[text()='" + Consts.filterName + "']/../following-sibling::td/div/ul/li[text()='Редактировать']");
    //private final SelenideElement btnEditFilter = $x("//td/a[normalize-space(text())='" + Consts.filterName + "']/../following-sibling::td/div/ul/li[normalize-space(text())='Редактировать']");
    private final SelenideElement btnEditFilter = $x("//div/ul/li[normalize-space(text())='Редактировать']");
    private final SelenideElement btnApproveDeleteFilter = $x("//footer/button[normalize-space(text())='Да']"); // подтверждение удаления
    private final SelenideElement btnApproveEditFilter = $x("//app-confirmation-popup/footer/button[@class='popup-action']"); //подтверждение редактирования
    private final SelenideElement iconValidationPast = $x("//app-icon[normalize-space(text())='check_circle_outline']"); //значок валидации (зеленый)
    private final ElementsCollection filtersNamesList = $$x("//app-filters-grid//tr/td[3]/a"); //фильтр в таблице
    private final SelenideElement filterDescriptionInTable = $x("//tr[@class='information']"); //описание в таблице
    private final SelenideElement filterDescrInTable = $x("//tr/td/div[normalize-space(text())='" + Consts.filterDescr + "']"); //описание фильтра в таблице
    private final SelenideElement popUpFilterDelete = $x("//div/label[normalize-space(text())='Фильтр удален']"); //поп-ап удаления фильтра
    private final SelenideElement headCheckFilter = $x("//h2[normalize-space(text())='Фильтры']"); // проверка заголовка
    private final SelenideElement fieldSearchFilter = $x("//app-text-box/input[@placeholder='Поиск']"); // поле поиска
    private final SelenideElement popUpFilterEditApprove = $x("//app-confirmation-popup"); // сообение о редактировании фильтра
    private final SelenideElement popUpFilterEdit = $x("//div/label[normalize-space(text())='Фильтр обновлен']"); // поп-ап сообщение об обновлении фильтра


    @Step("Создание фильтра")
    public void createFilter(String name, String description, String condition, String testField) {
        try {
            checkFiltersTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка фильтр не найдена (стоит не тот контур)");
            return;
        }
        WebElement element1 = searchFilterForName(filtersNamesList, name);
        if (element1 != null) {
            deleteFilter(name);
        } else {
            System.out.println("Фильтра с таким же названием нет");
        }
        btnAddFilter.click();
        filterName.setValue(name);
        filterDescription.setValue(description);
        actions().moveToElement(filterCondition).click(filterCondition).sendKeys(condition).perform();
        //filterCondition1.click();
        //filterCondition.setValue(condition);
        btnFilterValidation.click();
        iconValidationPast.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnFilterTest.click();
        filterTestField.setValue(testField);
        btnFilterTestCond.click();
        bntGoBackCreatedFilter.click();
        btnCreateFilter.click();
        popUpFilterCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpFilter.click();
        WebElement element = searchFilterForName(filtersNamesList, name);
        if (element != null) {
            $x("//a[contains(text(), '" + element.getText() + "')]/../../td[1]").click();
            this.filterDescriptionInTable.shouldBe(Condition.text(description)); // получаем текст из открытого описания и сравниваем с тем, что было передано как аргумент функции
            $x("//a[contains(text(), '" + element.getText() + "')]/../../td[1]").click();
        } else {
            System.out.println("Фильтр не создан!");
        }
    }

    public boolean createFilter(String name) {
        checkFiltersTabIsOpen();
        btnAddFilter.click();
        filterName.setValue(name);
        //filterCondition.setValue(Consts.filterCond);
        actions().moveToElement(filterCondition).click(filterCondition).sendKeys(Consts.filterCond).perform();
        btnFilterValidation.click();
        iconValidationPast.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnCreateFilter.click();
        popUpFilterCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpFilter.click();
        WebElement element = searchFilterForName(filtersNamesList, name);
        if (element != null) {
            return true;
        } else {
            return false;
        }
    }

    @Step("Удаление фильтра")
    public void deleteFilter(String name) {
        try {
            checkFiltersTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка фильтр не найдена (стоит не тот контур)");
            return;
        }
        WebElement element = searchFilterForName(filtersNamesList, name);
        if (element != null) {
            deleteProcess(name);
        } else {
            if (createFilter(name)) deleteProcess(name);
            else System.out.println("Невозможно создать фильтр для его удаления");
        }
    }

    @Step("Редактирование фильтра")
    public void editFilter(String name, String descr, String cond) {
        try {
            checkFiltersTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка фильтр не найдена (стоит не тот контур)");
            return;
        }
        WebElement element = searchFilterForName(filtersNamesList, name);
        if (element != null) {
            editProcess(name, descr, cond);
        } else {
            if (createFilter(name)) editProcess(name, descr, cond);
            else System.out.println("Невозможно отредактировать фильтр для его редактирования");
        }
    }


    private void editProcess(String element, String descr, String cond) {
        $x("//a[contains(text(), '" + element + "')]/../../td[7]/app-icon").click();
        btnEditFilter.click();
        filterDescription.setValue(descr);
        actions().moveToElement(filterCondition).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
        actions().moveToElement(filterCondition).click(filterCondition).sendKeys(cond).perform();
        btnFilterValidation.click();
        iconValidationPast.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnCreateFilter.click();
        popUpFilterEditApprove.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnApproveEditFilter.click();
        popUpFilterEdit.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpFilter.click();
        //deleteFilter(element);
    }


    private void deleteProcess(String element) {
        if (element != null) {
            $x("//a[contains(text(), '" + element + "')]/../../td[7]/app-icon").click();
        } else {
            System.out.println("Фильтра нет!");
        }
        btnDeleteFilter.click();
        btnApproveDeleteFilter.click();
        popUpFilterDelete.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpFilter.click();
    }

    private WebElement searchFilterForName(ElementsCollection collection, String name) {
        WebElement element = collection.asFixedIterable().stream()
                .filter(el -> name.equals(el.getText()))
                .findAny()
                .orElse(null);
        return element;
    }

//    public WebElement searchFilterForName(ElementsCollection collection, String name) {
//        WebElement element = null;
//        for (WebElement el : collection) {
//            if (name.equals(el.getText())) {
//                element = el;
//                break;
//            }
//        }
//        return element;
//    }

//    public void checkFiltersTabIsOpen() {
//        try {
//            if (!headCheckFilter.isDisplayed()) {
//                clickFilterTab.click();
//                headCheckFilter.shouldBe(Condition.visible, Duration.ofSeconds(5));
//            }
//        } catch (ElementNotFound e) {
//            System.out.println("Вкладка фильтр не найдена");
//        }
//    }

    private void checkFiltersTabIsOpen() {
        if (!headCheckFilter.isDisplayed()) {
            clickFilterTab.click();
            headCheckFilter.shouldBe(Condition.visible, Duration.ofSeconds(5));
        } else if (headCheckFilter.isDisplayed()) {
            headCheckFilter.shouldBe(Condition.visible, Duration.ofSeconds(5));
        }

    }
}
//

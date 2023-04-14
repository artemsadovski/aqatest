import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class FiltersTab {

    private final SelenideElement createButton = $x("//*[@class = 'action']"); //кнопка добавить
    private final SelenideElement searchFilter = $x("//app-text-box/input"); //филтер в таблице
    private final SelenideElement descriptionFilter = $x("//td/a[text()='FL_TEST_QA']/../preceding-sibling::td/app-icon"); //просмотр описания фильтра в таблице
    private final SelenideElement putFilter = $x("//div/ul/li[text()='Редактировать']"); //вызов кнопки редактирования
    private final SelenideElement deleteFilter = $x("//div/ul/li[text()='Удалить']"); //вызов кнопки удаления фильтра
    private final SelenideElement deleteFilterYes = $x("//footer/button[@class='attention']"); //поп-ап удаления фильтра, кнопка ДА
    private final SelenideElement deleteFilterNo = $x("//footer/button[@class='cancel']"); //поп-ап удаления фильтра, кнопка НЕТ
    private final SelenideElement addFilterName = $x("//app-text-box[@formcontrolname='factorName']/input"); //Форма Добавления фильтра, наименование фильтра
    private final SelenideElement addFilterDescription = $x("//app-text-area[@formcontrolname='description']/textarea"); //Форма Добавления фильтра, описание фильтра
    private final SelenideElement addFilterCondition = $x("//*[@class='program-editor-wrap']/div[@class='program-editor']"); //Форма Добавления фильтра, условие фильтра
    private final SelenideElement filterValidation = $x("//button/span[text()='Валидация']"); //Форма Добавления фильтра, кнопка валидация
    private final SelenideElement filterTest = $x("//button/span[text()='Тест']"); //Форма Добавления фильтра, кнопка тест
    private final SelenideElement filterTestField = $x("//div/label[text()='TEST_FIELD']//following-sibling::app-text-box/input"); //Форма проверки фильтра, поле ввода TestField
    private final SelenideElement createButtonPopup = $x("//*[@class='popup-action']"); //Форма Добавления фильтра, кнопка добавить
    private final SelenideElement filterTestGo = $x("//footer/button[text() ='Проверить']"); //Форма проверки фильтра, кнопка проверить
    private final SelenideElement filterTestGoBack = $x("//button[@class='transparent']"); //Форма проверки фильтра, вернуться к форме создания


    public FiltersTab clickCreateButton() {
        createButton.click();
        return this;
    }

    public FiltersTab inputFilterName() {
        addFilterName.setValue("FL_TEST_AQA");
        return this;
    }

    public FiltersTab inputFilterDescription() {
        addFilterDescription.setValue("Описание бла бла бла");
        return this;
    }

    public FiltersTab inputFilterCondition() {
        addFilterCondition.setValue("IF TEST_FIELD REGEXP_LIKE '^[A-Z0-9]{8}3816[0-9]+$'{ADD_FIELD ('TEST_FIELD_ADD', 'ADD_ATR');}");
        return this;
    }

    public FiltersTab clickValidationButton() {
        filterValidation.click();
        return this;
    }

    public FiltersTab clickTestButton() {
        filterTest.click();
        return this;
    }

    public FiltersTab inputFilterConditionTest() {
        filterTestField.setValue("1234567838161233");
        return this;
    }

    public FiltersTab checkFilterConditionTest() {
        filterTestGo.click();
        return this;
    }

    public FiltersTab backFilterCreate() {
        filterTestGoBack.click();
        return this;
    }

    public FiltersTab createFilter() {
        createButtonPopup.click();
        return this;
    }

    public FiltersTab descriptionTable() {
        descriptionFilter.click();
        return this;
    }

}

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class Attribute {

    private final SelenideElement btnAddDocument = $x("//*[normalize-space(text())='Добавить']"); //Кнопка добавления документа
    private final SelenideElement btnAddAttribute = $x("//span[normalize-space(text())='Добавить атрибут']");//кнопка добавления атрибута
    private final SelenideElement attributeCode = $x("//app-text-box[@formcontrolname='attributeName']/input");//поле ввода имени арибута
    private final SelenideElement attributeName = $x("//app-text-box[@formcontrolname='description']/input");//поле ввода описания атрибута
    private final SelenideElement btaSubmitAddAttribute = $x("//footer/button[@type='submit']"); //кнопка добавления атрибута
    //private final SelenideElement btnClosePopUpAttribute = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //поп ап создания атрибута
    private final SelenideElement btnClosePopUpAttribute = $x("//div/app-icon[normalize-space(text())='close']"); //поп ап создания атрибута
    private final SelenideElement headCheckDocument = $x("//h2[normalize-space(text())='Документы']"); //вкладки документы
    private final SelenideElement clickDocumentTab = $x("//span[normalize-space(text())='Документы']");//перейти на вкладку документы
    private final SelenideElement headCheckAttribute = $x("//header/h3[normalize-space(text())='Все атрибуты']"); //шапка таблицы атрибутов
    public final ElementsCollection attributesNamesList = $$x("//app-document-attributes-grid//tr/td[2]"); //атрибут в таблице
    private final SelenideElement popUpAttributeCreated = $x("//div/label[normalize-space(text())='Атрибут добавлен']"); // поп-ап создания атрибута
    private final SelenideElement btnDeleteAttribute = $x("//div/ul/li[normalize-space(text())='Удалить']"); //кнопка удаления атрибута
    private final SelenideElement btnEditAttribute = $x("//div/ul/li[normalize-space(text())='Редактировать']"); //кнопка редактирования атрибута
    private final SelenideElement btnApproveDeleteAttribute = $x("//footer/button[normalize-space(text())='Да']");
    private final SelenideElement popUpAttributeDelete = $x("//div/label[normalize-space(text())='Атрибут удален']");
    //private final SelenideElement btnClosePopUpAttribute = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //поп ап создания атрибута
    private final SelenideElement btnSavaAttribute = $x("//app-document-attribute-form//*[text()='Сохранить']"); //сохранение атрибута
    private final SelenideElement popUpAttributeEdit = $x("//div/label[normalize-space(text())='Атрибут обновлен']");

    @Step("Создание атрибута")
    public void createAttribute(String code, String name) {
        try {
            checkAttributeWindowIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка документы или атрибуты - не найдены");
            return;
        }
        WebElement element1 = searchForName(attributesNamesList, code);
        if (element1 != null) {
            deleteAttribute(code);
        } else {
            System.out.println("Атрибута с таким же названием нет");
        }
        btnAddAttribute.click();
        attributeCode.setValue(code);
        attributeName.setValue(name);
        btaSubmitAddAttribute.click();
        popUpAttributeCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpAttribute.click();
        WebElement element = searchForName(attributesNamesList, code);
        if (element != null) {
            System.out.println("Атрибут создан!");
        } else {
            System.out.println("Атрибут не создан!");
        }
    }

    private boolean createAttribute(String code) {
        checkAttributeWindowIsOpen();
        btnAddAttribute.click();
        attributeCode.setValue(code);
        attributeName.setValue(Consts.attributeName);
        btaSubmitAddAttribute.click();
        popUpAttributeCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpAttribute.click();
        WebElement element = searchForName(attributesNamesList, code);
        if (element != null) {
            return true;
        } else {
            return false;
        }
    }

    @Step("Удаление атрибута")
    public void deleteAttribute(String code) {
        try {
            checkAttributeWindowIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка документы или атрибуты - не найдены");
            return;
        }
        WebElement element = searchForName(attributesNamesList, code);
        if (element != null) {
            deleteProcess(code);
        } else {
            if (createAttribute(code)) deleteProcess(code);
            else System.out.println("Невозможно создать атрибут для его удаления");
        }
    }

    @Step("Редактирование атрибута")
    public void editAttribute(String code, String name) {
        try {
            checkAttributeWindowIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка документы или атрибуты - не найдены");
            return;
        }
        WebElement element = searchForName(attributesNamesList, code);
        if (element != null) {
            editProcess(code, name);
        } else {
            if (createAttribute(code)) editProcess(code, name);
            else System.out.println("Невозможно отредактировать атрибут для его удаления");
        }
    }

    private void editProcess(String code, String name) {
        $x("//app-document-attributes-grid//td[normalize-space(text())='" + code + "']/following-sibling::td[2]/app-icon").click();
        btnEditAttribute.click();
        //attributeCode.setValue(code);
        attributeName.setValue(name);
        btnSavaAttribute.click();
        popUpAttributeEdit.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpAttribute.click();
    }

    private void deleteProcess(String element) {
        if (element != null) {
            $x("//app-document-attributes-grid//td[normalize-space(text())='" + element + "']/following-sibling::td[2]/app-icon").click();
        } else {
            System.out.println("Атрибута нет!");
        }
        btnDeleteAttribute.click();
        btnApproveDeleteAttribute.click();
        popUpAttributeDelete.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpAttribute.click();
    }

    public void simpleCreateAttributeProcess(String code, String name) {
        btnAddAttribute.click();
        attributeCode.setValue(code);
        attributeName.setValue(name);
        btaSubmitAddAttribute.click();
        popUpAttributeCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpAttribute.click();
    }

    private WebElement searchForName(ElementsCollection collection, String name) {
        WebElement element = collection.asFixedIterable().stream()
                .filter(el -> name.equals(el.getText()))
                .findAny()
                .orElse(null);
        return element;
    }

    private void checkAttributeWindowIsOpen() {
        if (!headCheckDocument.isDisplayed()) {
            clickDocumentTab.click();
            headCheckDocument.shouldBe(Condition.visible, Duration.ofSeconds(5));
            btnAddDocument.click();
            headCheckAttribute.shouldBe(Condition.visible, Duration.ofSeconds(5));
        } else if (headCheckDocument.isDisplayed()) {
            headCheckDocument.shouldBe(Condition.visible, Duration.ofSeconds(5));
            btnAddDocument.click();
            headCheckAttribute.shouldBe(Condition.visible, Duration.ofSeconds(5));
        }
    }

}

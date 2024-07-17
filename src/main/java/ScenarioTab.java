import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ScenarioTab {
    private final SelenideElement btnAddScenario = $x("//*[normalize-space(text())='Добавить']");// кнопка добавить и вызов формы
    private final SelenideElement scenarioName = $x("//app-text-box[@formcontrolname='name']/input");// поле ввода имени риск профиля
    private final SelenideElement scenarioAnhor = $x("//app-text-box[@formcontrolname='anchor']/input");// поле ввода якоря риск профиля
    private final SelenideElement scenarioDescription = $x("//app-text-area[@formcontrolname='description']/textarea");// поле ввода описания риск профиля
    private final SelenideElement listScenarioProcces = $x("//app-select-box[@placeholder='Не выбрано']/*[text()='keyboard_arrow_down']");// список рабочих процессов
    private final SelenideElement workflowProcces = $x("//app-select-box/ul/li[text()='AF']");// выбор AF workflow
    private final SelenideElement addAFCryptoRiskProfile = $x("//app-select-box/ul/li[text()='AFCrypto']");// выбор AFCrypto workflow
    private final SelenideElement btnCreateScenario = $x("//footer/*[normalize-space(text())='Добавить']"); //добавление риск профиля
    private final SelenideElement btnSaveScenario = $x("//footer/*[normalize-space(text())='Сохранить']");
    private final SelenideElement editRiskProfileInList = $x("//footer/*[normalize-space(text())='Сохранить']"); //сохранение отредактированного риск профиля
    private final SelenideElement closePopApProfile = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //Закрыть поп-ап создания
    private final SelenideElement riskProfileDescriptionInTable = $x("//td/a[text()='User_test_aqa']/../preceding-sibling::td/app-icon");
    private final SelenideElement workToRiskProfile = $x("//td/a[text()='" + scenarioName + "']/../following-sibling::td/app-icon"); // выбор списка с действиями для риск профиля
    private final SelenideElement selectDeleteRiskProfile = $x("//td/a[text()='" + scenarioName + "']/../following-sibling::td/div/ul/li[text()='Удалить']"); // удаление риск-профиля
    private final SelenideElement approveSelectDeleteRiskProfile = $x("//footer/button[text()='Да']"); // подтверждение удаления
    private final SelenideElement editRiskProfile = $x("//td/a[text()='User_test_aqa']/../following-sibling::td/div/ul/li[text()='Редактировать']"); // удаление риск-профиля
    private final SelenideElement headCheckScanerio = $x("//h2[normalize-space(text())='Сценарии']"); // проверка заголовка
    private final SelenideElement clickScenarioTab = $x("//span[normalize-space(text())='Сценарии']");//перейти на вкладку Сценарии
    private final ElementsCollection workflowNamesList = $$x("//app-select-box[@formcontrolname='processId']/ul/li");// список рабочих процессов
    private final SelenideElement popUpScenarioCreated = $x("//div/label[normalize-space(text())='Сценарий добавлен']"); // поп-ап создания сценария
    private final SelenideElement popUpScenarioEdit = $x("//div/label[normalize-space(text())='Сценарий обновлен']"); //поп-ап обонвления
    private final SelenideElement btnClosePopUpScenario = $x("//div/app-icon[normalize-space(text())='close']"); //Закрыть поп-ап
    private final ElementsCollection scenarioNamesList = $$x("//app-scenarios-grid//tr/td[3]/a"); //сценарий в таблице
    public final ElementsCollection scenarioAnchorList = $$x("//app-scenarios-grid//tr/td[4]"); //якорь в таблице
    private final SelenideElement scenarioDescriptionInTable = $x("//tr[@class='information']"); //описание в таблице
    private final SelenideElement btnDeleteScenario = $x("//div/ul/li[normalize-space(text())='Удалить']"); // удаление сценария
    private final SelenideElement btnApproveDeleteScenario = $x("//footer/button[normalize-space(text())='Да']"); // подтверждение удаления
    private final SelenideElement popUpScenarioDelete = $x("//div/label[normalize-space(text())='Сценарий удален']"); //поп-ап удаления
    private final SelenideElement btnEditScenario = $x("//div/ul/li[normalize-space(text())='Редактировать']");
    public final ElementsCollection scenarioSearchAnchorList = $$x("//app-select-box/ul/li"); //список в фильтре
    public final ElementsCollection scenarioWorkflowList = $$x("//app-scenarios-grid//tr/td[5]"); //якорь в таблице

    //scenarioAnchorList
    @Step("Создание сценария")
    public void createScenario(String name, String anchor, String workflow, String description) {
        try {
            checkScanerioTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка сценарии не найдена (стоит не тот контур)");
            return;
        }
        WebElement element2 = searchForName(scenarioNamesList, name);
        if (element2 != null) {
            deleteScenario(name);
        } else {
            System.out.println("Сценария с таким же названием нет");
        }
        btnAddScenario.click();
        scenarioName.setValue(name);
        scenarioAnhor.setValue(anchor);
        listScenarioProcces.click();
        WebElement element = searchForName(workflowNamesList, workflow);
        String str = element.getText();
        if (element != null) {
            $x("//app-select-box/ul/li[normalize-space(text())='" + element.getText() + "']").click();
        } else {
            System.out.println("Процеса нет");
        }
        scenarioDescription.setValue(description);
        btnCreateScenario.click();
        popUpScenarioCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpScenario.click();
        WebElement element1 = searchForName(scenarioNamesList, name);
        if (element1 != null) {
            $x("//a[contains(text(), '" + element1.getText() + "')]/../../td[1]").click();
            this.scenarioDescriptionInTable.shouldBe(Condition.text(description)); // получаем текст из открытого описания и сравниваем с тем, что было передано как аргумент функции
            $x("//a[contains(text(), '" + element1.getText() + "')]/../../td[1]").click();
        } else {
            System.out.println("Сценарий не создан!");
        }

    }

    private boolean createScenario(String name) {
        checkScanerioTabIsOpen();
        btnAddScenario.click();
        scenarioName.setValue(name);
        scenarioAnhor.setValue(Consts.scenarioAnhor);
        listScenarioProcces.click();
        WebElement element = searchForName(workflowNamesList, Consts.scenarioWorkflow);
        if (element != null) {
            $x("//app-select-box/ul/li[normalize-space(text())='" + element.getText() + "']").click();
        } else {
            System.out.println("Процеса нет");
        }
        btnCreateScenario.click();
        popUpScenarioCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpScenario.click();
        WebElement element1 = searchForName(scenarioNamesList, name);
        if (element1 != null) {
            return true;
        } else {
            return false;
        }
    }

    @Step("Удаление сценария")
    public void deleteScenario(String name) {
        try {
            checkScanerioTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка сценарии не найдена (стоит не тот контур)");
            return;
        }
        WebElement element = searchForName(scenarioNamesList, name);
        if (element != null) {
            deleteProcess(name);
        } else {
            if (createScenario(name)) deleteProcess(name);
            else System.out.println("Невозможно создать сценарий для его удаления");
        }
    }


//    public void editProcess(String element, String anchor, String workflow, String descr) {
//        if (element != null) {
//            $x("//a[contains(text(), '" + element + "')]/../../td[9]/app-icon").click();
//        } else {
//            System.out.println("Сценария нет!");
//        }
//        btnEditScenario.click();
//        scenarioAnhor.setValue(anchor);
//        listScenarioProcces.click();
//        WebElement element1 = searchForName(workflowNamesList, workflow);
//        if (element1 != null) {
//            $x("//app-select-box/ul/li[text()='" + element1.getText() + "']").click();
//        } else {
//            System.out.println("Процеса нет");
//        }
//        scenarioDescription.setValue(descr);
//        btnSaveScenario.click();
//        popUpScenarioEdit.shouldBe(Condition.visible, Duration.ofSeconds(5));
//        btnClosePopUpScenario.click();
//    }

    @Step("Редактирования сценария")
    public void editScenario(String name, String anchor, String workflow, String descr) {
        try {
            checkScanerioTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка сценарий не найдена (стоит не тот контур)");
            return;
        }
        WebElement element = searchForName(scenarioNamesList, name);
        if (element != null) {
            editProcess(name, anchor, workflow, descr);
        } else {
            if (createScenario(name)) editProcess(name, anchor, workflow, descr);
            else System.out.println("Невозможно отредактировать сценарий");
        }
        WebElement element1 = searchForName(scenarioNamesList, name);
        if (element1 != null) {
            $x("//a[contains(text(), '" + element1.getText() + "')]/../../td[1]").click();
            this.scenarioDescriptionInTable.shouldBe(Condition.text(descr)); // получаем текст из открытого описания и сравниваем с тем, что было передано как аргумент функции
            $x("//a[contains(text(), '" + element1.getText() + "')]/../../td[1]").click();
        } else {
            System.out.println("Сценарий не создан!");
        }
    }

    private void editProcess(String name, String anchor, String workflow, String descr) {
        $x("//a[contains(text(), '" + name + "')]/../../td[9]/app-icon").click();
        btnEditScenario.click();
        scenarioAnhor.setValue(anchor);
        listScenarioProcces.click();
        WebElement element = searchForName(workflowNamesList, workflow);
        if (element != null) {
            $x("//app-select-box/ul/li[normalize-space(text())='" + element.getText() + "']").click();
        } else {
            System.out.println("Процеса нет");
        }
        scenarioDescription.setValue(descr);
        btnSaveScenario.click();
        popUpScenarioEdit.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpScenario.click();
    }

    private void deleteProcess(String element) {
        if (element != null) {
            $x("//a[contains(text(), '" + element + "')]/../../td[9]/app-icon").click();
        } else {
            System.out.println("Сценария нет!");
        }
        btnDeleteScenario.click();
        btnApproveDeleteScenario.click();
        popUpScenarioDelete.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpScenario.click();
    }

    public void checkFilter(String filterNamePlaceHolder, ElementsCollection filterCollection, ElementsCollection collectionTable, String scenarioName) {
        checkScanerioTabIsOpen();
        $x("//app-select-box/label[normalize-space(text())='" + filterNamePlaceHolder + ": ']/following-sibling::app-icon").click();
        if (filterCollection.size() == 1) {
            createScenario(scenarioName);
        }
        Selenide.refresh();
        String nameElement = findRandomElement(filterNamePlaceHolder, filterCollection);
        List<WebElement> col = new ArrayList<>();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < collectionTable.size(); i++) {
            if (collectionTable.get(i).getText().equals(nameElement)) {
                col.add(collectionTable.get(i));
            }
        }
        if (col.size() != collectionTable.size()) {
            System.out.println("Фильтр не работает");
        } else {
            System.out.println("Фильтр отработал корректно");
        }
    }

    private String findRandomElement(String filterNamePlaceHolder, ElementsCollection collection) {
        $x("//app-select-box/label[normalize-space(text())='" + filterNamePlaceHolder + ": ']/following-sibling::app-icon").click();
        Random random = new Random();
        int randomIndex = 1 + random.nextInt(collection.size() - 1); //левая граница включительно, правая не включительно
        String filterName = collection.get(randomIndex).getText();
        collection.get(randomIndex).click();
        return filterName;
    }

    private void checkScanerioTabIsOpen() {
        if (!headCheckScanerio.isDisplayed()) {
            clickScenarioTab.click();
            headCheckScanerio.shouldBe(Condition.visible, Duration.ofSeconds(5));
        } else if (headCheckScanerio.isDisplayed()) {
            headCheckScanerio.shouldBe(Condition.visible, Duration.ofSeconds(5));
        }
    }

    private WebElement searchForName(ElementsCollection collection, String name) {
        WebElement element = collection.asFixedIterable().stream()
                //.peek(el -> System.out.println("Text value: " + el.getText()))
                .filter(el -> name.equals(el.getText()))
                .findAny()
                .orElse(null);
        return element;
    }

//    public WebElement searchScenarioForName(ElementsCollection collection, String name) {
//        WebElement element = collection.asFixedIterable().stream()
//                .filter(el -> name.equals(el.getText()))
//                .findAny()
//                .orElse(null);
//        return element;
//    }

}

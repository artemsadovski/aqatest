import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import dev.failsafe.internal.util.Assert;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;


public class DocumentTab {
    private Attribute addAtr = new Attribute();
    private FiltersTab filtersTab = new FiltersTab();
    private final SelenideElement btnAddDocument = $x("//button[contains(text(),'Добавить')]"); //Кнопка добавления документа
    private final SelenideElement headCheckDocument = $x("//h2[normalize-space(text())='Документы']"); // проверка заголовка
    private final SelenideElement clickDocumentTab = $x("//span[text()='Документы']");//перейти на вкладку Сценарии
    private final SelenideElement documentId = $x("//input[@formcontrolname='code']"); //добавление кода документа
    private final SelenideElement documentName = $x("//input[@formcontrolname='name']"); //добавление имени документа
    private final ElementsCollection attributesNamesList = $$x("//app-document-attributes-grid//tr/td[2]"); //атрибут в таблице
    private final SelenideElement filterNameList = $x("//app-search-select-box/app-icon"); //список фильтров
    private final SelenideElement filterFindField = $x("//div[@class='list']/app-text-box/input");  //поле поиска фильтра
    private final SelenideElement selectFilterForDocument = $x("//ul/li[@class='with-tooltip']"); //выбор 1го фильтра из списка для документа
    //1 атрибут
    private final SelenideElement oneAtrAddListDocument = $x("//td[normalize-space(text())='CURRENCY']/preceding-sibling::td/app-icon");// добавить один атрибут
    //Добавление атрибутов в документ
//    private final List<SelenideElement> elements = Arrays.asList(
//            $x("//td[normalize-space(text())='AMOUNT_USD']/preceding-sibling::td/app-icon"),
//            $x("//td[normalize-space(text())='DOC_SOURCE']/preceding-sibling::td/app-icon"),
//            $x("//td[normalize-space(text())='AMOUNT']/preceding-sibling::td/app-icon"),
//            $x("//td[normalize-space(text())='DOC_ID']/preceding-sibling::td/app-icon"),
//            $x("//td[normalize-space(text())='DOC_SUM']/preceding-sibling::td/app-icon"),
//            $x("//td[normalize-space(text())='DOC_TYPE']/preceding-sibling::td/app-icon"),
//            $x("//td[normalize-space(text())='AMOUNT_BYN']/preceding-sibling::td/app-icon"),
//            $x("//td[normalize-space(text())='USER_ID']/preceding-sibling::td/app-icon"),
//            $x("//td[normalize-space(text())='TEST_FIELD']/preceding-sibling::td/app-icon")
//    );

    //private final SelenideElement addDocument = $x("//button[@class='action popup-action']"); //добавление документа
    private final SelenideElement popUpDocumentCreated = $x("//div/label[text()='Документ добавлен']"); // поп-ап создания документа
    //private final SelenideElement btnClosePopUpDocument = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //закрыть поп-ап англ определения
    private final SelenideElement btnClosePopUpDocument = $x("//div/app-icon[text()='close']"); //закрыть поп-ап
    private final ElementsCollection documentNamesList = $$x("//app-documents-grid//tr/td[4]/a"); //документ в таблице (название)
    private final ElementsCollection documentDescriptionListAtr = $$x("//div[@class='scroll-container']/div/span[1]"); //документ в таблице (название)
    private final String btnAttributeAddDocument = "//td[normalize-space(text())='%s']/preceding-sibling::td/app-icon"; //выбор атрибута для документа/или удаление
    private final String btnDescriotion = "//a[contains(text(), '%s')]/../../td[1]"; // открыть описание документа
    private final String btnCrudDocument = "//a[contains(text(), '%s')]/../../td[8]/app-icon"; //кнопка редактировани/удаления документа
    private final SelenideElement btnDeleteDocument = $x("//div/ul/li[text()='Удалить']"); //кнопка удаления
    private final SelenideElement btnApproveDeleteDocument = $x("//footer/button[normalize-space(text())='Да']"); //подтверждение удаления документа
    private final SelenideElement popUpDocumentDelete = $x("//div/label[text()='Документ удален']"); //поп-ап:документ удален
    private final SelenideElement btnEditDocument = $x("//div/ul/li[normalize-space(text())='Редактировать']"); //кнопка удаления документа
    private final ElementsCollection filterListInDocument = $$x("//app-search-select-box[@formcontrolname='filter']/div/ul/li"); //список фильтров для выбора
    private final SelenideElement btnDeleteFilter = $x("//app-search-select-box[@formcontrolname='filter']/following-sibling::span/app-icon"); //кнопка удаления фильтра
    private final ElementsCollection attributesNamesListCreatedDocument = $$x("//section[@class='table']/table//tr/td[2]"); //атрибут в таблице уже созданного документа
    private final SelenideElement btnSaveDocument = $x("//*[text()='Сохранить']"); //Кнопка добавления документа
    private final SelenideElement popUpEditDocument = $x("//div/label[text()='Документ обновлен']"); // поп-ап редактирования документа
    private final SelenideElement filterSecttion = $x("//section/label[text()='Фильтр']"); // секция фильтр


    private final SelenideElement searchDocName = $x("//input[@class='no-inner-label']"); //поиск по названию документа
    private final SelenideElement searchDocAtr = $x("//app-text-box[@formcontrolname='attribute']/input"); //поиск по названию атрибута
    private final SelenideElement documentDescription1 = $x("//td[normalize-space(text())='doc_test+FL_TEST_AQA']/preceding-sibling::td[@class='show-more']/app-icon"); //просмотр описания документа
    private final SelenideElement workToDocument = $x("//td/a[text()='doc_test_name']/../following-sibling::td/app-icon"); //выбор списка с действиями для документа
    private final SelenideElement workToDocumentEdit = $x("//td/a[text()='doc_test']/../following-sibling::td/app-icon"); //выбор списка с действиями для документа
    private final SelenideElement selectDeleteDocument = $x("//td/a[text()='doc_test_name']/../following-sibling::td/div/ul/li[text()='Удалить']"); //удаление документа
    private final SelenideElement selectDocument = $x("//td/a[text()='doc_test_name']"); //переход в документ
    private final SelenideElement deleteListAtrForDocument = $x("//tr/td[normalize-space(text())='TEST_FIELD']/preceding-sibling::td/app-icon"); //убрать атрибут из документа
    private final SelenideElement workToAtr = $x("//td[normalize-space(text())='TEST_FIELD']/following-sibling::td/app-icon"); //выбор списка с действиями для атрибута
    private final SelenideElement selectDeleteAtr = $x("//td[normalize-space(text())='TEST_FIELD']/following-sibling::td/div/ul/li[text()='Удалить']"); //подтверждение удаления
    private final SelenideElement backListDocument = $x("//nav/button[text()='Назад к списку документов']"); //вернуться к списку докуметов
    private final SelenideElement approveSelectDeleteAtrDoc = $x("//footer/button[text()='Да']"); // подтвеждение удаления
    private final SelenideElement selectEditDocument = $x("//td/a[text()='doc_test']/../following-sibling::td/div/ul/li[text()='Редактировать']"); //редактирование документа
    private final SelenideElement selectEditAtr = $x("//td[normalize-space(text())='TEST_FIELD']/following-sibling::td/div/ul/li[text()='Редактировать']"); //редактирование атрибута
    private final SelenideElement popAppDelAtr = $x("//label[text()='Атрибут удален']"); //поп-ап удаления атрибута
    private final SelenideElement popApDelDoc = $x("//label[text()='Документ удален']"); //поп-ап удаления документа
    private final SelenideElement closePopApDel = $x("//div[@class='error']/following::div/app-icon[text()='close']"); //закрыть поп-ап удаления

    @Step("Создание документа")
    public void createDocument(String id, String name, String filterName) {
        try {
            checkDocumentTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка документы не найдена (стоит не тот контур или нет прав)");
            return;
        }
        btnAddDocument.click();
        documentId.setValue(id);
        documentName.setValue(name);
        if (filterSecttion.isDisplayed()) {
            filterNameList.click();
            WebElement elementFilter = searchForName(filterListInDocument, filterName);
            if (elementFilter != null) {
                filterFindField.setValue(filterName);
                selectFilterForDocument.click();
                for (int i = 0; i < Consts.elements.size(); i++) {
                    Consts.elements.get(i);
                    WebElement element = searchForName(attributesNamesList, Consts.elements.get(i));
                    if (element != null) {
                        actions().scrollToElement(element).build().perform(); //прокрутка скролла до нужного элемента (проблемы: иногда не работает,
                                                                              // приходиться писать функцию по передвижению скролла с помощью мыши)
                        $x(String.format(btnAttributeAddDocument, element.getText())).click();
                    } else {
                        addAtr.simpleCreateAttributeProcess(Consts.elements.get(i), Consts.elements.get(i));
                        WebElement createdElement = searchForName(attributesNamesList, Consts.elements.get(i));
                        $x(String.format(btnAttributeAddDocument, createdElement.getText())).click();
                    }
                }
                btnAddDocument.click();
                popUpDocumentCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
                btnClosePopUpDocument.click();
                WebElement element = searchForName(documentNamesList, name);
                if (element != null) {
                    $x(String.format(btnDescriotion, element.getText())).click();
                    for (int i = 0; i < Consts.elements.size(); i++) {
                        WebElement element1 = searchForName(documentDescriptionListAtr, Consts.elements.get(i));
                        Assert.isTrue(element1 != null, "Атрибут " + Consts.elements.get(i) + " отсуствует");
                    }
                    $x(String.format(btnDescriotion, element.getText())).click();
                } else {
                    System.out.println("Документ не создан!");
                }
            } else {
                filtersTab.createFilter(filterName);
                checkDocumentTabIsOpen();
                btnAddDocument.click();
                documentId.setValue(id);
                documentName.setValue(name);
                for (int i = 0; i < Consts.elements.size(); i++) {
                    Consts.elements.get(i);
                    WebElement element = searchForName(attributesNamesList, Consts.elements.get(i));
                    if (element != null) {
                        actions().scrollToElement(element).build().perform();
                        $x(String.format(btnAttributeAddDocument, element.getText())).click();
                    } else {
                        addAtr.simpleCreateAttributeProcess(Consts.elements.get(i), Consts.elements.get(i));
                        WebElement createdElement = searchForName(attributesNamesList, Consts.elements.get(i));
                        $x(String.format(btnAttributeAddDocument, createdElement.getText())).click();

                    }
                }
                filterNameList.click();
                filterFindField.setValue(filterName);
                selectFilterForDocument.click();
                btnAddDocument.click();
                popUpDocumentCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
                btnClosePopUpDocument.click();
                WebElement element = searchForName(documentNamesList, name);
                if (element != null) {
                    $x(String.format(btnDescriotion, element.getText())).click();
                    for (int i = 0; i < Consts.elements.size(); i++) {
                        Consts.elements.get(i);
                        WebElement element1 = searchForName(documentDescriptionListAtr, Consts.elements.get(i));
                        Assert.isTrue(element1 != null, "Атрибут " + Consts.elements.get(i) + " отсуствует");
                    }
                    $x(String.format(btnDescriotion, element.getText())).click();
                } else {
                    System.out.println("Документ не создан!");
                }
            }
        } else {
            btnAddDocument.click();
            popUpDocumentCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
            btnClosePopUpDocument.click();
            WebElement element = searchForName(documentNamesList, name);
            if (element != null) {
                $x(String.format(btnDescriotion, element.getText())).click();
                for (int i = 0; i < Consts.elements.size(); i++) {
                    WebElement element1 = searchForName(documentDescriptionListAtr, Consts.elements.get(i));
                    Assert.isTrue(element1 != null, "Атрибут " + Consts.elements.get(i) + " отсуствует");
                }
                $x(String.format(btnDescriotion, element.getText())).click();
            } else {
                System.out.println("Документ не создан!");
            }
        }
    }
    @Step("Создание документа")
    public boolean createDocument(String name) {
        checkDocumentTabIsOpen();
        btnAddDocument.click();
        documentId.setValue(Consts.documentId);
        documentName.setValue(name);
        if (filterSecttion.isDisplayed()) {
            filterNameList.click();
            WebElement elementFilter = searchForName(filterListInDocument, Consts.filterName);
            if (elementFilter != null) {
                filterFindField.setValue(Consts.filterName);
                selectFilterForDocument.click();
                for (int i = 0; i < Consts.elements.size(); i++) {
                    Consts.elements.get(i);
                    WebElement element = searchForName(attributesNamesList, Consts.elements.get(i));
                    if (element != null) {
                        actions().scrollToElement(element).build().perform();
                        $x(String.format(btnAttributeAddDocument, element.getText())).click();
                    } else {
                        addAtr.simpleCreateAttributeProcess(Consts.elements.get(i), Consts.elements.get(i));
                        WebElement createdElement = searchForName(attributesNamesList, Consts.elements.get(i));
                        $x(String.format(btnAttributeAddDocument, createdElement.getText())).click();
                    }
                }
                btnAddDocument.click();
                popUpDocumentCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
                btnClosePopUpDocument.click();
                WebElement element = searchForName(documentNamesList, name);
                if (element != null) {
                    $x(String.format(btnDescriotion, element.getText())).click();
                    for (int i = 0; i < Consts.elements.size(); i++) {
                        Consts.elements.get(i);
                        WebElement element1 = searchForName(documentDescriptionListAtr, Consts.elements.get(i));
                        Assert.isTrue(element1 != null, "Атрибут " + Consts.elements.get(i) + " отсуствует");
                    }
                    $x(String.format(btnDescriotion, element.getText())).click();
                } else {
                    System.out.println("Документ не создан!");
                }
            } else {
                filtersTab.createFilter(Consts.filterName);
                checkDocumentTabIsOpen();
                btnAddDocument.click();
                documentId.setValue(Consts.documentId);
                documentName.setValue(name);
                for (int i = 0; i < Consts.elements.size(); i++) {
                    Consts.elements.get(i);
                    WebElement element = searchForName(attributesNamesList, Consts.elements.get(i));
                    if (element != null) {
                        $x(String.format(btnAttributeAddDocument, element.getText())).click();
                    } else {
                        addAtr.simpleCreateAttributeProcess(Consts.elements.get(i), Consts.elements.get(i));
                        WebElement createdElement = searchForName(attributesNamesList, Consts.elements.get(i));
                        $x(String.format(btnAttributeAddDocument, createdElement.getText())).click();
                    }
                }
                filterNameList.click();
                filterFindField.setValue(Consts.filterName);
                selectFilterForDocument.click();
                btnAddDocument.click();
                popUpDocumentCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
                btnClosePopUpDocument.click();
                WebElement element = searchForName(documentNamesList, name);
                if (element != null) {
                    $x(String.format(btnDescriotion, element.getText())).click();
                    for (int i = 0; i < Consts.elements.size(); i++) {
                        Consts.elements.get(i);
                        WebElement element1 = searchForName(documentDescriptionListAtr, Consts.elements.get(i));
                        Assert.isTrue(element1 != null, "Атрибут " + Consts.elements.get(i) + " отсуствует");
                    }
                    $x(String.format(btnDescriotion, element.getText())).click();
                } else {
                    System.out.println("Документ не создан!");
                }
            }
        } else {
            btnAddDocument.click();
            popUpDocumentCreated.shouldBe(Condition.visible, Duration.ofSeconds(5));
            btnClosePopUpDocument.click();
            WebElement element = searchForName(documentNamesList, name);
            if (element != null) {
                $x(String.format(btnDescriotion, element.getText())).click();
                for (int i = 0; i < Consts.elements.size(); i++) {
                    Consts.elements.get(i);
                    WebElement element1 = searchForName(documentDescriptionListAtr, Consts.elements.get(i));
                    Assert.isTrue(element1 != null, "Атрибут " + Consts.elements.get(i) + " отсуствует");
                }
                $x(String.format(btnDescriotion, element.getText())).click();
            } else {
                System.out.println("Документ не создан!");
            }
        }
        WebElement element1 = searchForName(documentNamesList, name);
        if (element1 != null) {
            return true;
        } else {
            return false;
        }
    }
    @Step("Редактирование документа")
    public void editDocument(String name) {
        try {
            checkDocumentTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка документ не найдена (стоит не тот контур)");
            return;
        }
        WebElement element = searchForName(documentNamesList, name);
        if (element != null) {
            editProcess(name);
        } else {
            if (createDocument(name)) editProcess(name);
            else System.out.println("Невозможно отредактировать документ");
        }
    }


    private void editProcess(String name) {
        $x(String.format(btnCrudDocument, name)).click();
        btnEditDocument.click();
        documentName.setValue(name);
        if (filterSecttion.isDisplayed()) {
            btnDeleteFilter.click();
            for (int i = 0; i < Consts.elementsEdit.size(); i++) {
                Consts.elementsEdit.get(i);
                WebElement attribute = searchForName(attributesNamesListCreatedDocument, Consts.elementsEdit.get(i));
                if (attribute != null) {
                    $x(String.format(btnAttributeAddDocument, attribute.getText())).click();
                } else {
                    Assert.isTrue(attribute == null, "Атрибут " + Consts.elementsEdit.get(i) + " отсуствует");

                }
            }
            btnSaveDocument.click();
            popUpEditDocument.shouldBe(Condition.visible, Duration.ofSeconds(5));
            btnClosePopUpDocument.click();
            WebElement element = searchForName(documentNamesList, name);
            if (element != null) {
                $x(String.format(btnDescriotion, element.getText())).click();
                for (int i = 0; i < Consts.elementsEdit.size(); i++) {
                    WebElement element1 = searchForName(documentDescriptionListAtr, Consts.elementsEdit.get(i));
                    System.out.println("element1: " + element1);
                    System.out.println("i: " + i);
                    System.out.println("Consts.elementsEdit.get(i): " + Consts.elementsEdit.get(i));
                    Assert.isTrue(element1 == null, "Атрибут " + Consts.elementsEdit.get(i) + " удален");
                }
                $x(String.format(btnDescriotion, element.getText())).click();
            }
        } else {
            for (int i = 0; i < Consts.elementsEdit.size(); i++) {
                Consts.elementsEdit.get(i);
                WebElement attribute = searchForName(attributesNamesListCreatedDocument, Consts.elementsEdit.get(i));
                if (attribute != null) {
                    $x(String.format(btnAttributeAddDocument, attribute.getText())).click();
                } else {
                    Assert.isTrue(attribute != null, "Атрибут " + Consts.elementsEdit.get(i) + " отсуствует");

                }
            }
            btnSaveDocument.click();
            popUpEditDocument.shouldBe(Condition.visible, Duration.ofSeconds(5));
            btnClosePopUpDocument.click();
            WebElement element = searchForName(documentNamesList, name);
            if (element != null) {
                $x(String.format(btnDescriotion, element.getText())).click();
                for (int i = 0; i < Consts.elementsEdit.size(); i++) {
                    WebElement element1 = searchForName(documentDescriptionListAtr, Consts.elementsEdit.get(i));
                    Assert.isTrue(element1 != null, "Атрибут " + Consts.elementsEdit.get(i) + " удален");
                }
                $x(String.format(btnDescriotion, element.getText())).click();
            }
        }
    }
    @Step("Удаление документа")
    public void deleteDocument(String name) {
        try {
            checkDocumentTabIsOpen();
        } catch (ElementNotFound e) {
            System.out.println("Вкладка документы не найдена (стоит не тот контур или нет прав)");
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement element = searchForName(documentNamesList, name);
        if (element != null) {
            deleteProcess(name);
        } else {
            if (createDocument(name)) deleteProcess(name);
            else System.out.println("Невозможно создать документ для его удаления");
        }
    }

    private void deleteProcess(String name) {
        $x(String.format(btnCrudDocument, name)).click();
        btnDeleteDocument.click();
        btnApproveDeleteDocument.click();
        popUpDocumentDelete.shouldBe(Condition.visible, Duration.ofSeconds(5));
        btnClosePopUpDocument.click();
    }

    public WebElement searchForName(ElementsCollection collection, String name) {
        WebElement element = collection.asFixedIterable().stream()
                .filter(el -> name.equals(el.getText().trim()))
                .findAny()
                .orElse(null);
        return element;
    }

    public void checkDocumentTabIsOpen() {
        if (!headCheckDocument.isDisplayed()) {
            clickDocumentTab.click();
            headCheckDocument.shouldBe(Condition.visible, Duration.ofSeconds(5));
        }
    }

//    public DocumentTab addAtrForDoc() {
//        for (SelenideElement element : elements) {
//            element.click();
//        }
//        return this;
//    }
        /*Это цикл for-each (или цикл "расширенного for") в Java, который используется для итерации по коллекциям,
        таким как массивы или списки, без явного использования индексов. В данном случае, elements представляет собой
        коллекцию объектов типа SelenideElement, и цикл выполняет действие click() на каждом элементе коллекции.
        Давайте разберем по шагам, что происходит в данном цикле:
            SelenideElement element - это объявление переменной element, которая будет использоваться в цикле.
            Тип данных SelenideElement указывает на тип объектов, которые содержатся в коллекции elements.

            : elements - это оператор "для каждого" (или "for-each"), который указывает на коллекцию,
            по которой будет производиться итерация, в данном случае, elements.

            {} - это блок кода, который будет выполняться на каждой итерации цикла.
            element.click(); - это вызов метода click() на текущем элементе коллекции.
            Таким образом, на каждой итерации цикла будет вызываться метод click()
            на каждом элементе коллекции elements.*/


}

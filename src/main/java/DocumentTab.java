import com.codeborne.selenide.SelenideElement;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.$x;

public class DocumentTab {
    private final SelenideElement addButtonDocument = $x("//*[text()='Добавить']"); //Кнопка добавления документа
    private final SelenideElement addCodeDocument = $x("//input[@formcontrolname='code']"); //добавление кода документа
    private final SelenideElement addNameDocument = $x("//input[@formcontrolname='name']"); //добавление имени документа
    private final SelenideElement listFiltersForDoc = $x("//app-search-select-box/app-icon"); //список фильтров
    private final SelenideElement findFilterField = $x("//div[@class='list']/app-text-box/input"); //поле поиска фильтра
    private final SelenideElement selectFilterForDoc = $x("//*[@title='FL_TEST_AQA']"); //выбор фильтра для документа

    //Добавление атрибутов в документ

    private final List<SelenideElement> elements = Arrays.asList(
            $x("//td[normalize-space(text())='CURRENCY']/preceding-sibling::td/app-icon"),
            $x("//td[normalize-space(text())='AMOUNT_USD']/preceding-sibling::td/app-icon"),
            $x("//td[normalize-space(text())='DOC_SOURCE']/preceding-sibling::td/app-icon"),
            $x("//td[normalize-space(text())='AMOUNT']/preceding-sibling::td/app-icon"),
            $x("//td[normalize-space(text())='DOC_ID']/preceding-sibling::td/app-icon"),
            $x("//td[normalize-space(text())='DOC_SUM']/preceding-sibling::td/app-icon"),
            $x("//td[normalize-space(text())='DOC_TYPE']/preceding-sibling::td/app-icon"),
            $x("//td[normalize-space(text())='AMOUNT_BYN']/preceding-sibling::td/app-icon"),
            $x("//td[normalize-space(text())='USER_ID']/preceding-sibling::td/app-icon"),
            $x("//td[normalize-space(text())='TEST_FIELD']/preceding-sibling::td/app-icon")
    );

    private final SelenideElement addDocument = $x("//button[@class='action popup-action']"); //добавление документа
    private final SelenideElement closePopApDoc = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //закрыть поп-ап
    private final SelenideElement searchDocName = $x("//input[@class='no-inner-label']"); //поиск по названию документа
    private final SelenideElement searchDocAtr = $x("//app-text-box[@formcontrolname='attribute']/input"); //поиск по названию атрибута
    private final SelenideElement DocumentDescription = $x("//td[normalize-space(text())='doc_test+FL_TEST_AQA']/preceding-sibling::td[@class='show-more']/app-icon"); //просмотр описания документа


    //button[@class='cancel']

    public DocumentTab clickButtonAddDoc(){
        addButtonDocument.click();;
        return this;
    }

    public DocumentTab addDocCode(){
        addCodeDocument.setValue("doc_test");
        return this;
    }

    public DocumentTab addDocName(){
        addNameDocument.setValue("doc_test_name");
        return this;
    }

    public DocumentTab clickListFiltersForDoc(){
        listFiltersForDoc.click();
        return this;
    }

    public DocumentTab searchFilterForDoc(){
        findFilterField.setValue("FL_TEST_AQA");
        return this;
    }

    public DocumentTab selectFilterForDoc(){
        selectFilterForDoc.click();
        return this;
    }

    public DocumentTab addAtrForDoc(){
        for (SelenideElement element : elements){
        element.click();
        }
        return this;
    }
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

    public DocumentTab addDocument(){
        addDocument.click();
        return this;
    }

    public DocumentTab closePopApDoc(){
        closePopApDoc.click();
        return this;
    }

    public DocumentTab searchDocForName(){
        searchDocName.setValue("doc_test_name");
        return this;
    }

    public DocumentTab searchDocForAtr(){
        searchDocAtr.setValue("TEST_FIELD");
        return this;
    }

    public DocumentTab lookDocDescr(){
        DocumentDescription.click();
        return this;
    }

}

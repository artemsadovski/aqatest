import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
//тест
public class AddAtr {
    private final SelenideElement addAtr = $x("//span[text()='Добавить атрибут']");//кнопка добавления атрибута
    private final SelenideElement addAtrName = $x("//app-text-box[@formcontrolname='attributeName']/input");//поле ввода имени арибута
    private final SelenideElement addAtrDescr = $x("//app-text-box[@formcontrolname='description']/input");//поле ввода описания атрибута
    private final SelenideElement addAtrButton = $x("//footer/button[@type='submit']"); //кнопка добавления атрибута
    private final SelenideElement closePopApAtr = $x("//div[@class='success']/following::div/app-icon[text()='close']"); //поп ап создания атрибута


    public AddAtr addAtrPlus(){
        addAtr.click();
        return this;
    }

    public AddAtr atrName(){
        addAtrName.setValue("TEST_FIELD");
        return this;
    }

    public AddAtr editAtrDescr(){
        addAtrDescr.setValue("Тестовое описание");
        return this;
    }

    public AddAtr addAtrDescr(){
        addAtrDescr.setValue("Тестовое");
        return this;
    }

    public AddAtr addAtrBut(){
        addAtrButton.click();
        return this;
    }

    public AddAtr closePopApAtr(){
        closePopApAtr.click();
        return this;
    }


}

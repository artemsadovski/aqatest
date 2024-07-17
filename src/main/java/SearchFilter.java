import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchFilter {
    private final SelenideElement btnHelp = $x("//div/app-text-box[contains(@placeholder, 'Поиск')]/following-sibling::app-icon[text()='help']");//кнопка подсказка
    private final SelenideElement tulTipInfo = $x("//div[contains(@class,'dropdown')]/span");// подсказка поиск
    public final ElementsCollection nameOfColumn = $$x("//table/thead//th"); //наименование столбцов в таблице
    public final ElementsCollection firstLineInTables = $$x("//tbody/tr[1]/td"); //первая стркоа в таблице
    public final SelenideElement searchField = $x("//div/app-text-box[contains(@placeholder, 'Поиск')]/input"); //поле поиска
    public final ElementsCollection tableList = $$x("//tbody/tr"); //таблица сущностей

    //withdrawalButtons.get(i).$("button") //конструкция для поиска вложенного элемента
    @Step("Проверка фильтра на вкладке")
    public boolean searchFilter() {
        List<Integer> list = numberOfColumn();
        for (int i = 0; i < list.size(); i++) {
            String name;
            try {
                name = firstLineInTables.get(list.get(i)).$("a").getText(); //конструкция для поиска вложенного элемента
            } catch (ElementNotFound e) {
                name = firstLineInTables.get(list.get(i)).getText();
            }
            searchField.setValue(name);
            try { // Добавлено чтоб успела загрузиться отфильтрованная таблица
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int j = 0; j < tableList.size(); j++) {
                try {
                    int a = list.get(i);
                    if (!(tableList.get(j).$$("td").get(a).getText().contains(name))) {
                        return false;
                    }
                } catch (ElementNotFound e) {
                    if (!(tableList.get(j).$$("td").get(list.get(i)).$("a").getText().contains(name))) {
                        return false;
                    }
                }
            }
            searchField.clear();
        }
        return true;
    }

    private List<Integer> numberOfColumn() {
        Configuration.timeout = 100;   //уменьшаем время timeout по умолчанию (ожидание появления элемента)
        List<String> list = checkAvailableAttributes();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nameOfColumn.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                try {
                    String a = list.get(j);
                    String b = nameOfColumn.get(i).$("span").getText().toLowerCase();
                    if (!(b.isEmpty()) && (a.contains(b) || b.contains(a))) {
                        list1.add(i);
                        break;
                    }
                } catch (ElementNotFound e) {

                }
            }
        }
        Configuration.timeout = 4000; //возвращаем к значению по умолчанию в selenide
        return list1;
    }

    private List<String> checkAvailableAttributes() {
        btnHelp.click();
        String info = tulTipInfo.getText().replace(" или ", ",").replace(" и ", ",").replace("Введите", " ");
        List<String> list = Arrays.asList(info.split(","));
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).trim().toLowerCase());
        }
        btnHelp.click();
        return list;
    }
}

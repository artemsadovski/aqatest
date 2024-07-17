import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
public class TasksTab {


    // Загрузка файла из локальной директории
    File file = new File("C:\\Users\\sadouski\\Documents\\IdeaProjects\\test_document1.txt");
    private final SelenideElement selectFindTask = $x ("//td/a[contains(text(),'" + CreateTask.doc_id_auto + "')]"); //Выбор задачи
    private final SelenideElement selectFactorTask = $x ("//td/a[@class='link']");//выбор фактора в задаче
    private final SelenideElement cancelSelectFactorTask = $x ("//footer/button[@class='cancel']");//отмена выбора фактора
    private final SelenideElement selectVarTask = $x ("//app-program/div/a[text()='var_test']");//выбор переменной в задаче
    private final SelenideElement canselSelectVarTask = $x ("//footer/button[@class='cancel']");//отмена выбора переменной в задаче
    private final SelenideElement listAssign = $x ("//app-icon[@class='assign']");//спискок исполнителей
    private final SelenideElement assignArt = $x ("//div/ul/li[text()=' art sad (artsiom)']");//выбор исполнителя
    private final SelenideElement startWorkTask1 = $x ("//button/span[text()='Начать работу']");//старт задачи
    private final SelenideElement checkButtonGreen = $x ("//nav/app-icon[normalize-space(text())='check']");//копка не сработки фактора
    private final SelenideElement checkButtonRed = $x ("//nav/app-icon[normalize-space(text())='priority_high']");//копка сработки фактора
    private final SelenideElement stopWorkTask = $x ("//button/span[text()='Приостановить']");//приостановить работу
    private final SelenideElement startWorkTask2 = $x ("//button/span[text()='Начать работу']");//начать работу
    private final SelenideElement commentTaskButton = $x ("//app-task-comment/button/span[text()='Добавить комментарий, файл']");//кнопка добавить комментарий
    private final SelenideElement fileInput = $x("//app-multi-file-box/input[@type='file']");//добавить файл
    private final SelenideElement commentTask = $x("//app-text-area/textarea");//добавить комментарий
    private final SelenideElement commentTaskAdd = $x("//button[text()='Добавить']");//добавить файлы и комментарий
    private final SelenideElement finishTaskButton = $x("//button[@class='confirm']");//завершение задачи
    private final SelenideElement comRezolution = $x("//app-text-area/textarea");//поле комментарий к резолюци
    private final SelenideElement rezActivate = $x("//div/input[@value='activate']");//активировать пользователя
    private final SelenideElement rezActivateDone = $x("//footer/button[text()='Завершить']");//завершение
    private final SelenideElement rezActivateDoneApprove = $x("//footer/button[text()='Активировать пользователя']");//подтверждение завершения
    private final SelenideElement backListTasks = $x("//div/span[text()='Назад к списку задач']");//к списку заадч
    private final SelenideElement headTasks = $x("//h2[normalize-space(text())='Список задач']"); // проверка заголовка


    public TasksTab clickFindTask(){
        selectFindTask.click();
        return this;
    }

    public TasksTab clickSelectFactorTask(){
        selectFactorTask.click();
        return this;
    }

    public TasksTab clickCancelSelectFactorTask(){
        cancelSelectFactorTask.click();
        return this;
    }

    public TasksTab clickSelectVarTask(){
        selectVarTask.click();
        return this;
    }

    public TasksTab clickCanselSelectVarTask(){
        canselSelectVarTask.click();
        return this;
    }

    public TasksTab clickListAssign(){
        listAssign.click();
        return this;
    }

    public TasksTab clickAssignArt(){
        assignArt.click();;
        return this;
    }

    public TasksTab clickStartWorkTask1(){
        startWorkTask1.click();
        return this;
    }

    public TasksTab clickCheckButtonGreen(){
        checkButtonGreen.click();
        return this;
    }

    public TasksTab clickCheckButtonRed(){
        checkButtonRed.click();
        return this;
    }

    public TasksTab clickStopWorkTask(){
        stopWorkTask.click();
        return this;
    }

    public TasksTab clickStartWorkTask2(){
        startWorkTask2.click();
        return this;
    }

    public TasksTab clickCommentTaskButton(){
        commentTaskButton.click();
        return this;
    }

    public TasksTab inputFile(){
        fileInput.uploadFile(file);
        return this;
    }

    public TasksTab inputCommentTask(){
        commentTask.setValue("bla bla bla bls bls");
        return this;
    }

    public TasksTab clickCommentTaskAdd(){
        commentTaskAdd.click();
        return this;
    }

    public TasksTab clickFinishTaskButton(){
        finishTaskButton.click();
        return this;
    }

    public TasksTab inputComRezolution(){
        comRezolution.setValue("bla bla bla");
        return this;
    }

    public TasksTab clickRezActivate(){
        rezActivate.click();
        return this;
    }

    public TasksTab clickRezActivateDone(){
        rezActivateDone.click();
        return this;
    }

    public TasksTab clickRezActivateDoneApprove(){
        rezActivateDoneApprove.click();
        return this;
    }

    public TasksTab clickBackListTasks(){
        backListTasks.click();
        return this;
    }
    public TasksTab checkHeadTasks() {
        headTasks.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }


}

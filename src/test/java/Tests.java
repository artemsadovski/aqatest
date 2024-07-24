import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
//import io.qameta.allure.Story;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.devtools.v85.memory.model.PressureLevel.CRITICAL;

@Epic("Regression Test")
@Feature("UI Test smoke")

public class Tests {
    private Header header = new Header();
    private FiltersTab filtersTab = new FiltersTab();
    private NotTls notTls = new NotTls();
    private LogInPage logInForm = new LogInPage();
    private ScenarioTab riskProfileTab = new ScenarioTab();
    private DocumentTab documentTab = new DocumentTab();
    private Attribute addAtr = new Attribute();
    private VariableTab variableTab = new VariableTab();
    private FactorTab factorTab = new FactorTab();
    private RullsTab rullsTab = new RullsTab();
    private TasksTab tasksTab = new TasksTab();
    private SearchFilter searchFilter = new SearchFilter();


    @BeforeSuite
    @Story("Авторизация")
    @Description("Проверка корректного ввода логина и пароля")
    public void loginTest() {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true; //оставить браузер открытым
        Configuration.headless = true; //тесты не открывая браузер
        //System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        logInForm
                .login(Consts.name, Consts.pass);
    }


    @Test(description = "Удаление фильтра")
    @Severity(SeverityLevel.NORMAL)
    @Story("Удаление фильтра тест")
    @Description("Проверка удаления фильтра")
    public void testFilterDelete() {
        filtersTab
                .deleteFilter(Consts.filterName);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Редактирование фильтра")
    @Description("Проверка редактирования фильтра")
    public void testFilterEdit() {
        filtersTab
                .editFilter(Consts.filterName, Consts.filterEditDescr, Consts.filterEditCond);
    }

//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Создание фильтра")
//    @Description("Проверка создания фильтра")
//    public void testFilterCreate() {
//        filtersTab
//                .createFilter(Consts.filterName, Consts.filterDescr, Consts.filterCond, Consts.filterTestValue);
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Поиск по имени фильтра")
//    @Description("Проверка поиска по имени фильтра")
//    public void testFilter() {
//        filtersTab.createFilter(Consts.filterName, Consts.filterDescr, Consts.filterCond, Consts.filterTestValue); //?
//        if (searchFilter.searchFilter()) {
//            System.out.println("Поиск проверен");
//        } else {
//            System.out.println("Поиск не проверен");
//        }
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Удаление сценария")
//    @Description("Проверка удаления сценария")
//    public void testScenarioDelete() {
//        riskProfileTab.deleteScenario(Consts.scenarioName);
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Редактирование сценария")
//    @Description("Проверка редактирвания сценария")
//    public void testScenarioEdit() {
//        riskProfileTab
//                .editScenario(Consts.scenarioName, Consts.scenarioAnhorEdit, Consts.scenarioWorkflowEdit, Consts.scenarioDescrEdit);
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Создание сценария")
//    @Description("Проверка создания сценария")
//    public void testScenarioCreate() {
//        riskProfileTab
//                .createScenario(Consts.scenarioName, Consts.scenarioAnhor, Consts.scenarioWorkflow, Consts.scenarioDescr);
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Поиск по имени сценария")
//    @Description("Проверка поиска по имени сценария")
//    public void testScenarioFilterScanario() {
//        if (searchFilter.searchFilter()) {
//            System.out.println("Поиск проверен");
//        } else {
//            System.out.println("Поиск не проверен");
//        }
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Создание атрибута")
//    @Description("Проверка создания атрибута")
//    public void testAttributesCreate() {
//        addAtr
//                .createAttribute(Consts.attributeCode, Consts.attributeName);
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Редактирование атрибута")
//    @Description("Проверка Редактирование атрибута")
//    public void testAttributesEdit() {
//        addAtr
//                .editAttribute(Consts.attributeCode, Consts.attributeNameEdit);
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Удаление атрибута")
//    @Description("Проверка удаления атрибута")
//    public void testAttributesDelete() {
//        addAtr
//                .deleteAttribute(Consts.attributeCode);
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Создание документа")
//    @Description("Проверка создания документа")
//    public void createDocument() {
//        documentTab
//                .createDocument(Consts.documentId, Consts.documentName, Consts.filterName);
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Удаление документа")
//    @Description("Проверка удаления документа")
//    public void deleteDocument() {
//        documentTab
//                .deleteDocument(Consts.documentName);
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Редактирование документа")
//    @Description("Проверка редактирования документа")
//    public void editDocument() {
//        documentTab
//                .editDocument(Consts.documentNameEdit);
//    }
//
//    @Test
//    //@BeforeSuite
//    public void createVar() {
//        Configuration.browser = "chrome";
//        Configuration.holdBrowserOpen = true; //оставить браузер открытым
//        logInForm
//                .login(Consts.name, Consts.pass);
//        variableTab
//                .createVariable(Consts.varName, Consts.documentName, Consts.attributeNameForVar,
//                        Consts.anchorName, Consts.functionName, Consts.periodVariable, Consts.precisionVariable,
//                        Consts.descriptionVariable, Consts.periodNumber);
//
//
//    }
//
//    @Test
//    //@BeforeSuite
//    public void deleteVar() {
//        Configuration.browser = "chrome";
//        Configuration.holdBrowserOpen = true; //оставить браузер открытым
//        logInForm
//                .login(Consts.name, Consts.pass);
//        variableTab
//                .deleteVar(Consts.varName);
//
//    }
//
//    @Test
//    //@BeforeSuite
//    public void editVar() {
//        Configuration.browser = "chrome";
//        Configuration.holdBrowserOpen = true; //оставить браузер открытым
//        logInForm
//                .login(Consts.name, Consts.pass);
//        variableTab
//                .editVar(Consts.varName, "8", "Новое описание");
//    }
//
//    @Test
//    //@BeforeSuite
//    public void createMathFactor() {
//        Configuration.browser = "chrome";
//        Configuration.holdBrowserOpen = true; //оставить браузер открытым
//        logInForm
//                .login(Consts.name, Consts.pass);
//        factorTab
//                .createMathFactor(Consts.factorName, Consts.factorDescr, Consts.factorCond,
//                        Consts.factorTestValue, Consts.varName, "USER_ID");
//
//
//    }
//
//    @Test
//    //@BeforeSuite
//    public void deleteMathFactor() {
//        Configuration.browser = "chrome";
//        Configuration.holdBrowserOpen = true; //оставить браузер открытым
//        logInForm
//                .login(Consts.name, Consts.pass);
//        factorTab
//                .deleteFactor(Consts.factorName);
//
//
//    }


//    @Test(priority = 2)
//    public void createRiskProfile() {
//        header.clickRiskProfile();
//        riskProfileTab
//                .addButtonProfile()
//                .addName()
//                .addAnchor()
//                .dropList()
//                .AfCryptoRiskProfile()
//                .addDescription()
//                .addRiskProfile()
//                .closePopApRisk()
//                .clickWorkToRiskProfile()
//                .clickEditRiskProfile()
//                .editAnchor()
//                .dropList()
//                .afWorkProcces()
//                .editDescription()
//                .clickEditRiskProfileInList()
//                .closePopApRisk()
//                .lookDescrTable();
//
//    }

//    @Test(priority = 3)
//
//    public void createDocument1() {
//        Configuration.browser = "chrome";
//        logInForm
//                .login(Consts.name, Consts.pass);
//        header.clickDoc();
        //documentTab
                //.clickButtonAddDoc();
//        addAtr
//                .addAtrPlus()
//                .atrName()
//                .addAtrDescr()
//                .addAtrBut()
//                .closePopApAtr();
        //documentTab
                //.addDocCode()
                //.addDocName()
                //.clickOneAtrAddListDocument()
                //.addDocument()
                //.closePopApDoc()
                //.clickWorkToDocumentEdit()
                //.clickSelectEditDocument()
                //.clickWorkToAtr()
                //.clickSelectEditAtr();
//        addAtr
//                .editAtrDescr()
//                .addAtrBut()
//                .closePopApAtr();
        //documentTab
//                .editDocName()
//                .clickListFiltersForDoc()
//                //.searchFilterForDoc()
//                //.selectFilterForDoc()
//                //.addAtrForDoc()
//                //.addDocument()
//                .closePopApDoc()
//                .searchDocForName()
//                .searchDocForAtr()
//                .lookDocDescr();

   // }

//    @Test(priority = 4)
//    public void createVariable() {
//        header.clickVar();
//        variableTab
////                .clickButtonVar()
//                .checkHeadVar()
//                .addVarId()
//                .listTypeDocumentOne()
//                .cLickfieldTypeDoc()
//                .selectTypeDoc()
//                .listAtrOne()
//                .clickFieldAtr()
//                .addAtrOne()
//                .clickAddTypeAndAtr()
//                .listTypeDocumentTwo()
//                .cLickfieldTypeDoc()
//                .selectTypeDoc()
//                .listAtrTwo()
//                .clickFieldAtr()
//                .addAtrTwo()
//                .clickListAnchorOne()
//                .addAnchorVarOne()
//                .clickAddAnchor()
//                .clickListAnchorTwo()
//                .addAnchorVarTwo()
//                .listFuncVar()
//                .addFuncVarMin()
//                .addPeriodFuncDay()
//                .addPeriodNumberDay()
//                .clickAddAccuracy()
//                .clickAddDescr()
//                .addVariable()
//                .closePopApVar()
//
//                //редактирование переменной
////                .clickWorkToVar()
//                .clickSelectEditVar()
//                .listTypeDocumentOne()
//                .listAtrOne()
//                .clickFieldAtr()
//                .editAtr()
//                .clickDeleteDocTypeTwo()
//                .clickEditAnchorOne()
//                .clickEditSelectAnchor()
//                .clickDeleteAnchorTwo()
//                .listFuncVar()
//                .addFuncVarSum()
//                //.addPeriodFuncMinut()
//                .addPeriodNumberMinute()
//                .editAddDescr()
//                .addVariable()
//                .clickApproveEditVar()
//                .closePopApVar()
//                .searchVar()
//                .findVarDescr();
//    }

//    @Test(priority = 5)
//    public void createFactor() {
//        header.clickFactor();
//        factorTab
                //.checkHeadFactor()
                //.clickAddFactorTab()
                //.clickSelectMathFactor()
                //.inputAddNameFactor()
                //.inputAddDescrFactor()
//                .inputConditionFactor()
//                .clickAddFactor()
//                .clickClosePopApFactor()
//
//                //редактирование фактора
//
//                .clickWorkToFactor()
//                .clickSelectEditFactor()
//                .editDescrFactor()
//                .editConditionFactor()
//                .clickValidationFactor()
//                .clickWindowTest()
//                .inputFieldTestUser()
//                .inputAddFieldTestVar()
//                .clickCheckFactor()
//                .clickBackToFactor()
//                .clickAddFactor()
//                .clickApproveEditFactor()
//                .clickClosePopApFactor()
//                .clickSearchFieldFactor()
//                .clickFactorDescr();
   // }

//    @Test(priority = 6)
//    public void createRull() {
//        header.clickRull();
//        rullsTab
//                .checkHeadRulls()
//                .clickAddRullTab()
//                .inputAddRullName()
//                .clickListRullRiskProfile()
//                .clickAddRullRiskProfile()
//                .inputAddRullDescr()
//                .clickUnchekedRull()
//                .clickAddRullNoPostCheck()
//                .clickAddRullFactor()
//                .clickAddRull()
//                .clickClosePopApFactor()
//
//                //Редактирование правила
//                .clickWorkToRull()
//                .clickSelectEditRull()
//                .clickListRullRiskProfile()
//                .clickEditRullRiskProfile()
//                .editRullDescr()
//                .clickUnchekedRull()
//                .clickAddRullPostCheck()
//                .clickDeleteFactorFromList()
//                .clickEditRullFactor()
//                .clickSaveAfterEdit()
//                .clickClosePopApFactor()
//                .inputSearchFieldRulls()
//                .clickListRullActive()
//                .clickSelectRullActive()
//                .clickListRullCreated()
//                .clickSelectRullCreated()
//                .clickListRullRiskProfileSearch()
//                .clickSelectRullRiskProfileSearch()
//                .clickRullDescr();
//    }
//
//    @Test(priority = 7)
//    public void createTask() {
//        try {
//            CreateTask.requestToSts();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @Test(priority = 8)
//    public void workTasks() {
//        header.clickTasks();
//        tasksTab
//                .checkHeadTasks()
//                .clickFindTask()
//                .clickSelectFactorTask()
//                .clickCancelSelectFactorTask()
//                .clickSelectVarTask()
//                .clickCanselSelectVarTask()
//                .clickListAssign()
//                .clickAssignArt()
//                .clickStartWorkTask1()
//                .clickCheckButtonGreen()
//                .clickCheckButtonRed()
//                .clickStopWorkTask()
//                .clickStartWorkTask2()
//                .clickCommentTaskButton()
//                .inputFile()
//                .inputCommentTask()
//                .clickCommentTaskAdd()
//                .clickFinishTaskButton()
//                .inputComRezolution()
//                .clickRezActivate()
//                .clickRezActivateDone()
//                .clickRezActivateDoneApprove()
//                .clickBackListTasks();
//    }
//
//    @Test(priority = 9)
//    public void deleteTab() {
//        header.clickRull();
//        rullsTab
//                .clickWorkToRull()
//                .clickSelectDeleteRull()
//                .clickApproveSelectDeleteRull()
//                .clickPopApDelete();
//
//        header.clickFactor();
//        //factorTab
//                //.clickWorkToFactor()
//                //.clickSelectDeleteFactor()
//                //.clickApproveSelectDeleteFactor()
//                //.clickPopApDelete();
//        header.clickVar();
////        variableTab
////                .checkHeadVar()
////                .clickWorkToVar()
////                .clickSelectDeleteVar()
////                .clickApproveSelectDeleteVar();
////                .checkPopApDelete()
////                .checkVar();
//        header.clickDoc();
////        documentTab
////                //.clickWorkToDocument()
////                .clickSelectDeleteDocument()
////                .clickApproveSelectDeleteAtrDoc()
////                .checkPopApDelDoc()
////                .clickClosePopAppDel()
////                .clickButtonAddDoc()
////                .clickWorkToAtr()
////                .clickSelectDeleteAtr()
////                .clickApproveSelectDeleteAtrDoc()
////                .checkPopApDel()
////                .clickClosePopAppDel()
////                .clickBackListDocument();
//        header.clickRiskProfile();
////        riskProfileTab
//////                .clickWorkToRiskProfile()
////                .clickSelectDeleteRiskProfile()
////                .clickApproveSelectDeleteRiskProfile();
//        header.filterTab();
//        //filtersTab
//        //.clickWorkFilter()
//        //.clickSelectDeleteFilter()
//        //.clickApproveSelectDeleteFilter();
//
//
//    }

}

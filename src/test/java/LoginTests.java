import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
//тест
public class LoginTests {
    private Header header = new Header();
    private FiltersTab filtersTab = new FiltersTab();
    private NotTls notTls = new NotTls();
    private LogInForm logInForm = new LogInForm();
    private RiskProfileTab riskProfileTab = new RiskProfileTab();
    private DocumentTab documentTab = new DocumentTab();
    private AddAtr addAtr = new AddAtr();
    private VariableTab variableTab = new VariableTab();
    private FactorTab factorTab = new FactorTab();
    private RullsTab rullsTab = new RullsTab();
    private TasksTab tasksTab = new TasksTab();


    @BeforeSuite
    public void loginTest() {
        open(Consts.baseUIUrl);
        //notTls.clickNoTls1();
        //notTls.clickNoTls2();
        logInForm
                .inputLoginName()
                .inputPassword()
                .clickLoginButton();
    }


    @Test(priority = 1)
    public void createFilter() {
        header.clickFilter();
        filtersTab
                .clickCreateButton()
                .inputFilterName()
                .inputFilterDescription()
                .inputFilterCondition()
                .createFilter()
                .clickWorkFilter()
                .clickSelectEditFilter()
                .editFilterDescription()
                .editFilterCondition()
                .clickValidationButton()
                .clickTestButton()
                .inputFilterConditionTest()
                .checkFilterConditionTest()
                .backFilterCreate()
                .createFilter();

    }

    @Test(priority = 2)
    public void createRiskProfile() {
        header.clickRiskProfile();
        riskProfileTab
                .addButtonProfile()
                .addName()
                .addAnchor()
                .dropList()
                .AfCryptoRiskProfile()
                .addDescription()
                .addRiskProfile()
                .closePopApRisk()
                .clickWorkToRiskProfile()
                .clickEditRiskProfile()
                .editAnchor()
                .dropList()
                .afWorkProcces()
                .editDescription()
                .clickEditRiskProfileInList()
                .closePopApRisk()
                .lookDescrTable();

    }

    @Test(priority = 3)
    public void createDocument() {
        header.clickDoc();
        documentTab
                .clickButtonAddDoc();
        addAtr
                .addAtrPlus()
                .atrName()
                .addAtrDescr()
                .addAtrBut()
                .closePopApAtr();
        documentTab
                .addDocCode()
                .addDocName()
                .clickOneAtrAddListDocument()
                .addDocument()
                .closePopApDoc()
                .clickWorkToDocumentEdit()
                .clickSelectEditDocument()
                .clickWorkToAtr()
                .clickSelectEditAtr();
        addAtr
                .editAtrDescr()
                .addAtrBut()
                .closePopApAtr();
        documentTab
                .editDocName()
                .clickListFiltersForDoc()
                .searchFilterForDoc()
                .selectFilterForDoc()
                .addAtrForDoc()
                .addDocument()
                .closePopApDoc()
                .searchDocForName()
                .searchDocForAtr()
                .lookDocDescr();

    }

    @Test(priority = 4)
    public void createVariable() {
        header.clickVar();
        variableTab
                .clickButtonVar()
                .checkHeadVar()
                .addVarId()
                .listTypeDocumentOne()
                .cLickfieldTypeDoc()
                .selectTypeDoc()
                .listAtrOne()
                .clickFieldAtr()
                .addAtrOne()
                .clickAddTypeAndAtr()
                .listTypeDocumentTwo()
                .cLickfieldTypeDoc()
                .selectTypeDoc()
                .listAtrTwo()
                .clickFieldAtr()
                .addAtrTwo()
                .clickListAnchorOne()
                .addAnchorVarOne()
                .clickAddAnchor()
                .clickListAnchorTwo()
                .addAnchorVarTwo()
                .listFuncVar()
                .addFuncVarMin()
                .addPeriodFuncDay()
                .addPeriodNumberDay()
                .clickAddAccuracy()
                .clickAddDescr()
                .addVariable()
                .closePopApVar()

                //редактирование переменной
                .clickWorkToVar()
                .clickSelectEditVar()
                .listTypeDocumentOne()
                .listAtrOne()
                .clickFieldAtr()
                .editAtr()
                .clickDeleteDocTypeTwo()
                .clickEditAnchorOne()
                .clickEditSelectAnchor()
                .clickDeleteAnchorTwo()
                .listFuncVar()
                .addFuncVarSum()
                .addPeriodFuncMinut()
                .addPeriodNumberMinute()
                .editAddDescr()
                .addVariable()
                .clickApproveEditVar()
                .closePopApVar()
                .searchVar()
                .findVarDescr();
    }

    @Test(priority = 5)
    public void createFactor() {
        header.clickFactor();
        factorTab
                .checkHeadFactor()
                .clickAddFactorTab()
                .clickSelectMathFactor()
                .inputAddNameFactor()
                .inputAddDescrFactor()
                .inputConditionFactor()
                .clickAddFactor()
                .clickClosePopApFactor()

                //редактирование фактора

                .clickWorkToFactor()
                .clickSelectEditFactor()
                .editDescrFactor()
                .editConditionFactor()
                .clickValidationFactor()
                .clickWindowTest()
                .inputFieldTestUser()
                .inputAddFieldTestVar()
                .clickCheckFactor()
                .clickBackToFactor()
                .clickAddFactor()
                .clickApproveEditFactor()
                .clickClosePopApFactor()
                .clickSearchFieldFactor()
                .clickFactorDescr();
    }

    @Test(priority = 6)
    public void createRull() {
        header.clickRull();
        rullsTab
                .checkHeadRulls()
                .clickAddRullTab()
                .inputAddRullName()
                .clickListRullRiskProfile()
                .clickAddRullRiskProfile()
                .inputAddRullDescr()
                .clickUnchekedRull()
                .clickAddRullNoPostCheck()
                .clickAddRullFactor()
                .clickAddRull()
                .clickClosePopApFactor()

                //Редактирование правила
                .clickWorkToRull()
                .clickSelectEditRull()
                .clickListRullRiskProfile()
                .clickEditRullRiskProfile()
                .editRullDescr()
                .clickUnchekedRull()
                .clickAddRullPostCheck()
                .clickDeleteFactorFromList()
                .clickEditRullFactor()
                .clickSaveAfterEdit()
                .clickClosePopApFactor()
                .inputSearchFieldRulls()
                .clickListRullActive()
                .clickSelectRullActive()
                .clickListRullCreated()
                .clickSelectRullCreated()
                .clickListRullRiskProfileSearch()
                .clickSelectRullRiskProfileSearch()
                .clickRullDescr();
    }

    @Test(priority = 7)
    public void createTask() {
        try {
            CreateTask.requestToSts();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test(priority = 8)
    public void workTasks() {
        header.clickTasks();
        tasksTab
                .checkHeadTasks()
                .clickFindTask()
                .clickSelectFactorTask()
                .clickCancelSelectFactorTask()
                .clickSelectVarTask()
                .clickCanselSelectVarTask()
                .clickListAssign()
                .clickAssignArt()
                .clickStartWorkTask1()
                .clickCheckButtonGreen()
                .clickCheckButtonRed()
                .clickStopWorkTask()
                .clickStartWorkTask2()
                .clickCommentTaskButton()
                .inputFile()
                .inputCommentTask()
                .clickCommentTaskAdd()
                .clickFinishTaskButton()
                .inputComRezolution()
                .clickRezActivate()
                .clickRezActivateDone()
                .clickRezActivateDoneApprove()
                .clickBackListTasks();
    }

    @Test(priority = 9)
    public void deleteTab() {
        header.clickRull();
        rullsTab
                .clickWorkToRull()
                .clickSelectDeleteRull()
                .clickApproveSelectDeleteRull()
                .clickPopApDelete();

        header.clickFactor();
        factorTab
                .clickWorkToFactor()
                .clickSelectDeleteFactor()
                .clickApproveSelectDeleteFactor()
                .clickPopApDelete();
        header.clickVar();
        variableTab
                .checkHeadVar()
                .clickWorkToVar()
                .clickSelectDeleteVar()
                .clickApproveSelectDeleteVar()
                .checkPopApDelete().
                checkVar();
        header.clickDoc();
        documentTab
                .clickWorkToDocument()
                .clickSelectDeleteDocument()
                .clickApproveSelectDeleteAtrDoc()
                .clickButtonAddDoc()
                .clickWorkToAtr()
                .clickSelectDeleteAtr()
                .clickApproveSelectDeleteAtrDoc()
                .clickBackListDocument();
        header.clickRiskProfile();
        riskProfileTab
                .clickWorkToRiskProfile()
                .clickSelectDeleteRiskProfile()
                .clickApproveSelectDeleteRiskProfile();
        header.clickFilter();
        filtersTab
                .clickWorkFilter()
                .clickSelectDeleteFilter()
                .clickApproveSelectDeleteFilter();


    }

}

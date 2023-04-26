import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    private Header header = new Header();
    private FiltersTab filtersTab = new FiltersTab();
    private NotTls notTls = new NotTls();
    private LogInForm logInForm = new LogInForm();
    private RiskProfileTab riskProfileTab= new RiskProfileTab();
    private DocumentTab documentTab = new DocumentTab();
    private AddAtr addAtr = new AddAtr();
    private  VariableTab variableTab = new VariableTab();
    private  FactorTab factorTab = new FactorTab();
    private  RullsTab rullsTab = new RullsTab();
    private  TasksTab tasksTab = new TasksTab();


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


    @Test (priority = 1)
    public void createFilter() {
        header.clickFilter();
        filtersTab
                .clickCreateButton()
                .inputFilterName()
                .inputFilterDescription()
                .inputFilterCondition()
                .clickValidationButton()
                .clickTestButton()
                .inputFilterConditionTest()
                .checkFilterConditionTest()
                .backFilterCreate()
                .createFilter();
    }

    @Test (priority = 2)
        public void createRiskProfile() {
        header.clickRiskProfile();
        riskProfileTab
                .addButtonProfile()
                .addName()
                .addAnchor()
                .addAnchor()
                .dropList()
                .afWorkProcces()
                .addDescription()
                .addRiskProfile()
                .closePopApRisk()
                .lookDescrTable();

        }

    @Test (priority = 3)
        public void createDocument() {
        header.clickDoc();
        documentTab
                .clickButtonAddDoc();
        addAtr
                .addAtrPlus()
                .atrName()
                .atrDescr()
                .addAtrBut()
                .closePopApAtr();
        documentTab
                .addDocCode()
                .addDocName()
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

    @Test (priority = 4)
    public void createVariable() {
        header.clickVar();
        variableTab
                .clickButtonVar()
                .addVarId()
                .listTypeDocument()
                .cLickfieldTypeDoc()
                .selectTypeDoc()
                .listAtr()
                .clickFieldAtr()
                .addAtr()
                .clickListAnchor()
                .addAnchorVar()
                .listFuncVar()
                .addFuncVar()
                .addPeriodFunc()
                .addPeriodNumber()
                .addVariable()
                .closePopApVar()
                .searchVar()
                .findVarDescr();
    }

    @Test (priority = 5)
    public void createFactor() {
        header.clickFactor();
        factorTab
                .clickAddFactorTab()
                .clickSelectMathFactor()
                .inputAddNameFactor()
                .inputAddDescrFactor()
                .inputAddConditionFactor()
                .clickValidationFactor()
                .clickWindowTest()
                .inputFieldTestUser()
                .inputAddFieldTestVar()
                .clickCheckFactor()
                .clickBackToFactor()
                .clickAddFactor()
                .clickClosePopApFactor()
                .clickSearchFieldFactor()
                .clickFactorDescr();
    }

    @Test (priority = 6)
    public void createRull() {
        header.clickRull();
        rullsTab
                .clickAddRullTab()
                .inputAddRullName()
                .clickListRullRiskProfile()
                .clickAddRullRiskProfile()
                .inputAddRullDescr()
                .clickAddRullPostCheck()
                .clickaddRullFactor()
                .clickAddRull()
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

    @Test (priority = 7)
    public void createTask() {
        try {
            CreateTask.requestToSts();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test (priority = 8)
    public void workTasks() {
        header.clickTasks();
        tasksTab
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

    }

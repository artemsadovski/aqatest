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

    }

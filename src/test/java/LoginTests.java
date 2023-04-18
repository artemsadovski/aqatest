import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    private Header header = new Header();
    private FiltersTab filtersTab = new FiltersTab();
    private NotTls notTls = new NotTls();
    private LogInForm logInForm = new LogInForm();
    private RiskProfileTab riskProfileTab= new RiskProfileTab();


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


    @Test
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
                .createFilter()
                .closePopApFilter()
                .descriptionTable();
    }

    @Test
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
    }

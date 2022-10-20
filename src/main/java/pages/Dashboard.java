package pages;

public class Dashboard {

    @FindBy(id="welcome")
    public WebElement welcomeMessage;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployeeButton;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;


    public DashboardPage{
        PageFactory.initElements(driver,this);
    }

}

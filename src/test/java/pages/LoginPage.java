package pages;

public class LoginPage {

    @FindBy (id="txtUsername")
    public WebElement usernameTextField;

    @FindBy (id="txtPassword")
    public WebElement passwordTextField;

    @FindBy (id="btnLogin")
    public WebElement loginButton;

    @FindBy (id = "spanMessage")
    public WebElement errorMessage;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }


}

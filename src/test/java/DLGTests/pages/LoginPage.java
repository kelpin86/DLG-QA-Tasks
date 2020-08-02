package DLGTests.pages;

import DLGTests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "loginUsername")
    public WebElement username;

    @FindBy (name = "loginPassword")
    public WebElement password;

    @FindBy (xpath = "//button[contains(text(),'Login')]")
    public WebElement login;

    @FindBy (xpath = "//div[@class='form-field__error']")
    public WebElement error;

    @FindBy (xpath = "//div[@class='logged-in__success']")
    public WebElement successful;

}

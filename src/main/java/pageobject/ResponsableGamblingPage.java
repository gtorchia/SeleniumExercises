package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResponsableGamblingPage extends HomePage {

    @FindBy(id="footer-root")
    public WebElement responsableGambling;

    public boolean checkresponsableGambling(){
        return responsableGambling.isDisplayed();
    }

    public ResponsableGamblingPage(WebDriver driver) {
        super(driver);
    }


}

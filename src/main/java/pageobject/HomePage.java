package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


public class HomePage {

    /**
     * Home page
     */

    @FindBy(xpath = "//*[@id=\"productSelected\"]/a" )
    public WebElement sportTab;


    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);

         /** wait = new WebDriverWait(driver, 5);
         wait.until(elementToBeClickable(sportTab));
         */
    }





    public String getSportTabText() {
        return sportTab.getText();
    }


}


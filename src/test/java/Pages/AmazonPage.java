package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "(//h1)[1]")
    public WebElement result;

    @FindBy(xpath = "(//div[@class='aok-relative'])[2]")
    public WebElement urun2;

}

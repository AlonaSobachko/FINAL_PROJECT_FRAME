package home_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#masthead > div > div > div.col.col-lg-2.col-md-2.col-xs-2.col-sm-2 > div")
    public WebElement logo;

    @FindBy(css = "#menu-main-navigation-1")
    public WebElement mainMenu;

    @FindBy(css = "#cart-modal > svg")
    public WebElement cartButton;

    @FindBy(css = "#page > footer > div > div.footer__info > div.footer__block > div.footer__social")
    public WebElement socialLinks;

    @FindBy(css = "#masthead > div > div > div:nth-child(1) > div > div:nth-child(3) > a")
    public WebElement chatButton;

}

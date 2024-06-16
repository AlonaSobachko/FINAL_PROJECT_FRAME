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

    @FindBy(css = "#menu-main-navigation-1 > li.menu-item.menu-item-type-taxonomy." +
            "menu-item-object-product_cat.menu-item-77976")
    public WebElement category;

    @FindBy(css = "#primary > section.archive-banner.lazyloaded > div")
    public WebElement productCategory;;

    @FindBy(css = "#cart-modal > svg")
    public WebElement cartButton;

    @FindBy(css = "#cart-modal-canvas > div > div > h5")
    public WebElement cart;

    @FindBy(css = "#page > footer > div > div.footer__info > div.footer__block > div.footer__social")
    public WebElement socialLinks;

    @FindBy(css = "#account-modal")
    public WebElement personaAccountButton;

    @FindBy(css = "#account-modal-canvas > div > div > div.xoo-el-section.xoo-el-active > div > form > h5")
    public WebElement login;

}

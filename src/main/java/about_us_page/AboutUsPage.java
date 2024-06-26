package about_us_page;

import home_page.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends PageObject {
    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#primary > section.banner.lazyloaded > div > h2")
    public WebElement aboutUsTitle;

    @FindBy(css = "#primary > section.owner")
    public WebElement aboutUsContent;

    @FindBy(xpath = "//*[@id=\"primary\"]/section[6]/div/div[2]/div/a")
    public WebElement viewLocationButton;

    @FindBy(css = "#primary > section:nth-child(7) > div > div.about-content__wrapper > div > a")
    public WebElement goToStoreButton;

    @FindBy(css = "#primary > section:nth-child(8) > div > div.about-content__wrapper > div > a")
    public WebElement orderConsultationButton;

}
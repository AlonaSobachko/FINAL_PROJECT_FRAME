package product_page;

import home_page.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#product-24278 > section.section-product-all-info > div > div.row > div:nth-child(1) > " +
            "div.product-gallery")
    public WebElement productImage;

    @FindBy(css = "#product-24278 > section.section-product-all-info > div > div.row > div:nth-child(2) > div > h1")
    public WebElement productTitle;

    @FindBy(css = "#product-24278 > section.section-product-all-info > div > div.row > div:nth-child(2) > " +
            "div > div.price-and-rating > p")
    public WebElement productPrice;

    @FindBy(css = "#product-24278 > section.section-product-all-info > div > div.row > div:nth-child(2) " +
            "> div > form > div.cart__submit-and-relike > button")
    public WebElement addToCartButton;

    @FindBy(css = "#product-24278 > section.section-product-all-info > div > div.woocommerce-notices-wrapper > " +
            "div > div > div > div > div")
    public WebElement successMessage;

    @FindBy(css = "#product-24278 > section.section-product-all-info > div > div.row > div:nth-child(2) > div > form > div.cart__submit-and-relike > \n" +
            "    div.woocommerce-tabs > div > div:nth-child(1) > div.accordion-title")
    public WebElement descriptionButton;

    @FindBy(css = "#product-24278 > section.section-product-all-info > div > div.row > div:nth-child(2) > div > form > " +
            "div.cart__submit-and-relike > div.woocommerce-tabs > div > div:nth-child(1) > div.accordion-content.accordion" +
            "-content-product-content")
    public WebElement productDescription;
}

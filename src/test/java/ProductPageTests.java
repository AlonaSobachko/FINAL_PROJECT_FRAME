import org.testng.Assert;
import org.testng.annotations.Test;
import product_page.ProductPage;

public class ProductPageTests extends BaseTest {
    @Test
    public void testProductImagePresence() throws InterruptedException {
        driver.get("https://all-face.com.ua/product/dr-ceuracle-pro-balance-cleansing-oil/");
        ProductPage productPage = new ProductPage(driver);
        Thread.sleep(2000);
        Assert.assertTrue(productPage.productImage.isDisplayed());
    }

    @Test
    public void testProductTitle() throws InterruptedException {
        driver.get("https://all-face.com.ua/product/dr-ceuracle-pro-balance-cleansing-oil/");
        ProductPage productPage = new ProductPage(driver);
        Thread.sleep(2000);
        Assert.assertTrue(productPage.productTitle.isDisplayed());
    }

    @Test
    public void testProductPrice() {
        driver.get("https://all-face.com.ua/product/dr-ceuracle-pro-balance-cleansing-oil/");
        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.productPrice.isDisplayed());

    }

    @Test
    public void testAddToCartButton() throws InterruptedException {
        driver.get("https://all-face.com.ua/product/dr-ceuracle-pro-balance-cleansing-oil/");
        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.addToCartButton.isDisplayed());
        productPage.addToCartButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(productPage.successMessage.isDisplayed());
    }

    @Test
    public void testProductDescription() throws InterruptedException {
        driver.get("https://all-face.com.ua/product/dr-ceuracle-pro-balance-cleansing-oil/");
        ProductPage productPage = new ProductPage(driver);
        Thread.sleep(2000);
        Assert.assertTrue(productPage.descriptionButton.isDisplayed());
        productPage.descriptionButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(productPage.productDescription.isDisplayed());
    }
}

import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {
    @Test
    public void testLogoPresence() {
        driver.get("https://all-face.com.ua/");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.logo.isDisplayed());
    }

    @Test
    public void testMainMenu() throws InterruptedException {
        driver.get("https://all-face.com.ua/");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.mainMenu.isDisplayed());
        Assert.assertTrue(homePage.category.isDisplayed());
        homePage.category.click();
        Thread.sleep(2000);
        Assert.assertTrue(homePage.productCategory.isDisplayed());
    }

    @Test
    public void testCartButton() throws InterruptedException {
        driver.get("https://all-face.com.ua/");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.cartButton.isDisplayed());
        homePage.cartButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(homePage.cart.isDisplayed());
    }

    @Test
    public void testSocialLinks() throws InterruptedException {
        driver.get("https://all-face.com.ua/");
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        Assert.assertTrue(homePage.socialLinks.isDisplayed());

    }

    @Test
    public void testFavoriteButton() throws InterruptedException {
        driver.get("https://all-face.com.ua/");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.personaAccountButton.isDisplayed());
        homePage.personaAccountButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(homePage.login.isDisplayed());
    }
}
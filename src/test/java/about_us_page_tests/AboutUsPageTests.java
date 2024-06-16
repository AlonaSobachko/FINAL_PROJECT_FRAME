package about_us_page_tests;

import home_page_tests.BaseTest;
import about_us_page.AboutUsPage;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AboutUsPageTests extends BaseTest {
    @Test
    public void testAboutUsTitlePresence() throws InterruptedException {
        driver.get("https://all-face.com.ua/about/");
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        Thread.sleep(2000);
        Assert.assertTrue(aboutUsPage.aboutUsTitle.isDisplayed());
    }

    @Test
    public void testAboutUsContent() {
        driver.get("https://all-face.com.ua/about/");
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        Assert.assertTrue(aboutUsPage.aboutUsContent.isDisplayed());

    }

    @Test
    public void testViewLocationButton() throws InterruptedException {
        driver.get("https://all-face.com.ua/about/");
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement orderConsultationButton = wait.until(ExpectedConditions.elementToBeClickable(aboutUsPage.viewLocationButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orderConsultationButton);
        Thread.sleep(500);
        Assert.assertTrue(orderConsultationButton.isDisplayed());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", orderConsultationButton);
        Assert.assertTrue(driver.getCurrentUrl().contains("maps/place/"));
    }

    @Test
    public void testGoToStoreButton() throws InterruptedException {
        driver.get("https://all-face.com.ua/about/");
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement orderConsultationButton = wait.until(ExpectedConditions.elementToBeClickable(aboutUsPage.goToStoreButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orderConsultationButton);
        Thread.sleep(500);
        Assert.assertTrue(orderConsultationButton.isDisplayed());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", orderConsultationButton);
        Assert.assertTrue(driver.getCurrentUrl().contains("shop"));
    }

    @Test
    public void testOrderConsultationButton() throws InterruptedException {
        driver.get("https://all-face.com.ua/about/");
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement orderConsultationButton = wait.until(ExpectedConditions.elementToBeClickable(aboutUsPage.orderConsultationButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orderConsultationButton);
        Thread.sleep(500);
        Assert.assertTrue(orderConsultationButton.isDisplayed());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", orderConsultationButton);
        Assert.assertTrue(driver.getCurrentUrl().contains("consulting"));
    }
}

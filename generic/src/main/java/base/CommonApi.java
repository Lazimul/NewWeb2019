package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonApi {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url);

    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

    public void typeoncname(String locator, String value) {
        driver.findElement(By.className(locator)).sendKeys(value);
    }

    public void typeonid(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    public void typeonElement(String locator, String value) {
        try {
            driver.findElement(By.className(locator)).sendKeys(value);
        } catch (Exception ex1) {
            try {
                System.out.println("first attempt failed");
                driver.findElement(By.id(locator)).sendKeys(value);
            } catch (Exception ex2) {
                try {
                    System.out.println("second attempt fail");
                    driver.findElement(By.cssSelector(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("third attempt fail");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                }

            }
        }
    }
    public void typeonElementEnter(String locator, String value) {
        try {
            driver.findElement(By.className(locator)).sendKeys(value,Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("first attempt failed");
                driver.findElement(By.id(locator)).sendKeys(value);
            } catch (Exception ex2) {
                try {
                    System.out.println("second attempt fail");
                    driver.findElement(By.cssSelector(locator)).sendKeys(value,Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("third attempt fail");
                    driver.findElement(By.xpath(locator)).sendKeys(value,Keys.ENTER);
                }

            }
        }
    }
    public void clearField(String locator){
            driver.findElement(By.className(locator)).clear();
        }
        public void nagivateto(){
            driver.navigate().back();
        }
    }









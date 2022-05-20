import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTests {


    @Test
    public void test_TC_11_01() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "D:\\Download\\chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement signUp = driver.findElement(
                By.xpath("//body/div[@id = 'wrap']/div[@id = 'header']/h1")
        );

        String actualResult = signUp.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class DataProviderClass {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dataProvider = "dp")
    public void logIn(String user, String pass) throws InterruptedException {
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3);
        driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]")).sendKeys(user);
        Thread.sleep(5);
        driver.findElement(By.xpath("//input[@placeholder=\"Enter EMail\"]")).sendKeys(pass);
        Thread.sleep(5);
        driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]")).clear();
        driver.findElement(By.xpath("//input[@placeholder=\"Enter EMail\"]")).clear();
    }

//    @DataProvider(name="dp",indices = {0,1}) // it will run by using index data
    @DataProvider(name="dp")
    public Object[][] loginData(){

        Object[][] data = {
                {"s1", "p1"},
                {"s2", "p2"},
                {"s3", "p3"},
        };
        return data;
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}

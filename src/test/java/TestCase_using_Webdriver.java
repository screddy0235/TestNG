import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestCase_using_Webdriver {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }

    @Test(priority = 1)
    public void openApp(){
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void login(){
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
    }

    @Test(priority = 3)
    public void logOut(){
        driver.quit();
    }
}

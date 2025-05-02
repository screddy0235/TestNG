import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.time.Duration;

//@Listeners(ListenersClass.class)
public class NewClass_Listeners {
    WebDriver driver;

    @BeforeClass
    public void beforeSuite(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterSuite(){
        System.out.println("AfterClass");
    }

    @Test(priority = 1)
    public void openApp(){
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 2, dependsOnMethods = {"openApp"})
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]")).sendKeys("user");
        Thread.sleep(10);
        driver.findElement(By.xpath("//input[@placeholder=\"Enter EMail\"]")).sendKeys("pass");
    }

    @Test(priority = 3)
    public void logOut(){
        driver.quit();
    }

}

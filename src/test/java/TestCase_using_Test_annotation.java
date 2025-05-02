import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_using_Test_annotation {
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }

    @Test(priority = 1, groups = {"sanity"})
    public void openApp(){
        System.out.println("Open App");
    }
    @Test(priority = 2, groups = {"Regression"})
    public void login(){
        System.out.println("Login App");
    }
    @Test(priority = 3, groups = {"Functional", "Regression", "combined"})
    public void logout(){
        System.out.println("Logout App");
    }

}

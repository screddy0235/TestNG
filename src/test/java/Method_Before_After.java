import org.testng.annotations.*;

public class Method_Before_After {
    @BeforeMethod
    public void login(){
    System.out.println("Login Application");
    }
    @Test(priority = 1, groups = {"sanity"})
    public void search(){
        System.out.println("Search");
    }
    @Test(priority = 2)
    public void advanceSearch(){
        System.out.println("Advance Search");
    }
    @AfterMethod
    public void log0ut(){
        System.out.println("Logout Application");
    }
    @AfterTest
    public void beforeTest(){
        System.out.println("AfterTest");
    }
}

import org.testng.annotations.Test;

public class TestCase_using_Test_annotation {

    @Test(priority = 1)
    public void openApp(){
        System.out.println("Open App");
    }
    @Test(priority = 2)
    public void login(){
        System.out.println("Login App");
    }
    @Test(priority = 3)
    public void logout(){
        System.out.println("Logout App");
    }

}

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {

    @Test(priority = 1)
    public void openApp(){
        Assert.assertTrue(true);
        System.out.println("Open App");
    }
    @Test(priority = 2, dependsOnMethods = {"openApp"})
    public void logIn(){
        Assert.assertTrue(false);
        System.out.println("Login App");
    }

    @Test(priority = 3, dependsOnMethods = {"logIn"})
    public void search(){
        Assert.assertTrue(true);
        System.out.println("Search App");
    }

    @Test(priority = 4, dependsOnMethods = {"logIn"})
    public void advanceSearch(){
        Assert.assertTrue(true);
        System.out.println("Advance App");
    }

    @Test(priority = 5, dependsOnMethods = {"logIn"})
    public void logOut(){
        Assert.assertTrue(true);
        System.out.println("Logout App");
    }


}

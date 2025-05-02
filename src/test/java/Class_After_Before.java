import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class_After_Before {
    @BeforeClass
    public void login(){
        System.out.println("Login");
    }
    @Test
    public void search(){
        System.out.println("search");
    }
    @Test
    public void advanceSearch(){
        System.out.println("AdvanceSearch");
    }
    @Test
    public void doSomething(){
        System.out.println("Do Something");
    }
    @AfterClass
    public void logOut(){
        System.out.println("Login");
    }
}

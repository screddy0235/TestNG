import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
    @Test
    public void testTitle(){
        String exceptedTitle = "Openshop";
        String actTile= "OpenCart";
        if (exceptedTitle.equals(actTile)){
            System.out.println("TestPassed");
            Assert.assertTrue(true);
        }
        else
            System.out.println("TestFail");
        Assert.assertFalse(false);
        Assert.assertEquals(exceptedTitle, actTile);
    }
}

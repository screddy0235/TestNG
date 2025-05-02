import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
//    @Test
    public void hardAssertions(){
        System.out.println("Testing");
        System.out.println("Testing");

        // if this assertion fail rest of the statements fail
        // Hard Assertion
        Assert.assertEquals(1,22);

        System.out.println("Testing1");
        System.out.println("Testing2");

    }

    @Test
    public void softAssertions(){
        System.out.println("Testing");
        System.out.println("Testing");

        // if this assertion fail also rest of the statements will run
        // soft Assertion
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(1,22);

        System.out.println("Testing1");
        System.out.println("Testing2");
        // sa.assertAll(); to know method is passed or not
        sa.assertAll();  // it will run the all the statements but it will pass or fail to methods
    }
}


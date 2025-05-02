import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    public void test(){
        Assert.assertEquals("xys","xys");
        Assert.assertEquals(123,123);
        Assert.assertNotEquals(123,124);
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.fail();  //it will use to fail the method
    }
}

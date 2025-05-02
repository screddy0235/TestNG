import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("OnStart");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("OnTestStart");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("TestSkipped");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("TestSuccess");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("TestFailure");
    }

    public void onFinish(ITestContext context) {
        System.out.println("OnFinish");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }


}

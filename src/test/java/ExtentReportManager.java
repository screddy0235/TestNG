import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter;   // UI of the report
    public ExtentReports extentReports; // Populate common info of the report
    public ExtentTest extentTest;
// above one is use for creating test case entries in the report and update status of the methods

    public void onStart(ITestContext context) {
        // giving the path to create the report
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/ExtentReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report"); // to set Title
        sparkReporter.config().setReportName("Report Name"); // to set Name
        sparkReporter.config().setTheme(Theme.DARK);

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter); // attaching the report

        extentReports.setSystemInfo("Computer name", "Local Host");
        extentReports.setSystemInfo("Env", "Qa");
        extentReports.setSystemInfo("OS", "Windows");
        extentReports.setSystemInfo("Tester Name", "Subbareddy");
    }

    public void onTestSuccess(ITestResult result) {
        extentTest = extentReports.createTest(result.getName()); // create new entry in the report
        extentTest.log(Status.PASS,"Test is Passed" + result.getName()); //update the status
    }

    public void onTestFailure(ITestResult result) {
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.FAIL, "Test Fail" + result.getName()); //update the status
        extentTest.log(Status.FAIL, "Test Fail" + result.getThrowable()); //update the status
    }

    public void onTestSkipped(ITestResult result) {
        extentTest = extentReports.createTest(result.getName());
        extentTest.log(Status.SKIP, "Test Skipped"+ result.getName());
    }

    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

}

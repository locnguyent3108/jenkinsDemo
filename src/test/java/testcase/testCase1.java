package testcase;
import org.testng.annotations.Test;


public class testCase1 {

    @Test
    public void thisIsPassedCase() {
        System.out.println("Passed");
    }

    @Test
    public void thisIsFailedCase() {
        System.out.println("Failed");
    }
}

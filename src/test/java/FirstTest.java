import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class FirstTest extends BaseTest {

    @Test
    public void test1() {
        getDriver().get("https://magento.softwaretestingboard.com");

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://magento.softwaretestingboard.com/");
        Assert.assertEquals(getDriver().getTitle(), "Home Page");
    }
}

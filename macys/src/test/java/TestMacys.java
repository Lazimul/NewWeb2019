import base.CommonApi;
import org.testng.annotations.Test;

public class TestMacys  extends CommonApi {
    @Test
    public void test1() {
        typeonElement("//*[@id=\"globalSearchInputField\"]", "coat");}
}
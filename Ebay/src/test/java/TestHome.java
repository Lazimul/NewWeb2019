import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHome extends CommonApi {
    @Test
    public void  test1(){
        typeonElement("gh-tb", "motoralla phone");
        //driver.findElement(By.className("gh-tb")).sendKeys("motoralla phone");

    }
}

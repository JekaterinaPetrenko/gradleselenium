import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by Master on 28.03.2017..
 */
public class ChromeGradleProject {

    @Test
    public void googleChromeTest() {
//Open and close Google Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Master\\IdeaProjects\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://javaguru.lv");
        driver.close();
        driver.quit();

    }
}

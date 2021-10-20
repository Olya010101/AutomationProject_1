import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class Project1 {

        public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vlada\\Downloads\\Selenium\\Drivers\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php");
            String expectedTitle = "Welcome to Duotify!";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);

            String strUrl = driver.getCurrentUrl();

            System.out.println(strUrl);

            String pageSrc = driver.getPageSource();
            assertTrue(pageSrc.contains("You Might Also Like"));
        }



}

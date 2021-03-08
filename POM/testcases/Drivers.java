package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Drivers {
    public static WebDriver driver;

    @BeforeClass
    public static void setUpDriver() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/"+"src/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // waitBeforeTest();
        driver.getTitle();


    }

    @AfterClass
    public  void tearDown(){
        driver.quit();
    }


}

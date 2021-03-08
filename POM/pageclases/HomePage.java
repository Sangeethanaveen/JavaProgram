package pageclases;

import testcases.Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/*
This class will list over all the locators & methods of Homepage
 */
public class HomePage extends Drivers {
    By login = By.linkText("Login");
    By searchKeyword = By.id("keywords");
    By searchButton = By.xpath("//input[@value='Search']");
    By bagLink = By.linkText("Bags");
    By priceFilter = By.xpath("//input[@id='Price_Range_$15.00_-_$18.00']");
    By searchFilter = By.cssSelector(".btn.btn-primary");
    By priceProperty = By.xpath("//span[@itemprop='price']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }

    public void searchKeyword(String name) {
        driver.findElement(searchKeyword).clear();
        driver.findElement(searchKeyword).sendKeys(name);
        driver.findElement(searchButton).click();
    }

    public void verifyKeyword(String name) {
        List<WebElement> titleName = driver.findElements(By.xpath("//span[contains(text(),'" + name + "')]"));
        int size = titleName.size();
        for (int i = 0; i < titleName.size(); i++) {
            String title = titleName.get(i).getText();
            //System.out.println(title);
            boolean check = title.contains(name);
            Assert.assertTrue(check);
        }
        Assert.assertNotNull(titleName);
    }

    public void filterSearch() {
        driver.findElement(bagLink).click();
        driver.findElement(priceFilter).click();
        driver.findElement(searchFilter).click();

    }

    public void checkSearch() {
        Boolean checkbox = driver.findElement(priceFilter).isSelected();
        Assert.assertTrue(checkbox);
        List<WebElement> priceValue = driver.findElements(priceProperty);
        //int size = priceValue.size();
        for (int i = 0; i < priceValue.size(); i++) {
            String price = priceValue.get(i).getText();
            String value = price.substring(1);
            double priceText = Double.parseDouble(value);
            Assert.assertTrue((priceText > 15.00) && (priceText < 18.00));
        }
    }


}


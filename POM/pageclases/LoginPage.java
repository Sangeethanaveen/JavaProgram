package pageclases;

import org.openqa.selenium.WebDriver;
import testcases.Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends Drivers {
    By username = By.id("spree_user_email");
    By password = By.cssSelector("#spree_user_password");
    By loginButton = By.xpath("//input[@value='Login']");
    By signOutAlert = By.xpath("//div[@class='alert alert-notice']");
    By successMessage = By.xpath("//div[@id='content']/div");
    By logout = By.linkText("Logout");
    By selectProduct = By.xpath("//span[@title='Ruby on Rails Mug']");
    By addToCart = By.cssSelector("button[id='add-to-cart-button']");
    By cartAmount = By.xpath("//span[@class='amount']");
    By deleteItem = By.xpath("//span[@class='glyphicon glyphicon-minus-sign']");
    By emptyAlert = By.xpath("//div[@class='alert alert-info']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logInSpree(String name, String pWord) {
        driver.findElement(username).sendKeys(name);
        driver.findElement(password).sendKeys(pWord);
        driver.findElement(loginButton).click();


    }

    public void verifyLogIn() {
        String success = driver.findElement(successMessage).getText();
        Assert.assertEquals(success, "Logged in successfully");
    }

    public void logOutSpree() {
        driver.findElement(logout).click();


    }

    public void verifyLogout() {
        String logOut = driver.findElement(signOutAlert).getText();
        Assert.assertEquals(logOut, "Signed out successfully.");
    }

    public void addToCart() {
        driver.findElement(selectProduct).click();
        driver.findElement(addToCart).click();

    }

    public void verifyAddToCart() {
        String amount = driver.findElement(cartAmount).getText();
        Assert.assertNotNull(amount);
    }

    public void deleteProductInCart() {
        driver.findElement(deleteItem).click();

    }
    public void verifyDeleteProduct(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-info']")));
        String delete = driver.findElement(emptyAlert).getText();
        // System.out.println(delete);
        Assert.assertEquals("Your cart is empty", delete);

    }
}
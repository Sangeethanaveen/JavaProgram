package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageclases.HomePage;
import pageclases.LoginPage;
import org.testng.annotations.Test;

public class TestLoginFunctionality extends Drivers {

    //instantiating login & profile page

    LoginPage login = new LoginPage(driver);
    HomePage home = new HomePage(driver);


    @Test()
    public void loginFunctionality() {

        home.clickLogin();
        login.logInSpree("sangeethanaveen@gmail.com", "123456");
        login.verifyLogIn();
        login.logOutSpree();
        login.verifyLogout();
    }

    @Test()
    public void searchProduct() {
        home.searchKeyword("Ruby");
        home.verifyKeyword("Ruby");
        home.searchKeyword("Apache");
        home.verifyKeyword("Apache");

    }
    @Test()
    public void searchByFilter() {
        home.filterSearch();
        home.checkSearch();
    }

    @Test()
    public void addToCart()  {
        home.clickLogin();
        login.logInSpree("sangeethanaveen@gmail.com", "123456");
        login.verifyLogIn();
        home.searchKeyword("Ruby on Rails Mug");
        login.addToCart();
        login.verifyAddToCart();

    }
    @Test()
    public void clearCart(){
        login.deleteProductInCart();
        login.verifyDeleteProduct();
        login.logOutSpree();
    }
}



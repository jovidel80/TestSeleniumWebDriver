package stepDefs;


import com.vpcodingclub.constants.WebDriverTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class TestCases extends WebDriverTest {

    private WebDriver driver;

    public TestCases(BrowserSetUpAndTearDown bst) {
        this.driver = bst.driver;
    }
    
//###########################################################################################

//    @Given("^Navigate to phptravels$")
//    public void navigate_to_google_site() throws Throwable {
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://phptravels.net/");
//        Thread.sleep(2000);
////        assertEquals(driver.findElement(By.xpath("//center/div[3]/div/div")).getText(),"google intro");
//    }
//
//    @Given("^Accesamos a mi cuenta$")
//    public void accesamosAMiCuenta() throws Throwable {
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//a[@href='http://phptravels.net/login']")).click();
//        Thread.sleep(500);
//    }
//
//
//
//    @Given("^ingresamos el nombre de usuario$")
//    public void ingresamosNombreUsuario() throws Throwable {
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user@phptravels.com");
//        Thread.sleep(500);
//    }
//
//    @Given("^ingresamos el password$")
//    public void ingresamosPassword() throws Throwable {
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demouser");
//        Thread.sleep(500);
//    }
//
//    @Given("^presionamos submit$")
//    public void presionamosSubmit() throws Throwable {
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//button[@type='submit']")).submit();
//        Thread.sleep(500);
//    }
//
//    @Given("^validamos que ingresamos a la pagina$")
//    public void validamosQueIngresamos() throws Throwable {
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://phptravels.net/account/");
//        Thread.sleep(2000);
//    }

//    @Given("^Navegate to gamedb2$")
//    public void navigate_to_gamedb2() throws Throwable {
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://gamedb2.herokuapp.com/");
//        Thread.sleep(2000);
////        assertEquals(driver.findElement(By.xpath("//center/div[3]/div/div")).getText(),"google intro");
//    }

    @Given("^Navegate to gamedb2$")
    public void navegate_to_gamedb2() throws Throwable {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://gamedb2.herokuapp.com");
        Thread.sleep(2000);

    }


    @When("^I signup as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_signup_as_and_and(String arg1, String arg2, String arg3) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(@href, '/signup')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(arg1);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(arg2);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arg3);
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(arg3);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

    }

    @Then("^I login as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_login_as_and(String arg1, String arg2) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(@href, '/login')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(arg1);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arg2);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
    }

    @Then("^I create a game as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_create_a_game_as_and_and(String arg1, String arg2, String arg3) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(@href, '/games')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input")).sendKeys(arg1);
        driver.findElement(By.xpath("//td[2]/input")).sendKeys(arg2);
        driver.findElement(By.xpath("//td[3]/input")).sendKeys(arg3);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[4]/button")).click();
        Thread.sleep(6000);
    }

    @Then("^I edit a game as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_edit_a_game_as_and_and(String arg1, String arg2, String arg3) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//td[7]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input")).sendKeys(arg1);
        driver.findElement(By.xpath("//td[4]/input")).sendKeys(arg2);
        driver.findElement(By.xpath("//td[6]/input")).sendKeys(arg3);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[8]/button")).click();
        Thread.sleep(6000);
    }

    @Then("^I delete the game$")
    public void delete_the_game() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(2000);

    }
}
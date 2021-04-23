package pageObjectPattern.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectPattern.pages.*;

import java.util.concurrent.TimeUnit;

public class CreateNewAddress {

    private final String USER = "Ricardo@jourrapide.com";
    private final String PASSWORD = "unbaqpdttwkjuwarav";

    private final String address = "1645 University Street";
    private final String addressComplement = "1645 University Street";
    private final String company = "shawl";
    private final String vatNumber = "111111111";
    private final String phoneNumber = "206-390-1455";
    private final String city = "Seattle";
    private final String postalCode = "WA 98106";

    WebDriver driver;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    HeaderComponent headerComponent;
    NewAddressPage newAddressPage;
    AddressesPage addressesPage;

    @Given("^User is logged in to my store shop$")
    public void userIsLooggedInToMyStoreShop() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        loginPage = new LoginPage(driver);
        headerComponent = new HeaderComponent(driver);
        myAccountPage = new MyAccountPage(driver);
        newAddressPage = new NewAddressPage(driver);
        addressesPage = new AddressesPage(driver);
        loginPage.loginAs(USER,PASSWORD);
    }
    @When("^User goes to UserAddressesPage$")
    public void userGoesToAddressesPage() {
        headerComponent.goToUserInformationView();
        myAccountPage.goToAddressesPage();
    }

    @And("^User create new address$")
    public void userAddNewAddress() {
        addressesPage.createNewAddress();

        newAddressPage.fillUpAddress(address);
        newAddressPage.fillUpAlias();
        newAddressPage.fillUpCity(city);
        newAddressPage.fillUpPostalCode(postalCode);
        newAddressPage.fillUpVatNumber(vatNumber);
        newAddressPage.fillUpAddressComplement(addressComplement);
        newAddressPage.fillUpPhoneNumber(phoneNumber);
        newAddressPage.fillUpCompany(company);
        newAddressPage.clickOnSaveButton();

        addressesPage.isAddressCorrect(company, vatNumber, address, addressComplement, city, postalCode, phoneNumber);
    }

    @And("^User delete last address$")
    public void userDeleteAddress() {
        addressesPage.deleteLastAddress();
        addressesPage.isSuccessInformationIsDisplay();

    }

   @Then("User close window")
    public void userCloseWindow() {
        driver.close();
    }
}

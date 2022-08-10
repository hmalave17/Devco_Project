package stepDefinitios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.DataExcel;
import models.Transaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.WebDriver;
import tasks.FillsCar;
import tasks.SearchCar;
import tasks.SelectCar;
import tasks.SetData;
import utils.Converter;

import static enums.Words.USER;

public class CarRentalSteps {

    @Shared
    DataExcel dataExcel;

    @Shared
    Transaccion car;

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named(USER.getWord());

    @Given("the user selects the rent car option in the menu main")
    public void theUserSelectsTheRentCarOptionInTheMenuMain() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(SetData.user());
        user.attemptsTo(SelectCar.option(Converter.data(dataExcel), herBrowser));
    }

    @When("make the process to rent")
    public void makeTheProcessToRent() {
        user.attemptsTo(SelectCar.option(car,herBrowser));
        user.attemptsTo(SearchCar.user());
        user.attemptsTo(FillsCar.reserve(car));
    }

    @When("user does not fill input data")
    public void userDoesNotFillInputData() {

    }

    @When("doest select the place delivery")
    public void doestSelectThePlaceDelivery() {

    }


    @When("move price filter")
    public void movePriceFilter() {

    }

    @Then("the system show the successful transaction")
    public void theSystemShowTheSuccessfulTransaction() {

    }


    @Then("the system doesnot going to advance")
    public void theSystemDoesnotGoingToAdvance() {

    }


    @Then("the system show others price")
    public void theSystemShowOthersPrice() {

    }


    @Then("the system doesnot allow reservation")
    public void theSystemDoesnotAllowReservation() {
    }
}

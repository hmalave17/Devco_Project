package stepDefinitios;

import execptions.UnexpectedLabel;
import execptions.UnexpectedMessage;
import execptions.UnexpectedPrice;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.MessageAnswer;
import questions.Price;
import tasks.*;
import userInterfaces.BookPage;

import static enums.Label.INTO_DATA;
import static enums.Message.*;
import static enums.Words.LESS;
import static enums.Words.USER;
import static execptions.UnexpectedLabel.LABEL_TEXT_UNEXPECTED;
import static execptions.UnexpectedMessage.UNEXPECTED_MESSAGE;
import static execptions.UnexpectedPrice.PRICE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BookHotelSteps {


    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named(USER.getWord());

    @Given("user select a destiny")
    public void userSelectADestiny() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(Chooses.destiny(herBrowser));
    }

    @When("user select a hotel")
    public void userSelectAHotel() {
        user.attemptsTo(Select.hotel(herBrowser));
    }

    @When("user use the filter price")
    public void userUseTheFilterPrice() {
        user.attemptsTo(ValidateFilterPrice.hotel(herBrowser));
    }

    @When("user does not select the quantity of room")
    public void userDoesNotSelectTheQuantityOfRoom() {
        user.attemptsTo(Select.hotel(herBrowser));
        user.attemptsTo(Room.mandatory(herBrowser));
    }

    @When("user does not enter its data")
    public void userDoesNotEnterItsData() {
        user.attemptsTo(Select.hotel(herBrowser));
        user.attemptsTo(ConfirmAvailability.booking(herBrowser));
        user.attemptsTo(FillWrongData.user(herBrowser,3));
    }

    @When("user does not enter a format valid email")
    public void userDoesNotEnterAFormatValidEmail() {
        user.attemptsTo(Select.hotel(herBrowser));
        user.attemptsTo(ConfirmAvailability.booking(herBrowser));
        user.attemptsTo(FillWrongData.user(herBrowser,1));
    }

    @When("user does enters distinct email")
    public void userDoesEntersDistinctEmail() {
        user.attemptsTo(Select.hotel(herBrowser));
        user.attemptsTo(ConfirmAvailability.booking(herBrowser));
        user.attemptsTo(FillWrongData.user(herBrowser,2));
    }

    @And("user checks availability")
    public void userChecksAvailability() {
        user.attemptsTo(ConfirmAvailability.booking(herBrowser));
    }

    @And("user enter its date")
    public void userEnterItsDate() {
        user.attemptsTo(FillsData.user(herBrowser));
    }

    @Then("user completes its booking")
    public void userCompletesItsBooking() {
        user.should(seeThat(MessageAnswer.is(BookPage.LABEL_INTO_DATA),
                Matchers.equalTo(INTO_DATA.getSentence())).orComplainWith(UnexpectedLabel.class, LABEL_TEXT_UNEXPECTED));
    }

    @Then("the system going to show the filter")
    public void theSystemGoingToShowTheFilter() {
        user.should(seeThat(Price.room(BookPage.AA, BookPage.LABEL_PRICE),
                Matchers.equalTo(LESS.getWord())).orComplainWith(UnexpectedPrice.class, PRICE));
    }

    @Then("the system going to show that select the quantity of room is mandatory")
    public void theSystemGoingToShowThatSelectTheQuantityOfRoomIsMandatory() {
        user.should(seeThat(MessageAnswer.is(BookPage.MESSAGE_ROOM_MANDATORY),
                Matchers.equalTo(ROOM_MANDATORY.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }

    @Then("the system going to show enter its data is mandatory")
    public void theSystemGoingToShowEnterItsDataIsMandatory() {
        user.should(seeThat(MessageAnswer.is(BookPage.MESSAGE_DATA_MANDATORY),
                Matchers.equalTo(DATA_MANDATORY.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }

    @Then("the system going to show invalid email")
    public void theSystemGoingToShowInvalidEmail() {
        user.should(seeThat(MessageAnswer.is(BookPage.LABEL_EMAIL_INVALID),
                Matchers.equalTo(EMAIL_INVALID.getInformative())).orComplainWith(UnexpectedLabel.class, LABEL_TEXT_UNEXPECTED));
    }

    @Then("the system going to show distinct email")
    public void theSystemGoingToShowDistinctEmail() {
        user.should(seeThat(MessageAnswer.is(BookPage.LABEL_EMAIL_DOEST_NOT_MATCHES),
                Matchers.equalTo(EMAIL_DOEST_NOT_MATCHES.getInformative())).orComplainWith(UnexpectedLabel.class, LABEL_TEXT_UNEXPECTED));
    }
}

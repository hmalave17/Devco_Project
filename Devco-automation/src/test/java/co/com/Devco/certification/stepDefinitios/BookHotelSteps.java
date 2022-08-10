package co.com.Devco.certification.stepDefinitios;


import co.com.Devco.certification.execptions.UnexpectedLabel;
import co.com.Devco.certification.execptions.UnexpectedMessage;
import co.com.Devco.certification.execptions.UnexpectedPrice;
import co.com.Devco.certification.models.DataExcel;
import co.com.Devco.certification.questions.MessageAnswer;
import co.com.Devco.certification.questions.Price;
import co.com.Devco.certification.tasks.*;
import co.com.Devco.certification.userInterfaces.DataPage;
import co.com.Devco.certification.userInterfaces.SelectHotelPage;
import co.com.Devco.certification.utils.Converter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.Devco.certification.enums.Label.INTO_DATA;
import static co.com.Devco.certification.enums.Message.*;
import static co.com.Devco.certification.enums.Words.LESS;
import static co.com.Devco.certification.enums.Words.USER;
import static co.com.Devco.certification.execptions.UnexpectedLabel.LABEL_TEXT_UNEXPECTED;
import static co.com.Devco.certification.execptions.UnexpectedMessage.UNEXPECTED_MESSAGE;
import static co.com.Devco.certification.execptions.UnexpectedPrice.PRICE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BookHotelSteps {


    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named(USER.getWord());

    @Shared
    DataExcel dataExcel;

    @Given("user select a destiny")
    public void userSelectADestiny() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(SetData.user());
        user.attemptsTo(Chooses.destiny(herBrowser, Converter.data(dataExcel)));
    }

    @When("user select a hotel")
    public void userSelectAHotel() {
        user.attemptsTo(Select.hotel());
    }

    @When("user use the filter price")
    public void userUseTheFilterPrice() {
        user.attemptsTo(ValidateFilterPrice.hotel());
    }

    @When("user does not select the quantity of room")
    public void userDoesNotSelectTheQuantityOfRoom() {
        user.attemptsTo(Select.hotel());
        user.attemptsTo(Room.mandatory());
    }

    @When("user does not enter its data")
    public void userDoesNotEnterItsData() {
        user.attemptsTo(Select.hotel());
        user.attemptsTo(ConfirmAvailability.booking(herBrowser));
        user.attemptsTo(FillWrongData.user(3));
    }

    @When("user does not enter a format valid email")
    public void userDoesNotEnterAFormatValidEmail() {
        user.attemptsTo(Select.hotel());
        user.attemptsTo(ConfirmAvailability.booking(herBrowser));
        user.attemptsTo(FillWrongData.user(1));
    }

    @When("user does enters distinct email")
    public void userDoesEntersDistinctEmail() {
        user.attemptsTo(Select.hotel());
        user.attemptsTo(ConfirmAvailability.booking(herBrowser));
        user.attemptsTo(FillWrongData.user(2));
    }

    @And("user checks availability")
    public void userChecksAvailability() {
        user.attemptsTo(ConfirmAvailability.booking(herBrowser));
    }

    @And("user enter its date")
    public void userEnterItsDate() {
        user.attemptsTo(FillsData.user());
    }

    @Then("user completes its booking")
    public void userCompletesItsBooking() {
        user.should(seeThat(MessageAnswer.is(DataPage.LABEL_INTO_DATA),
                Matchers.equalTo(INTO_DATA.getSentence())).orComplainWith(UnexpectedLabel.class, LABEL_TEXT_UNEXPECTED));
    }

    @Then("the system going to show the filter")
    public void theSystemGoingToShowTheFilter() {
        user.should(seeThat(Price.room(SelectHotelPage.LABEL_FILTER, SelectHotelPage.LABEL_PRICE),
                Matchers.equalTo(LESS.getWord())).orComplainWith(UnexpectedPrice.class, PRICE));
    }

    @Then("the system going to show that select the quantity of room is mandatory")
    public void theSystemGoingToShowThatSelectTheQuantityOfRoomIsMandatory() {
        user.should(seeThat(MessageAnswer.is(SelectHotelPage.MESSAGE_ROOM_MANDATORY),
                Matchers.equalTo(ROOM_MANDATORY.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }

    @Then("the system going to show enter its data is mandatory")
    public void theSystemGoingToShowEnterItsDataIsMandatory() {
        user.should(seeThat(MessageAnswer.is(DataPage.MESSAGE_DATA_MANDATORY),
                Matchers.equalTo(DATA_MANDATORY.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }

    @Then("the system going to show invalid email")
    public void theSystemGoingToShowInvalidEmail() {
        user.should(seeThat(MessageAnswer.is(DataPage.LABEL_EMAIL_INVALID),
                Matchers.equalTo(EMAIL_INVALID.getInformative())).orComplainWith(UnexpectedLabel.class, LABEL_TEXT_UNEXPECTED));
    }

    @Then("the system going to show distinct email")
    public void theSystemGoingToShowDistinctEmail() {
        user.should(seeThat(MessageAnswer.is(DataPage.LABEL_EMAIL_DOEST_NOT_MATCHES),
                Matchers.equalTo(EMAIL_DOEST_NOT_MATCHES.getInformative())).orComplainWith(UnexpectedLabel.class, LABEL_TEXT_UNEXPECTED));
    }
}

package stepDefinitios;

import execptions.UnexpectedMessage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.DataExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.MessageAnswer;
import tasks.*;
import userInterfaces.HomePage;
import userInterfaces.RegisterPage;
import utils.Converter;

import static enums.Message.*;
import static enums.Words.USER;
import static execptions.UnexpectedMessage.UNEXPECTED_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterSteps {

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named(USER.getWord());

    @Shared
    DataExcel dataExcel;

    @Given("the user selects the register option in the menu main")
    public void theUserSelectsTheRegisterOptionInTheMenuMain() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(SetData.user());
        user.attemptsTo(SelectOption.menu(HomePage.BUTTON_REGISTER));
    }

    @When("A user enters a wrong password")
    public void aUserEntersAWrongPassword() {
        user.attemptsTo(Password.incorrect(Converter.registre(dataExcel)));
    }

    @When("A user enters an invalid format email")
    public void aUserEntersAnInvalidFormatEmail() {
        user.attemptsTo(InvalidEmail.format(Converter.registre(dataExcel)));
    }

    @When("A user enters an invalid format password")
    public void aUserEntersAnInvalidFormatPassword() {
        user.attemptsTo(InvalidPassword.format(Converter.registre(dataExcel)));
    }

    @Then("the system cannot register it")
    public void theSystemCannotRegisterIt() {
        user.should(seeThat(MessageAnswer.is(RegisterPage.MESSAGE_PASSWORD_DOESNOT_MATCH),
                Matchers.equalTo(WRONG_PASSWORD.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }

    @Then("the system going to notify her email invalid")
    public void theSystemGoingToNotifyHerEmailInvalid() {
        user.should(seeThat(MessageAnswer.is(RegisterPage.MESSAGE_EMAIL_INVALID),
                Matchers.equalTo(INVALID_EMAIL.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }

    @Then("the system going to notify her password invalid")
    public void theSystemGoingToNotifyHerPasswordInvalid() {
        user.should(seeThat(MessageAnswer.is(RegisterPage.MESSAGE_PASSWORD_INVALID),
                Matchers.equalTo(INVALID_PASSWORD.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }



}

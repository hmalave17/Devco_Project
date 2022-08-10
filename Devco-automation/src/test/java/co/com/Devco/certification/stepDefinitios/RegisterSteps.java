package co.com.Devco.certification.stepDefinitios;


import co.com.Devco.certification.execptions.UnexpectedMessage;
import co.com.Devco.certification.models.DataExcel;
import co.com.Devco.certification.questions.MessageAnswer;
import co.com.Devco.certification.tasks.*;
import co.com.Devco.certification.userInterfaces.HomePage;
import co.com.Devco.certification.userInterfaces.RegisterPage;
import co.com.Devco.certification.utils.Converter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.Devco.certification.enums.Message.*;
import static co.com.Devco.certification.enums.Words.USER;
import static co.com.Devco.certification.execptions.UnexpectedMessage.UNEXPECTED_MESSAGE;
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

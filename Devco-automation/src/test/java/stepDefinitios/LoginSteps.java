package stepDefinitios;

import execptions.UnexpectedMessage;
import execptions.UnexpectedUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.RegisteredUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.MessageAnswer;
import tasks.Login;
import tasks.SelectOption;
import userInterfaces.HomePage;
import userInterfaces.LoginPage;
import utils.NumberRandom;

import static enums.Message.WRONG_PASSWORD_USER;
import static enums.Words.USER;
import static execptions.UnexpectedMessage.UNEXPECTED_MESSAGE;
import static execptions.UnexpectedUser.NAME_USER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginSteps {

    @Shared
    RegisteredUser registeredUser;

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named(USER.getWord());

    @Given("the user selects the login option in the menu main")
    public void theUserSelectsTheLoginOptionInTheMenuMain() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(SelectOption.menu(HomePage.BUTTON_LOGIN));
    }
    @When("user make login successful")
    public void userMakeLoginSuccessful() {
        user.attemptsTo(Login.user(registeredUser.getEmail(), registeredUser.getPassword()));
    }
    @Then("the user will be able to see your name on the website.")
    public void theUserWillBeAbleToSeeYourNameOnTheWebsite() {
        user.should(seeThat(MessageAnswer.is(HomePage.LABEL_NAME_AVATAR),
                Matchers.equalTo(registeredUser.getName())).orComplainWith(UnexpectedUser.class, NAME_USER));
    }

    @When("A user enters a password incorrect")
    public void aUserEntersAPasswordIncorrect() {
        user.attemptsTo(Login.user(registeredUser.getEmail(), NumberRandom.password()));
    }
    @Then("the system going to notify her password is incorrect")
    public void theSystemGoingToNotifyHerPasswordIsIncorrect() {
        user.should(seeThat(MessageAnswer.is(LoginPage.MESSAGE_PASSWORD_INCORRECT),
                Matchers.equalTo(WRONG_PASSWORD_USER.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }
}

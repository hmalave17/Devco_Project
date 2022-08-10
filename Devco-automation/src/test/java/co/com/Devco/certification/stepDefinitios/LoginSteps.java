package co.com.Devco.certification.stepDefinitios;


import co.com.Devco.certification.execptions.UnexpectedMessage;
import co.com.Devco.certification.execptions.UnexpectedUser;
import co.com.Devco.certification.models.DataExcel;
import co.com.Devco.certification.models.NewUser;
import co.com.Devco.certification.questions.MessageAnswer;
import co.com.Devco.certification.tasks.Login;
import co.com.Devco.certification.tasks.SelectOption;
import co.com.Devco.certification.tasks.SetData;
import co.com.Devco.certification.userInterfaces.HomePage;
import co.com.Devco.certification.userInterfaces.LoginPage;
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

import static co.com.Devco.certification.enums.Message.WRONG_PASSWORD_USER;
import static co.com.Devco.certification.enums.Words.USER;
import static co.com.Devco.certification.execptions.UnexpectedMessage.UNEXPECTED_MESSAGE;
import static co.com.Devco.certification.execptions.UnexpectedUser.NAME_USER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginSteps {

    @Shared
    DataExcel dataExcel;

    @Shared
    NewUser userNew;

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named(USER.getWord());

    @Given("the user selects the login option in the menu main")
    public void theUserSelectsTheLoginOptionInTheMenuMain() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(SetData.user());
        user.attemptsTo(SelectOption.menu(HomePage.BUTTON_LOGIN));
    }
    @When("user make login successful")
    public void userMakeLoginSuccessful() {
        user.attemptsTo(Login.user(Converter.registre(dataExcel)));
    }

    @When("A user enters a password incorrect")
    public void aUserEntersAPasswordIncorrect() {
        user.attemptsTo(Login.user(Converter.registre(dataExcel)));
    }

    @Then("the user will be able to see your name on the website.")
    public void theUserWillBeAbleToSeeYourNameOnTheWebsite() {
        user.should(seeThat(MessageAnswer.is(HomePage.LABEL_NAME_AVATAR),
                Matchers.equalTo(userNew.getName())).orComplainWith(UnexpectedUser.class, NAME_USER));
    }

    @Then("the system going to notify her password is incorrect")
    public void theSystemGoingToNotifyHerPasswordIsIncorrect() {
        user.should(seeThat(MessageAnswer.is(LoginPage.MESSAGE_PASSWORD_INCORRECT),
                Matchers.equalTo(WRONG_PASSWORD_USER.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }
}

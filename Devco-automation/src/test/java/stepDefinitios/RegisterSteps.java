package stepDefinitios;

import interactions.Click;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.NewUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.WebDriver;
import tasks.Register;
import userInterfaces.HomePage;
import utils.NumberRandom;


import static enums.Words.USER;

public class RegisterSteps {

    @Shared
    NewUser newUser;

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named(USER.getWord());


    @Given("the user selects the register option in the menu main")
    public void theUserSelectsTheRegisterOptionInTheMenuMain() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(Click.on(HomePage.BUTTON_REGISTER));
    }

    @When("user registered in website")
    public void userRegisteredInWebsite() {
        user.attemptsTo(Register.user(String.format(newUser.getEmail(), NumberRandom.email(10000,90000)), newUser.getPassword()));
    }
    @And("fill in her data")
    public void fillInHerData() {

    }
    @Then("user should look in the interface her name")
    public void userShouldLookInTheInterfaceHerName() {

    }



}

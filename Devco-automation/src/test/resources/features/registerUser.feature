#Language: en
#Author: Hernan Malave
@RegisterRegression @RegressionTest
Feature: Register user in website

  As a selection process
  I wanna build a register feature with its alternative cases
  So that i could evaluate your automation skills

  Background:
    Given the user selects the register option in the menu main

  @PasswordIncorrect
  Scenario: A user wants to register but the password does not match
    When A user enters a wrong password
    Then the system cannot register it

  @EmailInvalid
  Scenario: A user type email with an invalid format
    When A user enters an invalid format email
    Then the system going to notify her email invalid

  @PasswordInvalid
  Scenario: A user type the password with an invalid format
    When A user enters an invalid format password
    Then the system going to notify her password invalid

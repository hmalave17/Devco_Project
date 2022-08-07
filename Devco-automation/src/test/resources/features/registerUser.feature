#Language: en
#Author: Hernan Malave
@RegisterSuccessful
Feature: Register user in website

  As a selection process
  I wanna build a register feature and its alternative cases
  So that i could evaluate your automation skills

  Background:
    Given the user selects the register option in the menu main

  Scenario: A user wants to register but the password does not match
    When A user enters a wrong password
    Then the system cannot register it

  Scenario: A user type email with an invalid format
    When A user enters an invalid format email
    Then the system going to notify her email invalid

  Scenario: A user type the password with an invalid format
    When A user enters an invalid format password
    Then the system going to notify her password invalid

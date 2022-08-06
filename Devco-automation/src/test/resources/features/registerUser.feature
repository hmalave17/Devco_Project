#Language: en
#Author: Hernan Malave

Feature: Register user in website

  As a selection process
  I wanna build a register feature and its alternative cases
  So that i could evaluate your automation skills

  Background:
    Given the user selects the register option in the menu main

    @RegisterSuccessful
    Scenario: A user wanna register on the website and fill in her data
      When user registered in website
      And fill in her data
      Then user should look in the interface her name

      Scenario: A user

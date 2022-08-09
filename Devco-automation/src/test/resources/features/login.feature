#Language: en
#Author: Hernan Malave
@LoginRegression @RegressionTest
Feature: Login successful in website

  As a selection process
  I wanna build a login feature with its alternative cases
  So that i could evaluate your automation skills

  Background:
    Given the user selects the login option in the menu main

  @LoginSuccessful
  Scenario: A user was able to login successful
    When user make login successful
    Then the user will be able to see your name on the website.

  @LoginFailed
  Scenario: A user had login failed
    When A user enters a password incorrect
    Then the system going to notify her password is incorrect



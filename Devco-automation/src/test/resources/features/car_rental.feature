#Language: en
#Author: Hernan Malave
@CarRentalRegression @RegressionTest
Feature: Login successful in website

  As a selection process
  I wanna build a car rental feature with its alternative cases
  So that i could evaluate your automation skills

  Background:
    Given the user selects the rent car option in the menu main

  @CarRentalSuccessful
  Scenario: A user was able to rent a car successful
    When make the process to rent
    Then the system show the successful transaction

  Scenario: User doest select the place delivery
    When doest select the place delivery
    Then the system doesnot going to advance

  Scenario: check price filter
    When move price filter
    Then the system show others price

  Scenario: doesn't fills complete data
    When user does not fill input data
    Then the system doesnot allow reservation



#Language: en
#Author: Hernan Malave
@BookHotelRegression @RegressionTest
Feature: Register Login in booking

  As a selection process
  I wanna build a book hotel feature with its alternative cases
  So that i could evaluate your automation skills

  Background:
    Given user select a destiny

  @BookHotel
  Scenario: A user was able to book hotel
    When user select a hotel
    And user checks availability
    And user enter its date
    Then user completes its booking

  @FilterPrice
  Scenario: A user does not select the date
    When user use the filter price
    Then the system going to show the filter

  @QuantityMandatory
  Scenario: A user tries booking but does not select the quantity of room
    When user does not select the quantity of room
    Then the system going to show that select the quantity of room is mandatory

  @DataMandatory
  Scenario: A user tries booking but does not enter its data
    When user does not enter its data
    Then the system going to show enter its data is mandatory

  @EmailFormat
  Scenario: A user enter an email invalid
    When user does not enter a format valid email
    Then the system going to show invalid email

  @EmailDistinct
  Scenario: A user enters distinct emails
    When user does enters distinct email
    Then the system going to show distinct email




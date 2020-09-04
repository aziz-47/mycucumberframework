@datatable01 @third
Feature: scenario outline example

  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name "Betul"
    And User enters last name "Zafer"
    And User enters position "SDET"
    And User enters office "LONDON"
    And User enters extension "111"
    And User enters start date "2020-08-12"
    And User enters salary "80000"
    And User clicks Create button
    And User enters first name "Betul" to the searchbox
    Then verify that user see the first name "Betul" in the searchbox
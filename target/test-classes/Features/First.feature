Feature: Amazon Login and Search

  Background: 
    Given browser is open

  @test
  Scenario: Login functionality on Amazon
    Given user is on amazon page
    When user clicks sign in
    And user enters abc17@gmail.com
    And clicks on continue button
    And user is entering abc
    Then user is navigated to the home page

    
  @test
  Scenario: Search for a product
    And user is on the Amazon homepage
    When user searches for laptop
    Then search results for laptop are displayed

Feature: Amazon Login and Search

  Background: 
    Given now chrome is open

  @test
  Scenario: Open Mini Tv in amazon site
    Given user is on website
    When user clicks mini-Tv page
    Then user is navigated to the mini-tv page

  @test
  Scenario: open cart page
    Given user is on website
    When user clicks on Cart Page
    Then user navigates to the Cart Page

  @test
  Scenario: user is searching for a product
    And user is on website
    When user is searching for laptop
    Then search results are displayed

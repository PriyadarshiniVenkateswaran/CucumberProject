Feature: Checking the search functionality of Flipkart page

  Scenario Outline: Searching iphone14 in flipkart page
    Given User launches the browser
    And User loads the Flipkart Page
    When User enters the value "<data>" in the search field
    And User clicks on the search button
    Then validate the first product in the list and print the model

    Examples: 
      | data    |
      | iphone4 |

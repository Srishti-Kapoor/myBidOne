@parallel
Feature: COCONUT MILK availability page test

  Scenario: I search the item Coconut Milk
    Given I login into myBidFood with valid credentials
    When I search with COCONUT MILK keyword
    Then I ensure the search result is showing coconut items

  Scenario: Adding an item into my cart
    Given I login into myBidFood with valid credentials
    When I search with COCONUT MILK keyword
    And I click on add button to add item to the cart
    Then I ensure the item is added successfully

  Scenario: Ensuring the pop up message for already added item
    Given I login into myBidFood with valid credentials
    When I search with COCONUT MILK keyword
    And I empty the bucket
    And  I added same item twice into my cart
    Then I ensure the pop up warning message appear


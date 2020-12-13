@parallel
Feature: Cart check test

  Scenario: I Empty the cart and ensure the cart has nothing in it.
    Given I login into myBidFood with valid credentials
    When I search with COCONUT MILK keyword
    And I click on add button to add item to the cart
    And I empty the bucket
    Then I Ensure the bucket is empty

  Scenario: The count on cart icon is increased when add an item
    Given I login into myBidFood with valid credentials
    When I search with COCONUT MILK keyword
    And I empty the bucket
    And  I capture the cart's icon count before adding any item
    And  I click on add button to add item to the cart
    Then I assert the number on cart should be increased based on how many items ae added.


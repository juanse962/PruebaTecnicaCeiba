Feature: Select Product
  As a user I want to add a product to the shopping cart

  @smoke
  Scenario Outline: Enter the website and select the product
    Given the user wishes to login an account on the website
    When the user enters his or her data for the creation of a new system
      | emails  | pwd        |
      | <email> | <password> |
    And the user selects the product
      | products  | <prices> |
      | <product> | <price>  |
    Then the user visualize the product in a shopping cart
    Examples:
      | email         | password     | product                  | price  |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | $49.99 |
Feature: Purchase product
  As a user I want to be able to carry out a purchase process

  @smoke
  Scenario Outline: Enter the website and select the product
    Given the user wishes to login an account on the website
    When the user enters his or her data for the creation of a new system
      | emails  | pwd        |
      | <email> | <password> |
    And the user Pedro Perez selects the product and confirm purchase
      | products  | prices  |
      | <product> | <price> |
    Then the user visualize the purchase succesfull with the message THANK YOU FOR YOUR ORDER
    Examples:
      | email         | password     | product                  | price  |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | $49.99 |
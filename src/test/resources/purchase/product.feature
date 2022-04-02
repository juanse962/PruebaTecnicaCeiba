Feature: Saucedemo

  @smoke
  Scenario Outline: Enter the website and select the product
    Given the user wishes to login an account on the website
    When the user enters his or her data for the creation of a new system
      | emails  | pwd        |
      | <email> | <password> |
    And the user selects the product and confirm purchase
      | products  |
      | <product> |
    Then the user visualize the product in a shopping cart
    Examples:
      | email         | password     | product                  |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket |


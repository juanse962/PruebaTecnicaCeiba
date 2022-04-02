Feature: Saucedemo

  @smoke
  Scenario Outline: Enter the website and fill in the form
    Given the user wishes to login an account on the website
    When the user enters his or her data for the creation of a new system
      | emails  | pwd          |
      | <email> | <password> |
    Then he must display a message PRODUCTS
    Examples:
      | email         | password     |
      | standard_user | secret_sauce |

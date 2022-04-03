Feature: Login User
  As a user I want to be able to register on the Saucedemo page

  @smoke
  Scenario Outline: Enter the website and fill in the form
    Given the user wishes to login an account on the website
    When the user enters his or her data for the creation of a new system
      | emails  | pwd        |
      | <email> | <password> |
    Then he must display a message PRODUCTS
    Examples:
      | email         | password     |
      | standard_user | secret_sauce |
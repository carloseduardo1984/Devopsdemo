@Regression   @TestCase01
Feature: Login process verification

  Scenario Outline: Simple links verification
    Given an operational user of bank link page "<arg1>"
    When you insert the SOEID "<arg2>" and password "<arg3>"
    Then the results are the login process with success
    Examples:
      | arg1                                | arg2   | arg3   |
      | http://demo.guru99.com/V1/index.php | mgr123 | mgr!23 |

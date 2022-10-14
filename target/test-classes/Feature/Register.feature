Feature: Nopcommerce Register

  Background:
    Given User able to open browser
    And Enter Url

  Scenario: Nopcommerce Valid Register Test
    Then User click on Rgister Link
    Then User select the Gender option
    Then User insert the fist name
    And  User insert the last name
    Then User insert the email id
    Then User Enter the company name , password and confirm password
    Then User select the DOB
    And User Click on register button
    Then User close the browser

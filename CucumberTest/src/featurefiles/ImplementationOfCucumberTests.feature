Feature: Cucumber Automation Testing

  @SmokeTest
  Scenario: Validate that user is able to search for selenium course.

    Given user is navigating to Google
    When user is doing search for Selenium course
    Then user is validating the Homepage of Selenium course

  @SmokeTest
  Scenario Outline: Validate if a registered user is able to place an order.

    Given user is logged onto the Amazon website as a registered user
    When user logs in with "<username>" and "<password>"
    Then user should be able to view homepage
    When user searches for "<productID>"
    Then order should be placed successfully

    Examples:
      | username | password | productID |
      | test     | pass123  | 123       |
      | user     | pass456  | 456       |

  @SmokeTest
  Scenario: New user registration.

    Given user navigates to new registration page
    When user enters the data on the page
      | Username               | Password            |
      | Fields                 | Values              |
      | First Name             | Test                |
      | Last Name              | TestUser            |
      | Email Address          | someone@someone.com |
      | Re-enter Email Address | someone@someone.com |
      | Password               | Password1           |
      | Birthdate              | 01                  |
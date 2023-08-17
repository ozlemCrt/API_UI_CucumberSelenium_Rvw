@exlab
  Feature: Sign up


  Scenario Outline: Exlab user register
    When The user creates a POST request with "<name>" and "<email>" and "<password>" and "<about>" and "<terms>"
    Then The user verifies that the status code is <statusCode>
    And The user verifies that body contains "<content>"
    And The compiler gets the token
    Examples:
      | name    | email             | password | about    | terms | statusCode | content |
      | Sirillo | Sirillo@study.net | Test1234 | About Me | 2     | 200        | token   |

  @wip
  Scenario Outline: Exlab user can able to PATCH request saves profile
    When The user creates a PATCH request and send the token "<name>" and "<password>" and "<admin>" and "<about>" and "<terms>" and "<job>" and "<company>" and "<website>" and "<location>" and "<skills>"
    Then The user verifies that the status code is <statusCode>
    And The user creates a GET request to get user own profile with token
    And The user verifies that name as "<name>" and email as "<email>"
    Examples:
      | name    | password | admin  | about    | terms | job       | company   | website           | location | skills   | statusCode | email             |
      | Sirillo | Test1234 | 0 or 1 | About Me | 4     | Developer | Microsoft | www.microsoft.com | NY       | PHP,Java | 204        | Sirillo@study.net |
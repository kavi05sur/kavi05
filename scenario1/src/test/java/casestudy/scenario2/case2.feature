Feature: login
 

  Scenario Outline: login success
    Given homepage
    When user enter "<username>" 
    Then user enters "<password>" 

    Examples:
      | username| password    |
      | Lalitha | Password123 |
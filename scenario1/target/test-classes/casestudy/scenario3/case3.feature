Feature: find details
 

 
  Scenario Outline: find details success
    Given log in
    When user "<username>"
    And pass "<password>"
    And click login
    And enter product "<product>"
    Then click find items

    Examples:
      | username | password  | product    |
      | Lalitha  |Password123| headphone  |

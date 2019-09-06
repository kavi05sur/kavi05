Feature: Registration
 

  Scenario: Register to TestMeApp
    Given Homepage of testmeapp
    And signin option in homepage
    When click on signin
    And username is entered as "kavsur"
    And firstname is entered as "kavi"
    And lastname is enteres as "s"
    And password is entered as "Password123"
    And confirm password is entered as "Password123"
    And gender is selected as female
    And email id is "kavi13@gmail.com"
    And mobile number is "1234567891"
    And DOB is "13/07/1996"
    And address is "59b,nsc nagar"
    And security question is "what is your birth place"
    And answer is "chennai"
    Then click on register
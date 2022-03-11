Feature: As a potential client i need to search in automationpractice to find a product and sign in verifying the results

  @Smoke
  Scenario: The client search hat
    Given The client is in automationpractice page
    When The client search for word "hat"
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client logs in
    Given The client is in automationpractice page
    When The client click the button "Sign in"
    And The client fill the Email adress input
    And The client fill the Password input
    And The client click the button "Sign in".
    Then The client verify that MY ACCOUNT page is shown

  @Smoke
  Scenario: The client search a product in automationpractice page and sort the result
    Given The client is in automationpractice page
    When The client search for word dresses
    And The client select Sort by Price: Lowest first
    Then The client verify that results are shown properly.









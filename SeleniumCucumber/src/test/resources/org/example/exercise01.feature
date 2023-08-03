Feature: Exercise01
  As a User
  I want to be able to create new address
  So that I can use it for my orders

  Scenario: Create new address
    Given User is logged in
    When User goes to My addresses page
    And User clicks on Create new address button
    Then User should see new address form
    When User fills in new address form using table
      | Alias   | Address   | City    | Zip    | Country | Phone      |
      | Testowy | Testowa 1 | Testowo | 12-345 | Poland  | 1234567890 |
    Then User should see success message

Feature: Create new address after login


  Scenario: Create new address
    Given User is logged in to my store shop
    When User goes to UserAddressesPage
    And User create new address
    And User delete last address
    Then User close window
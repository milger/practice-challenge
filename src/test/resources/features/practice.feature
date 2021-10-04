Feature: Practice
  Scenario: Search Item
    Given I visited to practice page
    When I search for "Faded"
    Then I should see the list
      | Faded Short Sleeve T-shirts |

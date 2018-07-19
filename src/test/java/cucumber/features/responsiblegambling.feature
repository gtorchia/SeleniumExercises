Feature: Responsible Gambling
  As a uuser, I want to check if the responsible of gambling is displayed on te main page


  Scenario: manage gambling problem
    Given Navigate to home page
    When I check responsible gambling link is present on the home page
    Then I click on link
    And  I verify "Gamblers Anonymous" link is showed on the page




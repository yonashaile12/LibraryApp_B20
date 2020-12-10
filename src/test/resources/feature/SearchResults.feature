Feature: Search functionality on the users page
  As a user, when i login as a librarian and I go to user page, then table should have following
  .Actions
  .UserID
  .Full Name
  .Email
  .Group
  .Status
  @wip
  Scenario: Table columns names
    Given I am on the login page
    And I login as a librarian
    And I click on "users" link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
    # Command + option + l to fix the data table structure
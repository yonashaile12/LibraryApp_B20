Feature: Login with parameters

  @LibrarianParam
    Scenario: Login as Librarian 49
      Given I am on the login page
      When I enter username "librarian49@library"
      And I enter password 'xHdfRYuD'
      And click sign in button
      And there should be 2393 users
      Then dashboard should be displayed
      #number can be whatever you have there

  @studentParam
  Scenario: Login as student 30
    Given I am on the login page
    When I enter username "student30@library"
    And I enter password 'IaT9YI0I'
    And click sign in button
    Then books should be displayed

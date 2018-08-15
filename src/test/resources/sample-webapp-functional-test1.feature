@SPRINT100
Feature: Item1 - Validate the web site pages
  Navigate to the Test page.
  Enter the values in two text boxes. 
  Hit concatenate button to populate the result in the third textbox.
  Validate the result populated is as expected.

  Scenario Outline: Test1 - Concatenate two strings in the Test page
    Given I am using app url to navigate to the Test page
    And I have entered <firststring> into the first text box
    And Then I have entered <secondstring> into the second text box
    When I press concatenate button
    Then the result should be <resultstring> on the third text box

    @SMOKE
    Examples: 
      | firststring | secondstring | resultstring |
      | abc1        | def1         | abc1def1     |
      
      
    @FUNCTIONAL
    Examples: 
      | firststring | secondstring | resultstring |
      | abc2        | def2         | abc2def2     |
      | abc3        | def3         | abc3def3     |
      
   

   

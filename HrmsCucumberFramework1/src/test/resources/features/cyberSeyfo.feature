Feature:

@autotrader
Scenario: Testing Autotrader.com
Given User is in landing page
Then Verify that "Browser By Make" are present
Then Verify that "Browser By Style" are present
Then Verify that "Advance Search" are present
And Verify that search buttom is present
Then Verify taht "Any Make" and "Any Model" is visible

@autotarder2
Scenario: Entering the Advance search link
Given User click Advance link on the home page
Then User enter "30084" in the zip code text box
Then User select "Certified" check box under "Condition"
Then User select "Convertable" check box under "Style"
Then User update year "2001" to "2020" 
Then User select "BMW" car from Make, Model and Trim
Then User click Search Button 
Then User verify that he is in result page
Then User Verify that he sees only "BMW" cars in listing
Then Display in console, the number of cars listed in result page

*** Settings ***
Library		keywords.RadixSortKeywords
Library		Collections

*** Keywords ***
    
*** Test Cases ***
Sort an Integer Array
	${intList}=  Create List 453  2  45  0  12  750  1000  10
	Sort Array ${intList}

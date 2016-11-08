*** Settings ***
Library		keywords.RadixSortKeywords
Library		Collections

*** Keywords ***
    
*** Test Cases ***
Sort an Integer Array with a four digit number
	${intList}=  	Create List 	453  2  45  0  12  750  1000  10
	${finalList}=	Create List 	0  2  10  12  45  453  750  1000
	Sort Array 		${intList}	4
	${result}=	Return Int Array 
	Lists Should Be Equal		${result}	${finalList}
	
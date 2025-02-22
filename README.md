# string-processing-java-

Documentation

The "Number to string" program receives natural numbers between 0 and 1000000
then outputs string from of this number in kyrgyz language. 
For example: 
	input: 12
	output: он эки

How does it work
1)First of all we break the number into digits and save them in list.
2)After that we use dictionary(very convenient data type) to connect some numbers to some words.
3)Then we use loop to read every digit in list and we take a word representation of this number from dictionary 
4)During loop we concatenate every word in one string called ans(answer)
5)We print that string 

Main idea:
	After we break the number into digits and save them in reverse order in list(FILO) then we start checking it
	from the end giving each number to dictionary as a "key" which has some value(for us it's digits word form)
	If there is zero then we ignore it except if this is the only number we've got

Why this way
	I thought that using dictionary is good choise because
	otherwise i had to use a lot of words in if statesments or use some
	difficult list with special indexing for words. That's why i used 
	dict.(i knew about it before). Also there is a sophisticated way of 
	ignoring zeros but if it wasn't like that there would be a lot of bugs.
	
This project turned out to be easier than i thought thanks to dictionary and list. Also it can be easily
adapted to other languages or bigger numbers
	



# is-target-string-valid
Java program to check if a string is valid from given substring on adding multiple times based on some conditions

## **Problem Staement**

You have given two strings:

Target String -  "aabcbc"

Source String - "abc"

You need to check is given target string is valid or not based on below conditions:

 - you can start from blank string and can add source string into it, like: "" + abc = abc
 - after this you can add source string into step 1 output string like below rules-
 
	
either start of string like: abc + abc = abcabc

either end of string like: abc + abc = abcabc

or middle of the string like: 
  
a + "abc" + bc = a**abc**bc 
***or***  
ab + "abc" + c = ab**abc**c

So from given example if you can see, Target String - "aabcbc" is equal to the above target strings, So we need to return true.

If it is not equal then just return false. 

# Solution

To solve this problem, If we try to create target string from blank and source string, it will be really difficult.

instead of doing that, we will solve this using reverse approach. We will take target string and try to make it blank based on given rules.

**Hint** :  we will be using stack to trace the target characters

lets follow below steps:
- We will start traversing the target string character by charcter.
- Each character need to be pushed in stack
- Befor pushing we will concat top two characters and current character
- After this we will check if the concanicated string is similar to source string
- If it is equal to source string we will pop two characters
- Otherwise just push the current character to Stack.
- At the end we will check if Stack is empty, it means target string can be converted to blank and return true
- Otherwise return false

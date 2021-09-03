
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

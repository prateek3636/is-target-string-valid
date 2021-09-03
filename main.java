package com;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String targetString = "aabcbcaabcbc";
        String subString = "abc";
        System.out.println(isStringValid(targetString, subString));
    }

    private static boolean isStringValid(String target, String subString){
        Stack<String> characterStack = new Stack<>();
        for(int i=0; i<target.length(); i++){
            String tempString = "";
            char currentChar = target.charAt(i);

            //checking if stack size is enough to create a word of substring size
            //so if our substring is size of 3 then we will check for stack size is 2 or greater than 2

            if(characterStack.size() >= 2){
                //creating string with current char and top of stack
                tempString = characterStack.get(characterStack.size()-2)
                        .concat(characterStack.get(characterStack.size()-1)
                        .concat(Character.toString(currentChar)));
            }
            if(tempString.equals(subString)){
                characterStack.pop();
                characterStack.pop();
            }else{
                characterStack.push(Character.toString(currentChar));
            }
        }
        return characterStack.size() == 0;
    }

}


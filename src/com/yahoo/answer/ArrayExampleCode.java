package com.yahoo.answer;

/**
 * 
 * @author MrAlex6204
 */
public class ArrayExampleCode {
    
    /*
    Yahoo Question Link:
    https://answers.yahoo.com/question/index?qid=20141118190802AA1Yktv
    
    Solution:
    Convert the integer number to string then the string to char array
    Then you could get the first element of the array.
    */
    
    public static void main(String[] args){
        int[] lstNumbers = {34,10,5,1,95,10,1};
        
        for(int index = 0;index <= lstNumbers.length-1;index++){            
            System.out.println("The first element of "+lstNumbers[index]+" is "+getFisrtNumber(lstNumbers[index]));
        }
        
    }
    public static char getFisrtNumber(int number){
        char[] numberElement = Integer.toString(number).toCharArray();//===>Convert the number to  integer then to string and then to char array
        
        if(numberElement.length > 0) {
            return numberElement[0];//===>Return the fisrt element of the number
        }else{
            return '0';
        }
    }
}

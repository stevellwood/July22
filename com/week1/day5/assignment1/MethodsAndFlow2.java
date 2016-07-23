package com.week1.day5.assignment1;
public class MethodsAndFlow2 {
    private String[] stringArray;//this first holds the input command line
    private int StartPosition;
    private int numberOfValues;
    public MethodsAndFlow2(String[] stringArray1) {
        this.stringArray = stringArray1;
    }
    public void outputSubset(int startPosition, int numberOfValues) {
       if ((startPosition < 0)||(startPosition >= stringArray.length)||(startPosition>=numberOfValues)) {
           System.out.println("Invalid StartPosition"); 
           StartPosition=0;}
 //      Hint: What if startPosition is larger than the size of the array?
//               Hint: What if startPosition is negative?
//               Hint: What if numberOfValues is larger than the array?
       if (stringArray.length < numberOfValues + StartPosition){
             numberOfValues = stringArray.length-StartPosition;}
      // if (stringArray.length < numberOfValues )
           
       for (int i = StartPosition; i < StartPosition+numberOfValues-1; i++) {
                System.out.println(stringArray[i]);
                System.out.println("--------=------=---------");
             //   OutputSubset[i] = stringArray[i];  
            } } 
    public void setOutputSubset(int abc, int def) {
        this.StartPosition= abc;
        this.numberOfValues = def;
    }
    public void outputAll() {
       // this.outputSubset(=, numberOfValues);
//        String retval = "";
//        for (int i = 0; i < stringArray.length-1; i++) {
//            retval += stringArray[i] + "\n";
            outputSubset(0,stringArray.length-1);
        }
    }




   



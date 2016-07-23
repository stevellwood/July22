package com.week1.day5.assignment1;

//import com.tiy.shared.Data;

//import com.tiy.shared.Data;

public class StartPoint2 {
    
    //private Data data;//WITHOUT IMPORT DATA CANNOT B RESOLVED TO TYPE
   // private String string;
    
    public static void main(String[] stringArrays2) {//noticed we replaced the "args" standard
        //StartPoint2 main = new StartPoint2 (stringArrays2);
        MethodsAndFlow2 mf = new MethodsAndFlow2(stringArrays2);
        //mf.setStringArray(stringArrays2);
        System.out.println("day 5 afternoon2 debug");
            //System.out.println(data);
        
        mf.setOutputSubset(4,8);
        mf.outputAll();
//        System.out.println("///////////////////////");
//        mf.setOutputSubset(-5,3000);
//        mf.outputAll();
    }
}



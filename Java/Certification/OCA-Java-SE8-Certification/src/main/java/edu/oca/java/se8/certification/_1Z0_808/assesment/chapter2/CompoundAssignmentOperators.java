package edu.oca.java.se8.certification._1Z0_808.assesment.chapter2;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        long x = 10;
        int y = 5;
        
        //Example 1
        //incompatible types: possible lossy conversion from long to int
        //y = y * x; // DOES NOT COMPILE 
        
        //Example 2
        y *= x;
        
        //Example 3
        x = x * y;
        x *= y;
        
        CompoundAssignmentOperators.assing();
    }
    
    public static void assing(){
        long x = 5;
        long y = (x=3); //or long y = x = 3;
        
        System.out.println(x); // Outputs 3
        System.out.println(y); // Also, outputs 3
        
        int a = 5;
        long b = a = 4;
        System.out.println(a); // Outputs 4
        System.out.println(b); // Also, outputs 4
    }
}

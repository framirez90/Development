package edu.oca.java.se8.certification._1Z0_808.assesment.chapter2;

import java.io.File;

public class EqualityOperators {

    public static void main(String[] args) {
        EqualityOperators equalityOperators = new EqualityOperators();

        equalityOperators.singleEquality();
        equalityOperators.equalsOperator();
    }

    public void singleEquality() {
        boolean y = false;
        boolean x = (y = true);
        boolean z = y = true;
        System.out.println("Single Equality with Parenthesis: " + x); // Outputs trues
        System.out.println("Single Equality without Parenthesis: " + z); // Outputs true
    }

    public void equalsOperator() {
        boolean y = false;
        boolean x = (y == true);
        System.out.println("Equals Operator: " + x); // Outputs false
    }

    public void equalsFile() {
        File x = new File("myFile.txt");
        File y = new File("myFile.txt");
        File z = x;
        System.out.println(x == y); // Outputs false
        System.out.println(x == z); // Outputs true
    }
}

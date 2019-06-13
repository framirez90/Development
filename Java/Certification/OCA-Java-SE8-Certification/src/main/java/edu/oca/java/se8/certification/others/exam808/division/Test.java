package edu.oca.java.se8.certification.others.exam808.division;

public class Test {
  public static void main(String[] args) {
    /*
      What is the result?
        A) E1
        B) E2
        C) 5 10 E1
        D) Compilation fails.
    */
    
    int x = 10;
    int y = 2;
    try {
      for (int z = 2; z >= 0; z--) {
        int ans = x / z;
        System.out.print(ans + " ");
      }
    } catch (Exception e1) {
      System.out.println("E1");
    } /*catch (ArithmeticException e1) {  // -> ERROR
      System.out.println("E2");
    }*/
  }

}

package edu.oca.java.se8.certification.others.exam808.abstract_inheritance;

public class Programmer extends Writer{
  /*
    What is the result?
      A) Writing...
      B) Writing book
      C) Writing code
      D) Compilation fails.
  */
  
  public static void write() {
    System.out.println("Writing code");
  }

  public static void main(String[] args) {
    Writer w = new Programmer();
    w.write();
  }
}

package edu.oca.java.se8.certification.others.exam808.string_builder;

public class String_Builder {

  public static void main(String[] args) {
    /*
      Given the code fragment:
      A) -1
      B) 3
      C) 4
      D) A StringIndexOutOfBoundsException is thrown at runtime.
    */
    
    StringBuilder s1 = new StringBuilder("Java");
    String s2 = "Love";

    s1.append(s2);

    s1.substring(4);
    int foundAt = s1.indexOf(s2);

    System.out.println(foundAt);
  }

}

package edu.oca.java.se8.certification.others.exam808.inheritance;

public class SubClass extends SuperClass{

  SubClass() {
    /*
      Based on https://learn.oracle.com/education/downloads/Exam808_SampleQuestion.pdf
      Which statement, when inserted at Line n1, enables the code to compile?
        A) this(10);
        B) super(10);
        C) SuperClass(10);
        D) super.SuperClass (10);
    */
    // Line n1
    super(10);  
    System.out.println("Sub 2");

  }

}

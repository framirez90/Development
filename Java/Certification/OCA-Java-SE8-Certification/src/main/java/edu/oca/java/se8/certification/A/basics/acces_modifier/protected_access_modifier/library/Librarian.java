package edu.oca.java.se8.certification.A.basics.acces_modifier.protected_access_modifier.library;

public class Librarian {
  public Librarian() {
    Book book = new Book();
    book.author = "ABC";
    book.modifyTemplate();
  }
}

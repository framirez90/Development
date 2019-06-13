package edu.oca.java.se8.certification.A.basics.acces_modifier.public_access_modifier.building;

import edu.oca.java.se8.certification.A.basics.acces_modifier.public_access_modifier.library.Book;

public class House {
  public House() {
    Book book = new Book();
    String value = book.isbn;
    book.printBook();
  }
}

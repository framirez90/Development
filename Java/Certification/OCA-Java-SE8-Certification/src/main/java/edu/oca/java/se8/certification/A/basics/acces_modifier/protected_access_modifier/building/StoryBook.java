package edu.oca.java.se8.certification.A.basics.acces_modifier.protected_access_modifier.building;

import edu.oca.java.se8.certification.A.basics.acces_modifier.protected_access_modifier.library.Book;

public class StoryBook extends Book{

  public StoryBook() {
    author = "ABC";
    modifyTemplate();
    super.modifyTemplate();
  }
}

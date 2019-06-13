package edu.oca.java.se8.certification._1Z0_808.assesment.test._8;

public class Deer {
  public Deer() { System.out.print("Deer"); }
  public Deer(int age) { System.out.print("DeerAge"); }
  private boolean hasHorns() { return false; }
    public static void main(String[] args) {
      Deer deer = new Reindeer(5);
      System.out.println(","+deer.hasHorns());
    }
}

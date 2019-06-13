/*
Options:
a The code fails to compile.
b The code compiles successfully.
c Removing the definition of class Car will compile the code.
d Changing class Car to a nonpublic class will compile the code.
e Changing interface Multiple2 to a nonpublic interface will compile the code.
*/
package edu.oca.java.se8.certification.A.basics.quiz;

// contents of Multiple2.java
interface Printable {
//.. we are not detailing this part
}
class MyClass {
//.. we are not detailing this part
}
interface Movable {
//.. we are not detailing this part
}
//public class Car {                      //<- ERROR
//.. we are not detailing this part
//}
public interface Multiple2 {}

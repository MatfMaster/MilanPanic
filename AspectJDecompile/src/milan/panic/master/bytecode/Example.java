/**Primer dobijenog bajt koda prilikom prevođenja*/
/**
 * Za prevođenje iz bajt koda korišćen je javap disasembler, 
 * standardni deo Oracle Java JDK distribucije.
 */

/** Compiled from "Example.java"
public class milan.panic.master.bytecode.Example {
  public int method(int);
    Code:
       0: new           #3   // kreiranje objekta na hipu
       3: invokespecial #8   // Poziv konstruktora 
       6: iload_1            // Učitavanje vrednosti iz lokalne promenljive 
       7: iconst_2           // Učitavanje konstante 
       8: iadd               // Sabiranje
       9: ireturn            // Povratak iz metoda
} */
package milan.panic.master.bytecode;
public class Example {
	public int method(int a){
		new Object();
		return a+2;
	}
}

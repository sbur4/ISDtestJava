
// Part 4. Converting and Casting Primitives and Objects
// 29. What will happen when you try to compile the following code?

/**
 * public void printArray( Object x ){ if( x instanceof int[] ){ int[] n =
 * (int[]) x ; for( int i = 0 ; i < n.length ; i++ ) {
 * System.out.println(″integers = ″ + n[i] );} } if( x instanceof String[] ){
 * System.out.println(″Array of Strings″) ; } }
 */

// A. It compiles without error. +
// B. The compiler objects to line 2, which compares an Object with an array.
// C. The compiler objects to line 3, which casts an Object to an array of int
// primitives.
// D. The compiler objects to line 7, which compares an Object to an array of
// Objects.

package JavaTrialTest.Part4;

/**
 * Test29
 */
public class Test29 {

    public void printArray(Object x) {
        if (x instanceof int[]) {
            int[] n = (int[]) x;
            for (int i = 0; i < n.length; i++) {
                System.out.println("integers = " + n[i]);
            }
        }
        if (x instanceof String[]) {
            System.out.println("Array of Strings");
        }
    }
}

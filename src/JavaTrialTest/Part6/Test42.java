// 42. Which one statement is true about the following code fragment?

// **import java.lang.Math; Math myMath = new Math();System.out.println(“cosine
// of 0.123 = “ + myMath.cos(0.123)); */

// A. Compilation fails at line 2. +
// B. Compilation fails at line 3.
// C. Compilation succeeds, although the import on line 1 is not necessary. During
// D. execution, an exception is thrown at line 3.
// E. Compilation succeeds. The import on line 1 is necessary. During execution, an
// F. exception is thrown at line 2 or 3.
// G. Compilation succeeds and no exception is thrown during execution.

package JavaTrialTest.Part6;

/**
 * Test42
 */
public class Test42 {
    public static void main(String[] args) {
        Math myMath = new Math();
        System.out.println("cosine of 0.123 = " + myMath.cos(0.123));
    }

}

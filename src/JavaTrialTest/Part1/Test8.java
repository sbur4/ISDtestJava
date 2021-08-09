
// 8. What is the minimal modification that will make this code compile correctly?
/**
 * final class Aaa { int xxx; void yyy() { xxx = 1; } }
 * 
 * 
 * class Bbb extends Aaa { final Aaa finalref = new Aaa();
 * 
 * final void yyy() { System.out.println("In method yyy()"); finalref.xxx =
 * 12345; } }
 */

// A. On line 1, remove the final modifier. +
// B. On line 6, remove the final modifier.
// C. Remove line 9.
// D. On lines 1 and 6, remove the final modifier.
// E. The code will compile as is. No modification is needed.

class Aaa {
    int xxx;

    void yyy() {
        xxx = 1;
    }
}

class Test8 extends Aaa { // Bbb
    final Aaa finalref = new Aaa();

    void yyy() {
        System.out.println("In method yyy()");
        finalref.xxx = 12345;
    }
}

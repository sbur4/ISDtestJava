
// 4. What will be the result of calling the following method with an input of 2?
/**
 * public int adder( int N ){ return 0x100 + N++ ; }
 */

// A. The method will return 258. +
// B. The method will return 102.
// C. The method will return 259.
// D. The method will return 103.

public class Test4 {

    public static int adder(int N) {
        return 0x100 + N++; // 256+2
    }

    public static void main(String[] args) {
        System.out.println(adder(2));
    }
}

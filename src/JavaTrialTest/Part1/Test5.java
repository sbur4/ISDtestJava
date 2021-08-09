
// 5. How many String objects are created in the following code?
/**
 * String A, B, C ; A = new String( "1234" ) ; B = A ; C = A + B ;
 */

// A. One + 
// B. Two
// C. Three
// D. Four

public class Test5 {

    public static void main(String[] args) {
        String A, B, C;
        A = new String("1234");
        B = A;
        C = A + B;
        // C = A + A;
        System.out.println(C);
    }
}

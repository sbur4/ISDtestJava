
// 12. A method to compute the sum of all elements in an array of int is needed.
// The following proposed method is incomplete:

/**
 * public int total( int[] x ){ int i, t = 0 ; -select statement to go here { t
 * += x[ i++ ] ; } return t ; }
 */

// What is the correct statement for line 3?
// A. for( int i = 0 ; i < x.length ; )
// B. for( i = 0 ; i < x.length ; ) +
// C. for( i = 0 ; i < x.length ; i++ )
// D. for( i = 1 ; i <= x.length ; i++)

public class Test12 {

    private char[] x;

    public int total(int[] x) {
        int i, t = 0;
        for (i = 1; i < x.length;) {
            t += x[i++];
        }
        return t;
    }

    public static void main(String[] args) {
        Test12 sum = new Test12();
        System.out.println(sum.x);
    }
}
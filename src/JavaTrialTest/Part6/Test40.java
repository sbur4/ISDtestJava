
// Part 6. Packages java.lang.* java.util.*
// 40. Given a string constructed by calling s = new String(“xyzzy”), which of
// the calls modifies the string?

// A. s.append(“aaa”);
// B. s.trim(); 
// C. s.substring(3);+
// D. s.replace(‘z’, ‘a’); +
// E. s.concat(s);
// F. None of the above

package JavaTrialTest.Part6;

/**
 * Test40
 */
public class Test40 {

    public static void main(String[] args) {
        String s = new String("xyzzy");
        // s.append("aaa");
        // System.out.println(s.append("aaa"));
        // s.trim();
        // System.out.println(s.trim());
        // s.substring(3);
        // System.out.println(s.substring(3));
        // s.replace(‘z’, ‘a’);
        // System.out.println(s.replace('z', 'a'));
        // s.concat(s);
        System.out.println(s.concat(s));

    }
}

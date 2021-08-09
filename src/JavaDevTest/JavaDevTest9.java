public class JavaDevTest9 {

    // 9. What can be final in Java? Please give example. +

    public static void main(String[] args) {

        final var cC = 1;

         // variabl -переменная значение которой нельзя изменять (константа).
         // method - Тогда нельзя его переопределять в субклассах.
        // class Serg { final void run() { System.out.println("working"); } }
        // class - Тогда не можно от него наследовать.
        // final class Nike{}
        System.out.println("9. " + cC);
    }    
}

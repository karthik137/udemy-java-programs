public class ArithmeticOperators {

    static void addition() {
        System.out.println("Printing addition of two numbers : "+2+4);
    }

    static void unaryPlus() {
        int unaryPlus = +5;
        System.out.println("Unary plus addition : "+unaryPlus);

    }

    static void unarySubtraction() {
        int minus = 15;
        minus -= 5;

        System.out.println("Unary minus subtraction : "+(minus));
    }

    static void isOddOrEven(int num) {
        System.out.println(num % 2);
    }

    /**
     * Operator precedence
     * Multiplicative operators (*, /, %) have higher precendence over additive operators
     *
     *
     */

    static void shortHandOperators(){
        //Pre and Post increment/decrement
        int x = 1;
        int y = 2;
        System.out.println(x+""+y);
        //int z = x+++y;
        int m = ++x+y;
        System.out.println(" "+m);
        isOddOrEven(8);
    }

    /**
     *
     * Operand Promotion
     *
     * Operands smaller than int are promoted to int
     */

    /**
     *
     * If operand belongs to different types, then smaller typee is promoted to larger type
     */


    public static void main(String args[]) {
        addition();
        unaryPlus();
        unarySubtraction();
        shortHandOperators();
    }
}

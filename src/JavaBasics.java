

public class JavaBasics {

    int number = 2;
    // number = 45; // Error


    static void statements() {
        int number = 5;
        System.out.println("Printing number : "+number);
    }

    static void arrays() {

        // Each element's default value 0
        int [] myArray = new int    [7];

        myArray[0] = 10;

        for (int i=0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }


        //other ways to create array

        int [] myArray2 = new int[] {9,11,2,5,4,4,6};

        int [] myArray3 = {1,2,3,4};

        int myArray4[] = {};
    }


    static void twoDArray() {

        // Array with irregular rows
        int[][] myArray = new int[2][];
        myArray[0] = new int[5];
        myArray[1] = new int[6];

        System.out.println("Printing myArray length : "+ myArray.length);
        System.out.println("Printing myArray length : "+myArray[0].length);
        System.out.println("Printing myArray length : "+myArray[1].length);



    }

    static double sum(double x, double y) {
        return x + y;
    }

    static void go(int[] array){
        System.out.println("Array[0] : "+array[0]);
        array[1] = 22;
        System.out.println("Array[1] : "+array[1]);
    }

    /**
     * Method overloading
     * Same name but different parameter list
     * Applies to both instance and static methods
     */

    static void go(short array){
        System.out.println("short method : "+array);

    }

    static void go(int i){
        System.out.println("Array[1] : "+i);
    }



    static void varargsOverloaded(boolean b, int i, int j, int k){
        System.out.println("Test");
    }

    static void varargsOverloaded(boolean b, int... i){
        System.out.println("Test : "+i.length);
        //printData();
    }


    static int id = 10;

    static void printData() {
        System.out.println(id);
        varargsOverloaded(true,20);
    }

    void instanceMethod(){
        System.out.println("This is instance method");
        printData();
    }

    public static void main(String args[]){
        statements();
        arrays();
        twoDArray();
        System.out.println(sum(3.0f,2));

        int[] array = {1,2};
        go(array);
        System.out.println("Array[1] : "+array[1]);


        go(array);
        go(10);
        short a = 20;
        go(a);

        varargsOverloaded(true, 1, 2, 3);
        varargsOverloaded(false);
        JavaBasics jb = new JavaBasics();
        jb.instanceMethod();
    }




}

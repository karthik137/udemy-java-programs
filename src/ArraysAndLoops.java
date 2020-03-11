public class ArraysAndLoops {

    static void arrays() {
        int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < iArray.length; i++) {
            System.out.println("Value at index"+i+" : "+iArray[i]);
        }
    }

    static void swapArrays() {
        int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7};
        int temp;
        for (int index = 0 ; index < iArray.length / 2; index++){
            temp = iArray[index];
            iArray[index] = iArray[iArray.length - (index+1)];
            iArray[iArray.length - (index+1)] = temp;
        }
        for (int i = 0; i < iArray.length; i++) {
            System.out.println("Value at index"+i+" : "+iArray[i]);
        }
    }

    static void countDivisors() {
        int x = 24;
        int count = 1;
        for(int index = 1, loopCount = x/2; index <=loopCount; index++){
            if (x % index == 0 ){
                count++;
            }
        }

        System.out.println("Divisor count = "+count);
    }

    /**
     * For each: Convenient Iteration (Cleaner syntax)
     * Introduced in java 5
     */
    static void forEach(){
        int[] iArray = new int[] {1,2,3,4,5,6};

        for (int i : iArray) {
            System.out.println("Element : "+i);
        }
    }

    /**
     * DIsplay different combinations for a dice
     * @param args
     */
//
//    static void dice() {
//        int[] dice1 = {1,2,3,4,5,6};
//        int[] dice2 = {1,2,3,4,5,6};
//
//        for ( int i = 0 ; i < dice1.length; i++){
//            for (int j = 0; j < )
//        }
//    }

    public static void main(String args[]){
        //arrays();
        //swapArrays();
        //countDivisors();
        forEach();
    }
}

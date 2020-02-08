public class LogicalOperators {

    static void logicalOperators() {
        int age = 37;
        int salary = 95000;
        boolean hasBadCredit = false;

        if (age > 35 && salary > 90000 && !hasBadCredit){
            System.out.println("Loan approved");
        }else {
            System.out.println("Not approved");
        }
    }

    public static void main(String args[]) {
        logicalOperators();
    }
}

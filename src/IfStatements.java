public class IfStatements {

static boolean ifStatement() {
    boolean approved = false;
    int age = 27;
    int salary = 50000;
    boolean hasBadCredit = false;

    if (age >= 25 && age <= 35 && salary >= 50000) {
        approved = true;

        System.out.println("Condition was true");
    }

    return approved;
}


public static void main(String args[]){
        IfStatements ifS = new IfStatements();
        ifStatement();

    }
}

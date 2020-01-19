public class User {

    int id;
    String name;
    int salary;

    User(int id, String name) {
        this("asuna");
        this.id = id;
        //this.name = name;
    }

    User(String name){
        this.name = name;
    }

    User(int userId, String userName, int salary) {
        this(userId, userName);
        this.salary = salary;
    }

    public static void main(String[] args) {
        User instructor = new User(10002, "Kirito", 5000);
        System.out.println("Name : "+ instructor.name);
    }
}

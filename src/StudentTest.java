public class StudentTest {

    public static void main(String[] args) {
        int[] studentIds = new int[] {1002, 1001, 1003};

        Student student1 = new Student(studentIds[0], "joan");
        student1.gender = "male";

        Student student2 = new Student(studentIds[1], "raj");
        student2.gender = "male";

        Student student3 = new Student(studentIds[2], "anita");
        student3.gender = "female";


        System.out.println("Name of student 1 : "+student1.name);

        student1.updateProfile("kirito");
        System.out.println("Name of student 1 : "+student1.name);

        Student student4 = student1;
        System.out.println("Name of student 4 : "+student1.name);

    }


}

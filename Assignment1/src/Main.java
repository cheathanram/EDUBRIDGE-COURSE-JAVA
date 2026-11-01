
class Student {
    String name;
    int age;
    int rollno;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollno);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        // Assign values to first object
        s1.name = "Ram";
        s1.age = 20;
        s1.rollno = 101;

        // Assign values to second object
        s2.name = "Ravi";
        s2.age = 21;
        s2.rollno = 102;

        System.out.println("First Student Details:");
        s1.display();

        System.out.println("Second Student Details:");
        s2.display();
    }
}


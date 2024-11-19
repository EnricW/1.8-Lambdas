package level3.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Aleix", 20, "JAVA", 8.5f));
        students.add(new Student("Vicente", 17, "JAVA", 7.5f));
        students.add(new Student("Maria", 21, "C#", 6.0f));
        students.add(new Student("Toni", 22, "PHP", 7.8f));
        students.add(new Student("Gerard", 23, "C#", 6.3f));
        students.add(new Student("Raimon", 17, "JavaScript", 5.7f));
        students.add(new Student("Dària", 27, "JAVA", 8.6f));
        students.add(new Student("Marta", 26, "PHP", 4.2f));
        students.add(new Student("Anastasia", 17, "JAVA", 6.1f));
        students.add(new Student("Eric", 28, "PHP", 4.9f));
        students.add(new Student("Pancho", 29, "Javascript", 7.4f));

        System.out.println("\nName and age of all students:");
        students.forEach(student -> System.out.println(student.getName() + " - " + student.getAge()));

        System.out.println("\nStudents whose name starts with 'A':");
        List<Student> studentsA = students.stream()
                .filter(student -> student.getName().startsWith("A"))
                .toList();
        studentsA.forEach(student -> System.out.println(student.getName()));

        System.out.println("\nStudents whose grade is equal or greater than 5:");
        students.stream()
                .filter(student -> student.getGrade() >= 5)
                .forEach(student -> System.out.println(student.getName() + " - " + student.getGrade()));

        System.out.println("\nStudents whose grade is equal or greater than 5 and whose course is not PHP:");
        students.stream()
                .filter(student -> student.getGrade() >= 5 && !student.getCourse().equals("PHP"))
                .forEach(student -> System.out.println(student.getName() + " - " + student.getGrade() + " - " + student.getCourse()));

        System.out.println("\nStudents whose course is JAVA and whose age is 18 or greater:");
        students.stream()
                .filter(student -> student.getCourse().equals("JAVA") && student.getAge() >= 18)
                .forEach(student -> System.out.println(student.getName() + " - " + student.getAge() + " - " + student.getCourse()));
    }
}

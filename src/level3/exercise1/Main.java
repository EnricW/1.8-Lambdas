package level3.exercise1;

import java.util.ArrayList;

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

        ListManager.printStudents("\nName and age of all students:",
                ListManager.getNamesAndAges(students));
        ListManager.printStudents("\nStudents whose name starts with 'A':",
                ListManager.getStudentsWithNameStartingWith(students, "A"));
        ListManager.printStudents("\nStudents whose grade is equal or greater than 5:",
                ListManager.getStudentsWithGradeGreaterOrEqual(students, 5));
        ListManager.printStudents("\nStudents whose grade is equal or greater than 5 and whose course is not PHP:",
                ListManager.getStudentsWithGradeAndNotCourse(students, 5, "PHP"));
        ListManager.printStudents("\nStudents whose course is JAVA and whose age is 18 or greater:",
                ListManager.getStudentsInCourseWithAgeGreaterOrEqual(students, "JAVA", 18));
    }
}

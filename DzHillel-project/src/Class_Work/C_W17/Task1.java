package Class_Work.C_W17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Task1 {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3 , 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2 , 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1 , 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4 , 7);
        Student st5 = new Student("Mariya", 'f', 23, 3 , 9.1);

        List<Student> students = new ArrayList<>();
        Collections.addAll(students, st1, st2, st3, st4, st5);

        testStudents(students, (Student s) -> {
            return s.getAge() < 30;
        });
        System.out.println("=".repeat(25));
        testStudents(students, (Student student) -> {
            return student.getSex() == 'f';
        });

    }

    static void testStudents(List<Student> list, StudentChecks studentChecks) {
        for (Student s : list) {
            if (studentChecks.check(s)) {
                System.out.println(s);
            }
        }
    }
//    static void printStudentsOverGrade(List<Student> a1, double grade) {
//        for (Student s : a1) {
//            if (s.getAvgGrade() > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    static void printStudentsUnderAge(List<Student> a1, int age) {
//        for (Student s : a1) {
//            if (s.getAge() < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    static void printStudentsMixCondition(List<Student> a1, int age, double grade, char sex) {
//        for (Student s : a1) {
//            if (s.getAge() > age && s.getAvgGrade() < grade && s.getSex() == sex) {
//                System.out.println(s);
//            }
//        }
//    }

}
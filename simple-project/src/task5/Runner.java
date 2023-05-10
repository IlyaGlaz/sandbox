package task5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] students = new Student[] {new Student(), new Student(), new Student()};

        List<Student> students1 = List.of(students);
        System.out.println(students1);
    }

    public static void changeStudent(Student student) {
        student.setAge(100);
        student.setTeacher(new Teacher());
    }

    public static void changePrim(int num) {
        num+=100;
    }
}

package task5;

public class Student implements Cloneable {

    int age;
    Teacher teacher;

    public Student(int age, Teacher teacher) {
        this.age = age;
        this.teacher = teacher;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = new Student();
        student.setAge(this.age);
        Teacher teacher1 = new Teacher();
        student.setTeacher(new Teacher(this.teacher.age));


        return student;
    }
}

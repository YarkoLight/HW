package Collection2s;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student {
	

    private String name;
    private int courseNumber;


    public Student(String name, int courseNumber) {
        this.name = name;
        this.courseNumber = courseNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public static void printStudent(List<Student> studentList) {


        Iterator<Student> studentIterator = studentList.iterator();

        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println(student);
        }
    }

    public static void sortStudentByCourseNumber(List<Student> studentList) {
        Collections.sort(studentList, new SortStudentByCourse());
    }

    public static void sortStudentByCourseName(List<Student> studentList) {
        Collections.sort(studentList, new SortStudentByName());
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseNumber=" + courseNumber +
                '}';
}
	
	

}

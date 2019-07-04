package Collection2s;

import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void main(String [] args){

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Liubomyr",357));
        studentList.add(new Student("Petro",400));
        studentList.add(new Student("Sanek",348));

        System.out.println("Student list without sorting:");
        Student.printStudent(studentList);

        Student.sortStudentByCourseNumber(studentList);
        System.out.println();
        System.out.println("Student list sorted by course number:");
        Student.printStudent(studentList);

        Student.sortStudentByCourseName(studentList);
        System.out.println();
        System.out.println("Student list sorted by name:");
        Student.printStudent(studentList);

    }


}

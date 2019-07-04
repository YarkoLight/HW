package Collection2s;

import java.util.Comparator;

public class SortStudentByCourse implements Comparator<Student> {
	
	@Override
    public int compare(Student o1, Student o2) {
        return o1.getCourseNumber() - o2.getCourseNumber();
}

}

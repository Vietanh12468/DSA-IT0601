package StudentManagement;

import java.util.ArrayList;

public class ArrayListEditStudent {
    public void editStudent(ArrayList<Student> students, int position, Student object){
        students.set(position,object);
    }
    public void editStudentById(ArrayList<Student> students, String id, Student object){
        for (int i = 0; i < students.size(); i++){
            Student std = students.get(i);
            if (std.ID.equals(id)){
                students.set(i, object);
            }
        }
    }
}

package StudentManagement;

import java.util.ArrayList;

public class ArrayListRemoveStudent {
    public void removeStudentById(ArrayList<Student> students, String id){
        for (int i = 0; i < students.size(); i++){
            Student std = students.get(i);
            if (std.ID.equals(id)){
                students.remove(i);
            }
        }
    }
}

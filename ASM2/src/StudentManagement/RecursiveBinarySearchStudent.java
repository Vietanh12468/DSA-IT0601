package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;

public class RecursiveBinarySearchStudent {
    public int RecursiveBinarySearch(ArrayList<Student> students, String Name, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = (start +end)/2;
        if(Objects.equals(students.get(mid).fullName, Name)){
            return mid;
        }
        int compareStr = students.get(mid).fullName.compareToIgnoreCase(Name);
        if(compareStr < 0){
            return RecursiveBinarySearch(students, Name, start, mid - 1);
        } else if (compareStr > 0)
        {
            return RecursiveBinarySearch(students, Name, mid + 1, end);
        }
    return -1;
    }
}

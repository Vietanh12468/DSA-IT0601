package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;

public class BinaryListSearchStudent {
    public int binarySearch(ArrayList<Student> students, String ID){
        int left = 0;
        int right = students.size() - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(Objects.equals(students.get(mid).ID, ID)){
                return mid;
            }
            int compareStr = students.get(mid).ID.compareToIgnoreCase(ID);
            if(compareStr < 0){
                left = mid + 1;
            } else if (compareStr > 0)
            {
                right = mid -1;
            }
        }
        return -1;
    }
}

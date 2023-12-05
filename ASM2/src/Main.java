import StudentManagement.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayListAddStudent st = new ArrayListAddStudent();
        System.out.println("Add student");
        st.addStudent(students, new Student("BH001", "Nguyen Van A", 5F));
        st.addStudent(students, new Student("BH002", "Nguyen Van B", 2F));
        st.addStudent(students, new Student("BH003", "Nguyen Van C", 6F));
        st.addStudent(students, new Student("BH005", "Nguyen Van D", 9F));
        st.addStudent(students, new Student("BH010", "Nguyen Van O", 8F));
        st.addStudent(students, new Student("BH012", "Nguyen Van P", 1F));
        st.addStudent(students, new Student("BH017", "Nguyen Van M", 3F));
        st.addStudent(students, new Student("BH022", "Nguyen Van A", 5F));
        st.addStudent(students, new Student("BH032", "Nguyen Van B", 2F));
        st.addStudent(students, new Student("BH044", "Nguyen Van C", 6F));
        st.addStudent(students, new Student("BH053", "Nguyen Van D", 9F));
        st.addStudent(students, new Student("BH063", "Nguyen Van O", 8F));
        st.addStudent(students, new Student("BH071", "Nguyen Van P", 1F));
        st.addStudent(students, new Student("BH072", "Nguyen Van M", 3F));
        st.addStudent(students, new Student("BH073", "Nguyen Van A", 5F));
        st.addStudent(students, new Student("BH075", "Nguyen Van B", 2F));
        st.addStudent(students, new Student("BH079", "Nguyen Van C", 6F));
        st.addStudent(students, new Student("BH098", "Nguyen Van D", 9F));
        st.addStudent(students, new Student("BH099", "Nguyen Van O", 8F));
        st.addStudent(students, new Student("BH101", "Nguyen Van P", 1F));
        st.addStudent(students, new Student("BH122", "Nguyen Van M", 3F));
        System.out.println("List of student");
        for (Student s: students){
            System.out.println("ID = " + s.ID + ", fullName = " + s.fullName + ", mark = " +s.marks + ", rank = " + s.ranks);
        }

        System.out.println("Edit student");
        ArrayListEditStudent edit = new ArrayListEditStudent();
        edit.editStudentById(students, "BH001", new Student("BH000", "Nguyen Van X", 5F));
        System.out.println("New List of student");
        for (Student s: students){
            System.out.println("ID = " + s.ID + ", fullName = " + s.fullName + ", mark = " +s.marks + ", rank = " + s.ranks);
        }

        System.out.println("Remove student");
        ArrayListRemoveStudent rmv = new ArrayListRemoveStudent();
        rmv.removeStudentById(students, "BH003");
        System.out.println("New list of student");
        for (Student s: students){
            System.out.println("ID = " + s.ID + ", fullName = " + s.fullName + ", mark = " +s.marks + ", rank = " + s.ranks);
        }

        BinaryListSearchStudent bnr = new BinaryListSearchStudent();
        int findSt = bnr.binarySearch(students,"BH005");
        if (findSt == -1) {
            System.out.println("Can not found BH005");
        }
        else  {
            System.out.println("Found BH005");
        }

//        RecursiveBinarySearchStudent rcbnr = new RecursiveBinarySearchStudent ();
//        int findStN = rcbnr.RecursiveBinarySearch(students,"Nguyen Van D", 0, students.size());
//        if (findStN == -1) {
//            System.out.println("Can not found Nguyen Van D");
//        }
//        else  {
//            System.out.println("Found Nguyen Van D");
//        }

        System.out.println("************** Sort Student by name ******************");
        Collections.sort(students, Student.FullNameStduComparator);
        System.out.println("************** After Sort ******************");
        for (Student str : students){
            System.out.println(str);
        }

        System.out.println("************** Sort Student by ID ******************");
        Collections.sort(students, Student.IdStudentComparator);
        System.out.println("************** After Sort ******************");
        for (Student str : students){
            System.out.println(str);
        }

        System.out.println("************** Sort Student by Mark ******************");
        Collections.sort(students, Student.MarkStduComparator);
        System.out.println("************** After Sort ******************");
        for (Student str : students){
            System.out.println(str);
        }





        System.out.println("************** Sort Student by name ******************");
        Collections.sort(students, Student.getStudentComparator("fullName"));
        System.out.println("************** After Sort ******************");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("************** Sort Student by ID ******************");
        Collections.sort(students, Student.getStudentComparator("id"));
        System.out.println("************** After Sort ******************");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("************** Sort Student by Mark ******************");
        Collections.sort(students, Student.getStudentComparator("mark"));
        System.out.println("************** After Sort ******************");
        for (Student student : students) {
            System.out.println(student);
        }



        ValidateInput vlin = new ValidateInput();
        Float markScore1 = 9f;
        String Namestd1 = "Nguyen Thi V";
        String IDstd1 = "BH111";
        String validationResult = vlin.validateInput(markScore1, IDstd1, Namestd1, students);
        System.out.println("Validation Code: " + validationResult);

    }
}
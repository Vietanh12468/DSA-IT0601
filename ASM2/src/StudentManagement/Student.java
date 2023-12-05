package StudentManagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Student
    {
    public String fullName;
    public String ID;
    public Float marks;
    public String ranks;
    public Student(String ID, String fullName, Float marks){
        this.ID = ID;
        this.fullName = fullName;
        this.marks = marks;
        if(this.marks >=0F && this.marks < 5F){
            this.ranks = "Fail";
        }
        else if(this.marks >=5F && this.marks < 6.5F){
            this.ranks = "Medium";
        }
        else if(this.marks >=6.5F && this.marks < 7.5F){
            this.ranks = "Good";
        }
        else if(this.marks >=7.5F && this.marks < 9F){
            this.ranks = "Very Good";
        }
        else if(this.marks >=9F && this.marks < 10F){
            this.ranks = "Excellent";
        }
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getID(){
        return ID;
    }
    public void SetID(String ID){
        this.ID= ID;
    }
    public Float getMark(){
        return marks;
    }
    public void setMark(Float Mark){
        this.marks= Mark;
    }


    public static Comparator<Student> IdStudentComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String idStu1 = o1.getID().toUpperCase();
            String idStu2 = o2.getID().toUpperCase();
            return  idStu1.compareTo(idStu2);
        }
    };

    public static Comparator<Student> FullNameStduComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String fullName1 = o1.getFullName().toUpperCase();
            String fullName2 = o2.getFullName().toUpperCase();
            return fullName1.compareTo(fullName2);
        }
    };

    public static Comparator<Student> MarkStduComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            Float mark1 = o1.getMark();
            Float mark2 = o2.getMark();
            if (mark1< mark2){
                return -1;
            }
            else if (mark2< mark1){
                return 1;
            }
            return 0;
        }
    };


    public static Comparator<Student> getStudentComparator(String sortBy) {
        return (o1, o2) -> {
            switch (sortBy) {
                case "id" -> {
                    String idStu1 = o1.getID().toUpperCase();
                    String idStu2 = o2.getID().toUpperCase();
                    return idStu1.compareTo(idStu2);
                }
                case "fullName" -> {
                    String fullName1 = o1.getFullName().toUpperCase();
                    String fullName2 = o2.getFullName().toUpperCase();
                    return fullName1.compareTo(fullName2);
                }
                case "mark" -> {
                    Float mark1 = o1.getMark();
                    Float mark2 = o2.getMark();
                    return mark1.compareTo(mark2);
                }
                default -> throw new IllegalArgumentException("Invalid sort criteria: " + sortBy);
            }
        };
    }

    @Override
    public String toString() {
        return "[ID = "+ ID +" , fullName = " + fullName + ", mark = " + marks + ", rank = " + ranks +" ]";
    }
}

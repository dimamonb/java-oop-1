package oothinking.course;

import java.util.Objects;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        String[] newStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, newStudents, 0, numberOfStudents);
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student) {
        if(numberOfStudents == students.length){
            String[] largerStudents = new String[students.length*2+1];
            System.arraycopy(student, 0, largerStudents, 0, students.length);
            students = largerStudents;
        }
        if(numberOfStudents < students.length){
            students[numberOfStudents] = student;
            numberOfStudents++;
        }
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if(Objects.equals(students[i], student)){
                students[i] = students[numberOfStudents-1];
                i--;
            }
        }
        numberOfStudents--;
    }

    public void clear() {
        for (int i = 0; i < numberOfStudents; i++)
            students[i] = null;
        numberOfStudents = 0;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class DescendingStudentComparator implements Comparator<StudentsClass> {

    @Override
    public int compare(StudentsClass student1, StudentsClass student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

public class StudentsCollectionRunner {
    public static void main(String[] args) {

        ArrayList<StudentsClass> studentsClasses = new ArrayList<>();

        studentsClasses.add(new StudentsClass(3, "sasanka"));
        studentsClasses.add(new StudentsClass(1, "chintam"));
        studentsClasses.add(new StudentsClass(2, "test"));

        System.out.println(studentsClasses);

        //It works only classes that implement Comparable Interface
        Collections.sort(studentsClasses);

        System.out.println("Ascending Order" + studentsClasses);

        Collections.sort(studentsClasses, new DescendingStudentComparator());

        System.out.println("Descending Order" + studentsClasses);

        studentsClasses.sort(new DescendingStudentComparator());

        System.out.println(studentsClasses);


    }
}

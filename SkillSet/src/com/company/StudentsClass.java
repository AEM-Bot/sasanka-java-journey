package com.company;

public class StudentsClass implements Comparable<StudentsClass> {

    private int id;
    private String name;

    public StudentsClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentsClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //always that in the compareTo parameter
    //ascending order
    @Override
    public int compareTo(StudentsClass that) {
        //increase order of id
        return Integer.compare(this.id, that.id);
    }
}

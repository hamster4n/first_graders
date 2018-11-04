package model;

import java.util.ArrayList;

public class Group {
    private int id;
    private String groupName;
    private ArrayList<Student> studentList;

    public Group(int id, String groupName, ArrayList<Student> studentList) {
        this.id = id;
        this.groupName = groupName;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "groupName = " + groupName;
    }
}

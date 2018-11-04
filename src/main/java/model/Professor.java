package model;

import utils.Utils;

import java.util.ArrayList;

public class Professor extends InstituteParticipant {
    private int experience;
    private Faculty faculty;

    public Professor(Long id, String firstName, String secondName, int age, Gender gender, int experience, Faculty faculty) {
        super(id, firstName, secondName, age, gender);
        this.experience = experience;
        this.faculty = faculty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "experience=" + experience +
                ", faculty=" + faculty;
    }

}

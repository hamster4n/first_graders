package model;

public class Student extends InstituteParticipant {
    private int instituteCourse;
    private Faculty faculty;
    private String groupName;
    private int averageEvaluation;
    private boolean isDesireToBeHeadmen;
    private boolean isHeadmen;
    private boolean isHere;

    public Student(Long id, String firstName, String secondName, int age, Gender gender, int instituteCourse, Faculty faculty, String groupName, int avarageEvaluation, boolean isDesireToBeHeadmen, boolean isHeadmen, boolean isHere) {
        super(id, firstName, secondName, age, gender);
        this.instituteCourse = instituteCourse;
        this.faculty = faculty;
        this.groupName = groupName;
        this.averageEvaluation = avarageEvaluation;
        this.isDesireToBeHeadmen = isDesireToBeHeadmen;
        this.isHeadmen = isHeadmen;
        this.isHere = isHere;
    }

    public int getInstituteCourse() {
        return instituteCourse;
    }

    public void setInstituteCourse(int instituteCourse) {
        this.instituteCourse = instituteCourse;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getAverageEvaluation() {
        return averageEvaluation;
    }

    public void setAverageEvaluation(int averageEvaluation) {
        this.averageEvaluation = averageEvaluation;
    }

    public boolean isDesireToBeHeadmen() {
        return isDesireToBeHeadmen;
    }

    public void setDesireToBeHeadmen(boolean desireToBeHeadmen) {
        isDesireToBeHeadmen = desireToBeHeadmen;
    }

    public boolean isHeadmen() {
        return isHeadmen;
    }

    public void setHeadmen(boolean headmen) {
        isHeadmen = headmen;
    }

    public boolean isHere() {
        return isHere;
    }

    public void setHere(boolean here) {
        isHere = here;
    }

    @Override
    public String toString() {
        return super.toString() +
                "instituteCourse=" + instituteCourse +
                ", faculty=" + faculty +
                ", groupName='" + groupName + '\'' +
                ", averageEvaluation=" + averageEvaluation +
                ", isDesireToBeHeadmen=" + isDesireToBeHeadmen +
                ", isHeadmen=" + isHeadmen +
                ", isHere=" + isHere;
    }
}

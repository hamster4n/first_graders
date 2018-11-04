package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InstituteParticipant {
    private Long id;
    private String firstName;
    private String secondName;
    private int age;
    private Gender gender;

    public InstituteParticipant(Long id, String firstName, String secondName, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", gender=" + gender + ", ";
    }
}

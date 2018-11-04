package utils;

import model.*;

import java.util.ArrayList;

public class Utils {


//    public static ArrayList<InstituteParticipant> createNewListOfParticipant(){
//        ArrayList<InstituteParticipant> participantList = new ArrayList<InstituteParticipant>();
//        participantList.add(new Professor(1L, "Ivan", "Urgant", 39, Gender.MALE, 8, Faculty.JAVA ));
//        participantList.add(new Professor(2L, "Konstantin", "Efremov", 45, Gender.MALE, 12, Faculty.JAVA ));
//        participantList.add(new Professor(3L, "Irina", "Vasileva", 40, Gender.FEMALE, 7, Faculty.PHP ));
//        participantList.add(new Professor(4L, "Ekaterina", "Ostafeva", 49, Gender.FEMALE, 15, Faculty.JS ));
//        participantList.add(new Professor(5L, "Serafima", "Kuznecova", 37, Gender.FEMALE, 5, Faculty.JS ));
//
//        //group 1JAVA1
//        participantList.add(new Student(10L, "Andrey", "Kugel", 18, Gender.MALE, 1, Faculty.JAVA, "1JAVA1", 11, false, false, true));
//        participantList.add(new Student(11L, "Olga", "Sverdlova", 18, Gender.FEMALE, 1, Faculty.JAVA, "1JAVA1", 9, true, false, true));
//        participantList.add(new Student(12L, "Sergey", "Uljanov", 18, Gender.MALE, 1, Faculty.JAVA, "1JAVA1", 7, false, false, true));
//        participantList.add(new Student(13L, "Antonina", "Kikvidze", 18, Gender.FEMALE, 1, Faculty.JAVA, "1JAVA1", 11, true, false, false));
//        participantList.add(new Student(14L, "Alexandr", "Osipov", 18, Gender.MALE, 1, Faculty.JAVA, "1JAVA1", 10, false, false, false));
//
//        //group 2JAVA1
//        participantList.add(new Student(20L, "Stepan", "Stepanov", 19, Gender.MALE, 2, Faculty.JAVA, "2JAVA1", 12, true, false, false));
//        participantList.add(new Student(21L, "Irina", "Stepanova", 19, Gender.FEMALE, 2, Faculty.JAVA, "2JAVA1", 7, true, false, true));
//        participantList.add(new Student(22L, "Tatjana", "Orlova", 19, Gender.FEMALE, 2, Faculty.JAVA, "2JAVA1", 10, false, false, true));
//        participantList.add(new Student(23L, "Andrey", "Razin", 19, Gender.MALE, 2, Faculty.JAVA, "2JAVA1", 11, false, false, true));
//        participantList.add(new Student(24L, "Bogdan", "Vanchugov", 19, Gender.MALE, 2, Faculty.JAVA, "2JAVA1", 12, true, false, true));
//
//        //group 1PHP1
//        participantList.add(new Student(31L, "Svetlana", "Ivleva", 18, Gender.FEMALE, 1, Faculty.PHP, "1PHP1", 8, false, false, true));
//        participantList.add(new Student(32L, "Elisey", "Kurbanov", 18, Gender.MALE, 1, Faculty.PHP, "1PHP1", 9, false, false, true));
//        participantList.add(new Student(33L, "Svjatoslav", "Vakarchuk", 18, Gender.MALE, 1, Faculty.PHP, "1PHP1", 8, true, false, true));
//        participantList.add(new Student(34L, "Ivanna", "Druz", 18, Gender.FEMALE, 1, Faculty.PHP, "1PHP1", 9, true, false, true));
//
//        //group 2PHP1
//        participantList.add(new Student(41L, "Katerina", "Buzova", 19, Gender.FEMALE, 2, Faculty.PHP, "2PHP1", 11, true, false, true));
//        participantList.add(new Student(42L, "Olga", "Lepestkova", 19, Gender.FEMALE, 2, Faculty.PHP, "2PHP1", 11, true, false, true));
//        participantList.add(new Student(43L, "Svetlana", "Sinichkina", 19, Gender.FEMALE, 2, Faculty.PHP, "2PHP1", 11, true, false, true));
//        participantList.add(new Student(44L, "Irina", "Bevzo", 19, Gender.FEMALE, 2, Faculty.PHP, "2PHP1", 10, true, false, false));
//
//        //group 3JS1
//        participantList.add(new Student(51L, "Djon", "Voo", 20, Gender.MALE, 3, Faculty.JS, "3JS1", 7, false, false, false));
//        participantList.add(new Student(52L, "Bill", "Black", 20, Gender.MALE, 3, Faculty.JS, "3JS1", 7, false, false, false));
//        participantList.add(new Student(53L, "Stan", "Murray", 20, Gender.MALE, 3, Faculty.JS, "3JS1", 6, false, false, false));
//
//
//        //group 3JS2
//        participantList.add(new Student(61L, "Catrine", "Denev", 20, Gender.FEMALE, 3, Faculty.JS, "3JS2", 11, false, false, false));
//        participantList.add(new Student(62L, "Oliver", "Twister", 20, Gender.MALE, 3, Faculty.JS, "3JS2", 11, false, false, false));
//        participantList.add(new Student(63L, "Smith", "White", 20, Gender.MALE, 3, Faculty.JS, "3JS2", 11, false, false,false));
//
//        return participantList;
//    }

//    public static ArrayList<Professor> getProfessorList(ArrayList<InstituteParticipant> list){
//        ArrayList<Professor> professors = new ArrayList<Professor>();
//        for (InstituteParticipant participant: list) {
//            if (participant instanceof Professor){professors.add((Professor) participant);}
//        }
//        return professors;
//    }

    public static ArrayList<Professor> getProfessorList(){
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(new Professor(1L, "Ivan", "Urgant", 39, Gender.MALE, 8, Faculty.JAVA ));
        professors.add(new Professor(2L, "Konstantin", "Efremov", 45, Gender.MALE, 12, Faculty.JAVA ));
        professors.add(new Professor(3L, "Irina", "Vasileva", 40, Gender.FEMALE, 7, Faculty.PHP ));
        professors.add(new Professor(4L, "Ekaterina", "Ostafeva", 49, Gender.FEMALE, 15, Faculty.JS ));
        professors.add(new Professor(5L, "Serafima", "Kuznecova", 37, Gender.FEMALE, 5, Faculty.JS ));
        return professors;
    }

    private static ArrayList<Student> get1JAVA1List(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(10L, "Andrey", "Kugel", 18, Gender.MALE, 1, Faculty.JAVA, "1JAVA1", 11, false, false, true));
        students.add(new Student(11L, "Olga", "Sverdlova", 18, Gender.FEMALE, 1, Faculty.JAVA, "1JAVA1", 9, true, false, true));
        students.add(new Student(12L, "Sergey", "Uljanov", 18, Gender.MALE, 1, Faculty.JAVA, "1JAVA1", 7, false, false, true));
        students.add(new Student(13L, "Antonina", "Kikvidze", 18, Gender.FEMALE, 1, Faculty.JAVA, "1JAVA1", 11, true, false, false));
        students.add(new Student(14L, "Alexandr", "Osipov", 18, Gender.MALE, 1, Faculty.JAVA, "1JAVA1", 10, false, false, false));
        return students;
    }

    public static Group get1JAVA1Group(){
        return new Group(1, "1JAVA1", get1JAVA1List());
    }

    private static ArrayList<Student> get2JAVA1List(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(20L, "Stepan", "Stepanov", 19, Gender.MALE, 2, Faculty.JAVA, "2JAVA1", 12, true, false, false));
        students.add(new Student(21L, "Irina", "Stepanova", 19, Gender.FEMALE, 2, Faculty.JAVA, "2JAVA1", 7, true, false, true));
        students.add(new Student(22L, "Tatjana", "Orlova", 19, Gender.FEMALE, 2, Faculty.JAVA, "2JAVA1", 10, false, false, true));
        students.add(new Student(23L, "Andrey", "Razin", 19, Gender.MALE, 2, Faculty.JAVA, "2JAVA1", 11, false, false, true));
        students.add(new Student(24L, "Bogdan", "Vanchugov", 19, Gender.MALE, 2, Faculty.JAVA, "2JAVA1", 12, true, false, true));
        return students;
    }

    public static Group get2JAVA1Group(){
        return new Group(2, "2JAVA1", get2JAVA1List());
    }

    private static ArrayList<Student> get1PHP1List(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(31L, "Svetlana", "Ivleva", 18, Gender.FEMALE, 1, Faculty.PHP, "1PHP1", 8, false, false, true));
        students.add(new Student(32L, "Elisey", "Kurbanov", 18, Gender.MALE, 1, Faculty.PHP, "1PHP1", 9, false, false, true));
        students.add(new Student(33L, "Svjatoslav", "Vakarchuk", 18, Gender.MALE, 1, Faculty.PHP, "1PHP1", 8, true, false, true));
        students.add(new Student(34L, "Ivanna", "Druz", 18, Gender.FEMALE, 1, Faculty.PHP, "1PHP1", 9, true, false, true));
        return students;
    }

    public static Group get1PHP1Group(){
        return new Group(3, "1PHP1", get1PHP1List());
    }

    private static ArrayList<Student> get2PHP1List(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(41L, "Katerina", "Buzova", 19, Gender.FEMALE, 2, Faculty.PHP, "2PHP1", 11, true, false, true));
        students.add(new Student(42L, "Olga", "Lepestkova", 19, Gender.FEMALE, 2, Faculty.PHP, "2PHP1", 11, true, false, true));
        students.add(new Student(43L, "Svetlana", "Sinichkina", 19, Gender.FEMALE, 2, Faculty.PHP, "2PHP1", 11, true, false, true));
        students.add(new Student(44L, "Irina", "Bevzo", 19, Gender.FEMALE, 2, Faculty.PHP, "2PHP1", 10, true, false, false));
        return students;
    }

    public static Group get2PHP1Group(){
        return new Group(4, "2PHP1", get2PHP1List());
    }

    private static ArrayList<Student> get3JS1List(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(51L, "Djon", "Voo", 20, Gender.MALE, 3, Faculty.JS, "3JS1", 7, false, false, false));
        students.add(new Student(52L, "Bill", "Black", 20, Gender.MALE, 3, Faculty.JS, "3JS1", 7, false, false, false));
        students.add(new Student(53L, "Stan", "Murray", 20, Gender.MALE, 3, Faculty.JS, "3JS1", 6, false, false, false));
        return students;
    }

    public static Group get3JS1Group(){
        return new Group(5, "3JS1", get3JS1List());
    }

    private static ArrayList<Student> get3JS2List(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(61L, "Catrine", "Denev", 20, Gender.FEMALE, 3, Faculty.JS, "3JS2", 11, false, false, false));
        students.add(new Student(62L, "Oliver", "Twister", 20, Gender.MALE, 3, Faculty.JS, "3JS2", 11, false, false, false));
        students.add(new Student(63L, "Smith", "White", 20, Gender.MALE, 3, Faculty.JS, "3JS2", 11, false, false,false));
        return students;
    }

    public static Group get3JS2Group(){
        return new Group(6, "3JS2", get3JS2List());
    }

    public static ArrayList<Group> getGroupList(){
        ArrayList<Group> groups = new ArrayList<>();
        groups.add(get1JAVA1Group());
        groups.add(get2JAVA1Group());
        groups.add(get1PHP1Group());
        groups.add(get2PHP1Group());
        groups.add(get3JS1Group());
        groups.add(get3JS2Group());
        return groups;
    }

    //перекличка
    public  static void muster(Group group){
        ArrayList<Student> students = group.getStudentList();
        ArrayList<Student> presents = new ArrayList<Student>();
        ArrayList<Student> absents = new ArrayList<Student>();
        int presentCount = 0;
        int absentCount = 0;
        for (Student student : students) {
            if (student.isHere()) {
                presents.add(student);
                presentCount++;
            } else {
                absents.add(student);
                absentCount++;
            }
        }
        System.out.println(" присутствует: " + presentCount + " и отсутствует: " + absentCount);
        System.out.println("Список присутствующих: ");
        Utils.printStudentList(presents);
        System.out.println("Список отсутствующих: ");
        Utils.printStudentList(absents);
    }

    public static void getHeadman(Group group){
        //смотрим в группе по списку есть ли желающие. Если желающий единственный, то он и становится старостой.
        //если желающих несколько, то старостой становится студент с максимальным балом
        //если желающих нет, то старостой становится первый в списке с максимальный баллом
        ArrayList<Student> students = group.getStudentList();
        Student lucky;

        ArrayList<Student> desireToBeHeadmen = new ArrayList<>();
        for (Student student: students) {
            student.setHeadmen(false);
            if (student.isDesireToBeHeadmen()){
                desireToBeHeadmen.add(student);
            }
        }
        if (desireToBeHeadmen.size() == 0){
            //если желающих нет, то выбрать любого с максимальным баллом из students
            lucky = getStudentWithBiggestAverageEvaluation(students);
        } else if (desireToBeHeadmen.size() == 1){
            //если желающий единственный
            lucky = desireToBeHeadmen.get(0);
        } else {
            //если желающих много, то выбрать любого с максимальным баллом из desireToBeHeadmen
            lucky = getStudentWithBiggestAverageEvaluation(desireToBeHeadmen);
        }
        lucky.setHeadmen(true);
        System.out.println(lucky.toString());
    }

    private static Student getStudentWithBiggestAverageEvaluation(ArrayList<Student> students){
        int numberOfStudentWithBiggestAverageEvaluation = 0;
        int evaluation = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageEvaluation() > evaluation){
                evaluation = students.get(i).getAverageEvaluation();
                numberOfStudentWithBiggestAverageEvaluation = i;
            }
        }
        return students.get(numberOfStudentWithBiggestAverageEvaluation);
    }

//    public static ArrayList<Student> getGroup(ArrayList<InstituteParticipant> list, String groupName){
//        ArrayList<Student> students = new ArrayList<Student>();
//        for (InstituteParticipant participant :list) {
//            if (participant instanceof Student && ((Student) participant).getGroupName().equals(groupName)){
//                students.add((Student)participant);
//            }
//        }
//        return students;
//    }


    //TODO сделать универсальный printList
    public static void printProfessorList(ArrayList<Professor> list){
        for (Professor professor: list) {
            System.out.println(professor.toString());
        }
    }

    private static void printStudentList(ArrayList<Student> list){
        for (Student student: list) {
            System.out.println(student.toString());
        }
    }

    public static void printGroupList(ArrayList<Group> list){
        for (Group group: list){
            System.out.println(group.toString());
        }
    }

    //сократить и переместить в класс CommandType  TODO
    public static void printHelpInfo(){
        System.out.println("**********HelpInfo**********");
        System.out.println("список профессоров: profList");
        System.out.println("список групп: groupList");
        System.out.println("список конкретной группы (вместо groupName поставь имя группы): groupNameList");
        System.out.println("----------------------------");
        System.out.println("Профессор может сделать перекличку только группы своего факультета"); //как реализовать?
        System.out.println("Профессор выбирает группу и делает перекличку так: professor.muster(groupName)" );
        System.out.println("----------------------------");
        System.out.println("Группа может выбрать старосту по ряду параметров: успеваемость и желание быть старостой");
        System.out.println("Если кандидатов несколько, то старостой становиться первый в списке");
        System.out.println("Выбирают старосту так: groupName.getHeadman"); //TODO
    }


}

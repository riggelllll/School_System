package Konyukhov.Org.users;


import java.util.Calendar;

public abstract class Person {
    protected String firstName;
    protected String secondName;
    protected String nationality;
    protected String sex;
    protected Calendar birthDate;
    protected int id;
    protected int accessLevel;

    Person(String firstName, String secondName, String nationality, String sex, Calendar birthDate, int id, int accessLevel){
        this.firstName = firstName;
        this.secondName = secondName;
        this.nationality = nationality;
        this.sex = sex;
        this.birthDate = birthDate;
        this.id = id;
        this.accessLevel = accessLevel;
    }

}

package Konyukhov.Org.users;


import java.util.Calendar;

public abstract class Person {
    protected String firstName;
    protected String secondName;
    protected String nationality;
    protected String sex;
    protected Calendar birthDate;
    protected int id;



    Person(String firstName, String secondName, String nationality, String sex, Calendar birthDate, int id){
        this.firstName = firstName;
        this.secondName = secondName;
        this.nationality = nationality;
        this.sex = sex;
        this.birthDate = birthDate;
        this.id = id;
    }

}

package Konyukhov.Org.users;

import java.util.Calendar;

public class Pupil extends Person {

   Pupil(String firstName, String secondName, String nationality, String sex, Calendar birthDate, int id, int accessLevel){
       super(firstName, secondName, nationality, sex, birthDate, id, accessLevel);
   }
}

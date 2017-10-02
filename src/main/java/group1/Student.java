package group1;

import org.joda.time.DateTime;
import org.joda.time.Years;

public class Student {

    String name;
    DateTime DOB;
    int id;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public void setId(int ID) {
        this.id = ID;
    }

    private int getAge(DateTime DOB) {
        DateTime now = new DateTime();
        Years age = Years.yearsBetween(DOB, now);
        return age.getYears();
    }

    public String getName() {
        return this.name;
    }

    public DateTime getDOB() {
        return this.DOB;
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        String username = name + age;
        return username;
    }

}

package group1;

import org.joda.time.DateTime;

public class Student {

    String name;
    DateTime DOB;
    int id;
    String username;

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public void setId(int ID) {
        this.id = ID;
    }

    public void setUsername(String username) {
        this.username = username;
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
        return this.username;
    }

}

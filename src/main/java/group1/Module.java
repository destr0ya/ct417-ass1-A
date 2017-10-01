package group1;

import java.util.ArrayList;
import java.util.List;

public class Module {

    String name;
    String id;
    List<Student> students = new ArrayList<Student>();

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public String studentsToString() {
        String studentString = "";
        for(Student student: students) {
            studentString += student.getName() + ", ";
        }
        return studentString;
    }

}

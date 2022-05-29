package ThucHanh2;

import java.util.Date;

public class Student {
    private String name;
    private int Id;
    private Date DateOfBirth;
    private String grade;

    public Student() {
    }

    public Student(String name, int id, Date dateOfBirth, String grade) {
        this.name = name;
        Id = id;
        DateOfBirth = dateOfBirth;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", DateOfBirth=" + DateOfBirth +
                ", grade='" + grade + '\'' +
                '}';
    }

}

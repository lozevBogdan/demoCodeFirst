package entities.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends Person {
    public double getGrade() {
        return grade;
    }

    @Column(name = "grade")
    public void setGrade(double grade) {
        this.grade = grade;
    }

    double grade;

    public Student() {

    }
}

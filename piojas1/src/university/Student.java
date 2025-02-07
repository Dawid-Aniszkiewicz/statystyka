package university;

import java.util.Objects;

public class Student {
    public String name;
    public double grade;

    public Student( String name,double grade) {
        this.grade = grade;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this==o)return true;
        if (!(o instanceof Student student)) return false;
        return Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}


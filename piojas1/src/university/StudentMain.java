package university;

import java.util.Arrays;
import java.util.List;

public class StudentMain {
    public static void main(String[]args){
        List<Student> st= Arrays.asList(
                new Student("Alice", 4.5),
                new Student("Bob", 3.0),
                new Student("Charlie", 4.5),
                new Student("Alice", 4.5),
                new Student("David", 2.5)
        );
        Student cel = new Student("Alice", 4.5);
        int count = Metody.countElements(st,cel);
        System.out.println("liczba="+cel+":"+count);
    }
}

package echo;

import java.util.Objects;


    class Student{
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if(this ==o)return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return age == student.age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
        public class maintest {

    }
    public static <T> void echoIfEquivalent(T e1,T e2,T e3) {
        if (e1.equals(e2) && e2.equals(e3)) {
            System.out.println("wyniki sa rowne");
        } else {
            System.out.println("wyniki sa rozne");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 20);
        Student s3 = new Student("Charlie", 20);

        Student s4 = new Student("David", 22);
        Student s5 = new Student("Eve", 23);
        echoIfEquivalent(s1,s2,s3);
        echoIfEquivalent(s3,s4,s5);
        }

}

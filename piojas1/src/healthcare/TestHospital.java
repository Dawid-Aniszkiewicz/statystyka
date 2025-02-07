package healthcare;

public class TestHospital {
    public static class Main {
        public static void main(String[] args) {
            Hospital a = new Hospital("szpital1", 23.1);
            Hospital b = new Hospital("szpital1", 23.1);
            Hospital c = new Hospital("szpital2", 12.2);
            Clinic c1 = new Clinic("klinika1", 12.1, 3);
            Clinic c2 = new Clinic("klinika1", 12.1, 3);
        System.out.println(c1.equals(c));
        System.out.println(a.equals(b));
        System.out.println(b.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c1.equals(c2));


        }
    }
}

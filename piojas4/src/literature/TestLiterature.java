package literature;

public class TestLiterature {
    public static void main(String[] args) {
        double[]rat1={2.0,3.0,4.0};
        double[]rat2={1.0,5.0,2.0};
        Novel n1=new Novel("n1","rudy",rat1);
        Novel n2=new Novel("n2","rudycham",rat2);
        n2.addRating(4.0);
        n1.removeRating(3.0);
        System.out.println(n1.getRatings());
        System.out.println(n2.getRatings());
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n1.equals(n2));
        System.out.println(n1.hashCode());
    }
}

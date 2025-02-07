package games;


public class GamesTest {
    public static void main(String[]args){
        double[] listy={12.2,12.1,14.3,10.1};
        double[] listy2={12.2,12.1,14.3,10.1,12.5,14.7};

        ComputerGame g1= new ComputerGame("  g1  ","p1",listy);
        ComputerGame g2= new ComputerGame("g2","p2",listy2);
        g1.addRating(3.21);
        g1.getRatings();
        g1.removeRating(12.2);
        g1.getRatings();
        System.out.println(g1.toString());
        System.out.println(g1.equals(g2));
        System.out.println(g1.hashCode());

    }
}

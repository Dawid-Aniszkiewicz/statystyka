package commerce;

public class TestShop {
    public static void main(String[] args) {
        Shop s1 =Shop.getInstance(12, 12, 12);
        System.out.println(s1.toString());
    }
}
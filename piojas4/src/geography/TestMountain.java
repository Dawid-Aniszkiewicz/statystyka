package geography;

import java.util.Arrays;
import java.util.ArrayList;

public class TestMountain {
    public static void main(String[] args) {
        Mountain original = new Mountain("Everest",new ArrayList(Arrays.asList(8848.86, 8848.13, 8847.93, 8848.00, 8848.45)));
        Mountain clone = original.clone();
        original.setHeight(0,8900.00);
        System.out.println("Oryginał: " + original);
        System.out.println("Klon: " + clone);

        // Sprawdzenie niezależności obiektów
        if (!original.getHeights().get(0).equals(clone.getHeights().get(0))) {
            System.out.println("Klonowanie działa poprawnie - obiekty są niezależne!");
        } else {
            System.out.println("Błąd: obiekty nie są niezależne!");
        }

    }
}

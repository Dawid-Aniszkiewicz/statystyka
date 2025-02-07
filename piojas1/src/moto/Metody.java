package moto;
import java.util.*;

public class Metody {
    public static <T extends Comparable<T>> T maxValue(T[] array){
        if(array==null || array.length==0){
           throw new IllegalArgumentException("blad");
        }
        T max = array[0];

        for(T element : array){
            if(element == null){
                throw new IllegalArgumentException("null");
            }
            if(element.compareTo(max)>0){
                max=element;
            }
        }
        return max;
    }
}

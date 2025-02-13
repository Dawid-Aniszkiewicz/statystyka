package tech;

public class Main {
    static <T extends Comparable<T>>T firstMinValue(T[] array){
        T min=array[0];
        int counter =0;
        for(T i : array){
            if(min.compareTo(i)<0){
                min=i;
            }
        }
        for(T i : array){
            if(min.compareTo(i)==0){
                counter++;
                if(counter==2){
                    throw new RuntimeException("najmniejsza wartosc sie powtarza");
                }
            }
        }
        return min;
    }
}

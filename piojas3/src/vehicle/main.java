package vehicle;

import java.util.Arrays;

public class main {
    public static <T extends Comparable<T>>boolean isDescending(T[]tab){
        if(tab==null || tab.length==0){
            throw new IllegalArgumentException("null lub pusty");
        }
        for(int i=1;i<tab.length;i++){
            if(tab[i].compareTo(tab[i-1])>0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] array1 = {9, 7, 5, 5, 3, 1};
        Integer[] array2 = {1, 3, 5, 7, 9};
        System.out.println("test1="+isDescending(array1));
        System.out.println("test2="+isDescending(array2));
    }
}

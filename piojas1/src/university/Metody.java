package university;

import java.util.*;

public class Metody {
    public static <T> int countElements(Collection<T>items,T element){
        if(items==null || element==null){
            throw new IllegalArgumentException("null");
        }
        int count=0;
        for(T item:items){
            if(item.equals(element)){
                count++;
            }
        }
        return count;
    }
}

package collections;

import java.util.TreeSet;

public class Main {
    public static <E> boolean hasDuplicates(TreeSet<E> items){
        int counter=0;
        for(int i=0;i<items.size();i++){
            for(int j=0;i<items.size();j++){
                if((i != j) && (items[i] == items[j])){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}

package geography;


import java.util.ArrayList;

public class Mountain implements Cloneable {
    private String name;
    private ArrayList<Double>heights;

    public Mountain(String name, ArrayList<Double> heights) {
        this.name = name;
        this.heights = new ArrayList<>(heights);
    }

    @Override
    protected Mountain clone() {
        try{
            Mountain cl = (Mountain) super.clone();
            cl.heights=new ArrayList<>(this.heights);
            return cl;
    }catch(CloneNotSupportedException e){
            throw new RuntimeException("klon nie dziala",e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getHeights() {
        return new ArrayList<>(heights);
    }

    public void setHeight(int index, double newHeight) {
        if (index >= 0 && index < heights.size()) {
            heights.set(index, newHeight);
        } else {
            throw new IndexOutOfBoundsException("Niepoprawny indeks.");
        }
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", heights=" + heights +
                '}';
    }
}

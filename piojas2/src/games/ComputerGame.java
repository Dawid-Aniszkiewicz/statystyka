package games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    public String title;
    public String producer;
    public double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = ratings.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return ratings.clone();
    }

    public void setRatings(double[]ratings) {
        this.ratings = ratings.clone();
    }
    public void addRating(double rating){
        double[]list=new double[this.ratings.length+1];
        for(int i=0;i<list.length-1;i++){
            list[i]=this.ratings[i];
        }
        list[list.length-1]=rating;
        this.ratings=list;
    }
    public void removeRating(double rating){
        int index=-1;
        for(int i=0;i<this.ratings.length;i++){
            if(this.ratings[i]==rating){
                index=i;
            }

        }
        if(index==-1){
            throw new IllegalArgumentException("brak elementu");
        }
        double[]list=new double[this.ratings.length-1];
        for(int i=0;i<index;i++){
            list[i]=this.ratings[i];
        }
        for(int i=index+1;i<this.ratings.length;i++){
            list[i-1]=this.ratings[i];
        }
        this.ratings=list;
    }


    @Override
    public boolean equals(Object o) {
        if(this==o)return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerGame that = (ComputerGame) o;
        return Objects.equals(title, that.title) && Objects.equals(producer, that.producer) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, producer, Arrays.hashCode(ratings));
    }

    @Override
    public String toString() {
        return getClass().getName()+ title + "," + producer + ","+ Arrays.toString(ratings);
    }

}

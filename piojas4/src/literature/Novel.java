package literature;

import java.util.Arrays;
import java.util.Objects;

public class Novel {
    public String title;
    public String author;
    public double[]ratings;

    public Novel(String title, String author, double[] ratings) {
        this.title = title;
        this.author = author;
        this.ratings = ratings.clone();

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings.clone();
    }
    public void addRating(double rating){
        double[] list=new double[this.ratings.length+1];
        for(int i=0;i<this.ratings.length;i++){
            list[i]=this.ratings[i];
        }
        list[list.length-1]=rating;
        ratings=list;
    }
    public void removeRating(double rating){
        double []list=new double[this.ratings.length-1];
        int index=-1;
        for(int i=0;i<this.ratings.length;i++){
            if(ratings[i]==rating){
                index=i;
            }
        }
        for(int i=0;i<index;i++){
            list[i]=ratings[i];
        }
        for(int i=index+1;i<this.ratings.length;i++){
            list[i-1]=ratings[i];
        }
        ratings=list;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ratings=" + Arrays.toString(ratings) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Novel novel = (Novel) o;
        return Objects.equals(title, novel.title) && Objects.equals(author, novel.author) && Objects.deepEquals(ratings, novel.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, Arrays.hashCode(ratings));
    }
}

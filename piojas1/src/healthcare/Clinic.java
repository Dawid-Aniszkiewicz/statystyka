package healthcare;

import java.util.Objects;

public class Clinic extends Hospital {
    public double rating ;

    public Clinic(String name, double capacity,double rating) {
        super(name, capacity);
        if(rating <0.0 || rating >5.0){
            this.rating=3.0;
        }else{
            this.rating = rating;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating <0.0 || rating >5.0){
            this.rating=3.0;
        }else{
            this.rating = rating;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"rating"+rating;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)return true;
        if (!(o instanceof Clinic clinic)) return false;
        if (!super.equals(o)) return false;
        return super.equals(o)&& Double.compare(rating, clinic.rating) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rating);
    }
}

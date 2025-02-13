package satellitemanagement;

import java.util.Objects;

public class SatelliteSpecs {
    private String modelName;
    private int launchYear;
    private int orbitAltitude;

    public SatelliteSpecs(String modelName, int launchYear, int orbitAltitude) {

        if(modelName!=null){
            this.modelName = modelName;
        }else{
            this.modelName="";
        }
        if(launchYear<0){
            this.launchYear = 0;
        }else{
            this.launchYear = launchYear;
        }
        if(orbitAltitude<0){
            this.orbitAltitude = 0;
        }else{
            this.orbitAltitude = orbitAltitude;
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if(modelName!=null){
            this.modelName = modelName;
        }else{
            this.modelName="";
        }
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        if(launchYear<0){
            this.launchYear = 0;
        }else{
            this.launchYear = launchYear;
        }
    }

    public int getOrbitAltitude() {
        return orbitAltitude;
    }

    public void setOrbitAltitude(int orbitAltitude) {
        if(modelName!=null){
            this.modelName = modelName;
        }else{
            this.modelName="";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SatelliteSpecs that = (SatelliteSpecs) o;
        return launchYear == that.launchYear && orbitAltitude == that.orbitAltitude && Objects.equals(modelName, that.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, launchYear, orbitAltitude);
    }

    @Override
    public String toString() {
        return "SatelliteSpecs{" +
                "modelName='" + modelName + '\'' +
                ", launchYear=" + launchYear +
                ", orbitAltitude=" + orbitAltitude +
                '}';
    }
}

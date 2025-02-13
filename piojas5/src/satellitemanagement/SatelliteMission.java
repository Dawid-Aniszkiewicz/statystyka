package satellitemanagement;

import java.util.Objects;

public class SatelliteMission {
    private String missionName;
    private SatelliteSpecs specs;
    private int operatingHours;

    public SatelliteMission(String missionName, SatelliteSpecs specs, int operatingHours) {
        this.missionName = (missionName!=null)?missionName:"";
        this.specs =(specs!=null)?specs:new SatelliteSpecs("",0,0);
        this.operatingHours = Math.max(operatingHours,0);
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = (missionName!=null)?missionName:"";
    }

    public SatelliteSpecs getSpecs() {
        return specs;
    }

    public void setSpecs(SatelliteSpecs specs) {
        this.specs =(specs!=null)?specs:new SatelliteSpecs("",0,0);

    }

    public int getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(int operatingHours) {
        this.operatingHours = Math.max(operatingHours,0);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SatelliteMission that = (SatelliteMission) o;
        return operatingHours == that.operatingHours && Objects.equals(missionName, that.missionName) && Objects.equals(specs, that.specs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(missionName, specs, operatingHours);
    }

    @Override
    public String toString() {
        return "SatelliteMission{" +
                "missionName='" + missionName + '\'' +
                ", specs=" + specs +
                ", operatingHours=" + operatingHours +
                '}';
    }
}

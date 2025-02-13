package satellitemanagement;

public class TestSatelliteMission {
    public static SatelliteSpecs ss = new SatelliteSpecs("mod1",2022,20);
    public static SatelliteMission sm=new SatelliteMission("model1",ss,24);

    public static void main(String[] args) {
        System.out.println(ss.toString());
        System.out.println(sm.toString());
        System.out.println(ss.equals(sm));
        System.out.println(sm.hashCode());
    }
}



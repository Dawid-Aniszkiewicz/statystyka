package space.secon;

public class TestImmutableSpacecraftPosition {
    public static void main(String[] args) {
        ImmutableSpacecraftPosition isp1=new ImmutableSpacecraftPosition(3,4,5);
        System.out.println("start"+isp1);
        ImmutableSpacecraftPosition isp2=isp1.move(5.0,-3.0,2.0);
        System.out.println("po zmianie"+isp2);
    }


}

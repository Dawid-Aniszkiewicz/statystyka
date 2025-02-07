package space.secon;

public final class ImmutableSpacecraftPosition {
    private final double x;
    private final double y;
    private final double z;

    public ImmutableSpacecraftPosition(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "ImmutableSpacecraftPosition{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public ImmutableSpacecraftPosition move(double xChange,double yChange,double zChange){
        return new ImmutableSpacecraftPosition(this.x+xChange,this.y+yChange,this.z+zChange);
    }
}

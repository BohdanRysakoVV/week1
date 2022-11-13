package Task3;

public class Cylinder implements Figure {

    private double height;
    private double baseRadius;

    public Cylinder(double height, double baseRadius) {
        this.height = height;
        this.baseRadius = baseRadius;
    }

    @Override
    public double findFigureVolume() {
        return Math.PI * baseRadius * baseRadius * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseRadius() {
        return baseRadius;
    }

    public void setBaseRadius(double baseRadius) {
        this.baseRadius = baseRadius;
    }
}

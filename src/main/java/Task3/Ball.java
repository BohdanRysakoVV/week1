package Task3;

import java.util.List;

public class Ball implements Figure {

    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double findFigureVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}

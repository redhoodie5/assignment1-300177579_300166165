package design5;


/**
 * abstract class for Design 5 to implement the necessary methods
 */
public abstract class PointCP5 {
    public abstract double getX();
    public abstract double getY();
    public abstract double getRho();
    public abstract double getTheta();
    public abstract double getDistance(PointCP5 pointB);
    public abstract PointCP5 rotatePoint(double rotation);
    public abstract String toString();
    
}



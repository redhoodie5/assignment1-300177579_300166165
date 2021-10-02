
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
/**
 * This class contains instances of coordinates in 
 * cartesian format.
 */
class PointCP3 extends PointCP5
{
  //Instance variables
  protected double x;

  protected double y;

  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP3(double x, double y)
  {
    this.x = x;
    this.y = y;
  }
  
  //Instance methods **************************************************
 
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return y;
  }
  
  public double getRho()
  {
    return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
  }
  
  public double getTheta()
  {
    return Math.toDegrees(Math.atan2(y, x));
  }
  

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP5 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP3 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP3(
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Produces a PointCP2 class with the same point
   */
  public PointCP2 ConvertStorageToPolar(){
    return new PointCP2(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)),Math.toDegrees(Math.atan2(y, x)));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as " + "Cartesian  (" + getX() + "," + getY() + ")";
  }
}


/**
 * This class contains instances of coordinates in polar format. 
 */
class PointCP2 extends PointCP5
{
	//Instance Variables
  protected double rho;
  
  protected double theta;

  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP2(double rho, double theta)
  {
    this.rho = rho;
    this.theta = theta;

  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
    return (Math.cos(Math.toRadians(theta)) * rho);
  }
  
  public double getY()
  {
    return (Math.sin(Math.toRadians(theta)) * rho);
  }
  
  public double getRho()
  {
    return rho;
  }
  
  public double getTheta()
  {
    return theta;
  }


  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP5 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP2(
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Converts PointCP2 to PointCP3
   */
  public PointCP3 convertStorageToCartesian()
  {
    return new PointCP3((Math.cos(Math.toRadians(theta)) * rho),Math.sin(Math.toRadians(theta)) * rho);
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as " + "Polar [" + getRho() + "," + getTheta() + "]" + "\n";
  }

}

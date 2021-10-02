public class Test {
    public static void main(String[] args) {
        long numCycles = 50;
        System.out.println("Number of Cycles : " + numCycles);
        testGetX(numCycles);
        testGetY(numCycles);
        testGetRho(numCycles);
        testGetTheta(numCycles);
        testToString(numCycles);
        testToPolar(numCycles);
        testToCartesian(numCycles);
        testRotatePoint(numCycles);
        testGetDistance( numCycles);
    }
    /**
     * tests and prints the time it takes to retrieve x from polar and 
     * cartesian coordinates
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetX(long numCycles){
        int point1XCartesianTime = 0;
        int point5XCartesianTime = 0;
        int point1XPolarTime = 0;
        int point5XPolarTime = 0;
        long time;
    
        for(long i = 0; i < numCycles; i++){
            double x = (int)(Math.random()*100);
            double y = (int)(Math.random()*100);

            //test design1 
            //Cartesian
            PointCP point1Cartesian = new PointCP('C', x, y);
            time = System.currentTimeMillis();
            point1Cartesian.getX();
            point1XCartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP point1Polar = new PointCP('P', x, y);
            time = System.currentTimeMillis();
            point1Polar.getX();
            point1XPolarTime += (System.currentTimeMillis() - time);

            //test design5 
            //Cartesian
            PointCP3 point5Cartesian = new PointCP3( x, y);
            time = System.currentTimeMillis();
            point5Cartesian.getX();
            point5XCartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP2 point5Polar = new PointCP2( x, y);
            time = System.currentTimeMillis();
            point5Polar.getX();
            point5XPolarTime += (System.currentTimeMillis() - time);            
        }
    
        System.out.println("\npt1 get X Cartesian : " + point1XCartesianTime);
        System.out.println("pt5 get X Cartesian : " + point5XCartesianTime);
        System.out.println("\npt1 get X Polar : " + point1XPolarTime);
        System.out.println("pt5 get X Polar : " + point5XPolarTime);
    }

    /**
     * tests and prints the time it takes to retrieve y from polar and 
     * cartesian coordinates
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetY(long numCycles){
        int point1YCartesianTime = 0;
        int point5YCartesianTime = 0;
        int point1YPolarTime = 0;
        int point5YPolarTime = 0;

        long time;

        for(int i = 0; i< numCycles; i++){
            double x = (int)(Math.random()*100);
            double y = (int)(Math.random()*100);

            //test design1 
            //Cartesian
            PointCP point1Cartesian = new PointCP('C', x, y);
            time = System.currentTimeMillis();
            point1Cartesian.getY();
            point1YCartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP3 point5Cartesian = new PointCP3( x, y);
            time = System.currentTimeMillis();
            point5Cartesian.getY();
            point5YCartesianTime += (System.currentTimeMillis() - time);

            //test design5 
            //Cartesian
            PointCP point1Polar = new PointCP('P', x, y);
            time = System.currentTimeMillis();
            point1Polar.getY();
            point1YPolarTime += (System.currentTimeMillis() - time);
            
            //Polar
            PointCP2 point5Polar = new PointCP2( x, y);
            time = System.currentTimeMillis();
            point5Polar.getY();
            point5YPolarTime += (System.currentTimeMillis() - time);
        }
        System.out.println("\npt1 get Y Cartesian : " + point1YCartesianTime);
        System.out.println("pt5 get Y Cartesian : " + point5YCartesianTime);
        System.out.println("\npt1 get Y Polar : " + point1YPolarTime);
        System.out.println("pt5 get Y Polar : " + point5YPolarTime);
    }
    
    /**
     * tests and prints the time it takes to retrieve rho from polar and 
     * cartesian coordinates
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetRho(long numCycles){
        int point1RhoCartesianTime = 0;
        int point5RhoCartesianTime = 0;
        int point1RhoPolarTime = 0;
        int point5RhoPolarTime = 0;

        long time;
    
        for(long i = 0; i < numCycles; i++){
            double rho = (int)(Math.random()*100);
            double theta = (int)(Math.random()*100);

            //test design1 
            //Cartesian
            PointCP point1Cartesian = new PointCP('C', rho, theta);
            time = System.currentTimeMillis();
            point1Cartesian.getRho();
            point1RhoCartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP point1Polar = new PointCP('P', rho, theta);
            time = System.currentTimeMillis();
            point1Polar.getRho();
            point1RhoPolarTime += (System.currentTimeMillis() - time);

            //test design5 
            //Cartesian
            PointCP3 point5Cartesian = new PointCP3( rho, theta);
            time = System.currentTimeMillis();
            point5Cartesian.getRho();
            point5RhoCartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP2 point5Polar = new PointCP2( rho, theta);
            time = System.currentTimeMillis();
            point5Polar.getRho();
            point5RhoPolarTime += (System.currentTimeMillis() - time);
            
        }
        System.out.println("\npt1 get Rho Cartesian : " + point1RhoCartesianTime);
        System.out.println("pt5 get Rho Cartesian : " + point5RhoCartesianTime);
        System.out.println("\npt1 get Rho Polar : " + point1RhoPolarTime);
        System.out.println("pt5 get Rho Polar : " + point5RhoPolarTime);
    }

    /**
     * tests and prints the time it takes to retrieve theta from polar and 
     * cartesian coordinates
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetTheta(long numCycles){
        int point1ThetaCartesianTime = 0;
        int point5ThetaCartesianTime = 0;
        int point1ThetaPolarTime = 0;
        int point5ThetaPolarTime = 0;

        long time;

        for(int i = 0; i< numCycles; i++){
            double rho = (int)(Math.random()*100);
            double theta = (int)(Math.random()*100);

            //test design1 
            //Cartesian
            PointCP point1Cartesian = new PointCP('C', rho, theta);
            time = System.currentTimeMillis();
            point1Cartesian.getTheta();
            point1ThetaCartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP3 point5Cartesian = new PointCP3( rho, theta);
            time = System.currentTimeMillis();
            point5Cartesian.getTheta();
            point5ThetaCartesianTime += (System.currentTimeMillis() - time);

            //test design5 
            //Cartesian
            PointCP point1Polar = new PointCP('P', rho, theta);
            time = System.currentTimeMillis();
            point1Polar.getTheta();
            point1ThetaPolarTime += (System.currentTimeMillis() - time);
            
            //Polar
            PointCP2 point5Polar = new PointCP2( rho, theta);
            time = System.currentTimeMillis();
            point5Polar.getTheta();
            point5ThetaPolarTime += (System.currentTimeMillis() - time);
        }
        System.out.println("\npt1 get Theta Cartesian : " + point1ThetaCartesianTime);
        System.out.println("pt5 get Theta Cartesian : " + point5ThetaCartesianTime);
        System.out.println("\npt1 get Theta Polar : " + point1ThetaPolarTime);
        System.out.println("pt5 get Theta Polar : " + point5ThetaPolarTime);
    }
    
    /**
     * tests and prints the amount of time to turn the various classes' data into string form
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testToString(long numCycles){
        int point1StringCartesianTime = 0;
        int point1StringPolarTime = 0;
        int point2StringTime = 0;
        int point3StringTime = 0;
        long time;

        for(int i = 0; i < numCycles; i++){
            double xOrRho = (int)(Math.random()*100);
            double yOrTheta = (int)(Math.random()*100);

            //Testing Cartesian Speeds
            //design 1
            PointCP point1Cartesian = new PointCP('C', xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point1Cartesian.toString();
            point1StringCartesianTime += (System.currentTimeMillis() - time);

            //design 3
            PointCP3 point3Cartesian = new PointCP3( xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point3Cartesian.toString();
            point3StringTime += (System.currentTimeMillis() - time);

            //Testing Polar Speeds
            //design 1
            PointCP point1Polar = new PointCP('P', xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point1Polar.toString();
            point1StringPolarTime += (System.currentTimeMillis() - time);

            //design 2
            PointCP2 point2Cartesian = new PointCP2( xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point2Cartesian.toString();
            point2StringTime += (System.currentTimeMillis() - time);
        }
        System.out.println( "\npt1 Cartesian get String : " + point1StringCartesianTime);
        System.out.println( "pt1 Polar get String : " + point1StringPolarTime);
        System.out.println( "\npt2 get String : " +point2StringTime);
        System.out.println( "pt3 get String : " + point3StringTime);
    }

    /**
     * tests and prints the time it takes to swap from cartesian to polar
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testToPolar(long numCycles){
        int point1Time = 0;
        int point3Time = 0;

        long time = 0;

        for(int i = 0; i < numCycles; i++){
            double x = (int)(Math.random()*100);
            double y = (int)(Math.random()*100);

            PointCP point1Cartesian = new PointCP('C', x, y);
            time = System.currentTimeMillis();
            point1Cartesian.convertStorageToPolar();
            point1Time += (System.currentTimeMillis() - time);

            PointCP3 point3Cartesian = new PointCP3( x, y);
            time = System.currentTimeMillis();
            point3Cartesian.ConvertStorageToPolar();
            point3Time += (System.currentTimeMillis() - time);
        }

        System.out.println("\npt1 to Polar : " + point1Time);
        System.out.println("pt3 to Polar : " + point3Time);
    }

    /**
     * tests the time it takes to swap from polar to cartesian
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testToCartesian(long numCycles){
        int point1Time = 0;
        int point2Time = 0;

        long time = 0;

        for(int i = 0; i < numCycles; i++){
            double rho = (int)(Math.random()*100);
            double theta = (int)(Math.random()*100);

            PointCP point1Cartesian = new PointCP('P', rho, theta);
            time = System.currentTimeMillis();
            point1Cartesian.convertStorageToPolar();
            point1Time += (System.currentTimeMillis() - time);

            PointCP2 point3Cartesian = new PointCP2( rho, theta);
            time = System.currentTimeMillis();
            point3Cartesian.convertStorageToCartesian();
            point2Time += (System.currentTimeMillis() - time);
        }

        System.out.println("\npt1 to Cartesian : " + point1Time);
        System.out.println("pt3 to Cartesian : " + point2Time);
    }
   
    /**
     * tests and prints the amount of time it takes for the classes to return the distance
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testRotatePoint(long numCycles){
        int point1CartesianTime = 0;
        int point1PolarTime = 0;
        int point2Time = 0;
        int point3Time = 0;
        long time;

        for(int i = 0; i < numCycles; i++){
            double xOrRho = (int)(Math.random()*100);
            double yOrTheta = (int)(Math.random()*100);
            double rotation = (int)(Math.random()*1000);

            //Testing Cartesian Speeds
            //design 1
            PointCP point1Cartesian = new PointCP('C', xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point1Cartesian.rotatePoint(rotation);
            point1CartesianTime += (System.currentTimeMillis() - time);

            //design 3
            PointCP3 point3Cartesian = new PointCP3( xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point3Cartesian.rotatePoint(rotation);
            point3Time += (System.currentTimeMillis() - time);

            //Testing Polar Speeds
            //design 1
            PointCP point1Polar = new PointCP('P', xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point1Polar.rotatePoint(rotation);
            point1PolarTime += (System.currentTimeMillis() - time);

            //design 2
            PointCP2 point2Cartesian = new PointCP2( xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point2Cartesian.rotatePoint(rotation);
            point2Time += (System.currentTimeMillis() - time);
        }
        System.out.println( "\npt1 Cartesian Rotate : " + point1CartesianTime);
        System.out.println( "pt1 Polar get Rotate : " + point1PolarTime);
        System.out.println( "\npt2 get Rotate : " +point2Time);
        System.out.println( "pt3 get Rotate : " + point3Time);
    }

    /**
     * tests and prints the amount of time it takes for the classes to return the distance
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetDistance(long numCycles){
        int point1CartesianTime = 0;
        int point1PolarTime = 0;
        int point2Time = 0;
        int point3Time = 0;
        long time;

        for(int i = 0; i < numCycles; i++){
            double xOrRhoA = (int)(Math.random()*100);
            double yOrThetaA = (int)(Math.random()*100);

            double xOrRhoB = (int)(Math.random()*100);
            double yOrThetaB = (int)(Math.random()*100);

            //Testing Cartesian Speeds
            //design 1
            PointCP point1Cartesian = new PointCP('C', xOrRhoA, yOrThetaA);
            PointCP point1Cartesian2 = new PointCP('C', xOrRhoB, yOrThetaB);
            time = System.currentTimeMillis();
            System.out.println(point1Cartesian.getDistance(point1Cartesian2));
            point1CartesianTime += (System.currentTimeMillis() - time);

            //design 3
            PointCP3 point3Cartesian = new PointCP3( xOrRhoA, yOrThetaA);
            PointCP3 point3Cartesian2 = new PointCP3( xOrRhoB, yOrThetaB);
            time = System.currentTimeMillis();
            System.out.println(point3Cartesian.getDistance(point3Cartesian2));
            point3Time += (System.currentTimeMillis() - time);

            //Testing Polar Speeds
            //design 1
            PointCP point1Polar = new PointCP('P', xOrRhoA, yOrThetaA);
            PointCP point1Polar2 = new PointCP('P', xOrRhoB, yOrThetaB);
            time = System.currentTimeMillis();
            System.out.println(point1Polar.getDistance(point1Polar2));
            point1PolarTime += (System.currentTimeMillis() - time);

            //design 2
            PointCP2 point2Cartesian = new PointCP2( xOrRhoA, yOrThetaA);
            PointCP2 point2Cartesian2 = new PointCP2( xOrRhoB, yOrThetaB);
            time = System.currentTimeMillis();
            System.out.println(point2Cartesian.getDistance(point2Cartesian2));
            point2Time += (System.currentTimeMillis() - time);
        }
        System.out.println( "\npt1 Cartesian Distance : " + point1CartesianTime);
        System.out.println( "pt1 Polar get Distance : " + point1PolarTime);
        System.out.println( "\npt2 get Distance : " +point2Time);
        System.out.println( "pt3 get Distance : " + point3Time);
    }
}

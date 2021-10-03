import design5.*;
/**
 * tests the classes PointCP1, PointCP2 and PointCP3
 * 
 * @author Meigh Colman
 * Student Number: 300177579
 * @author Cat Wong
 * Student Number: 300166165
 */
public class Test {
    
    static final int NUM_DATAPOINTS = 12;

    /**
     * Number of method tests 
     *  - 0 = getX()
     *  - 1 = getY()
     *  - 2 = getRho()
     *  - 3 = getTheta()
     *  - 4 = toString()
     *  - 5 = toPolar()
     *  - 6 = toCartesian()
     *  - 7 = rotatePoint()
     *  - 8 = getDistance()
     */
    static final int NUM_TESTS = 9;

    /**
     * Number of data saving types 
     *  - 0 = PointCP3
     *  - 1 = PointCP1 polar
     *  - 2 = PointCP1 Cartesian
     *  - 3 = PointCP2
     */
    static final int NUM_TYPES = 4;

    /**
     * number of cycles that the for loops will loop for
     * needs to be visible to several methods
     */
    protected static long numCycles;

    /**
     * table to hold all the averages from all the tests
     */
    protected static double[][][] averages;

    /**
     * counter for number of test sets run
     */
    protected static int counter;

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        averages = new double[NUM_TESTS][NUM_DATAPOINTS + 1][NUM_TYPES];

        for (counter = 0; counter < NUM_DATAPOINTS; counter++){
            runTests();
        }
        calculateFinalAverages();
        printAverages();
        counter = 0;
    }
    
    /**
     * tests and prints the time it takes to retrieve x from polar and 
     * cartesian coordinates
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetX(long numCycles){
        int point1CartesianTime = 0;
        int point3Time = 0;
        int point1PolarTime = 0;
        int point2Time = 0;
        long time;
    
        for(long i = 0; i < numCycles; i++){
            double x = (int)(Math.random()*100);
            double y = (int)(Math.random()*100);

            //test design1 
            //Cartesian
            PointCP point1Cartesian = new PointCP('C', x, y);
            time = System.currentTimeMillis();
            point1Cartesian.getX();
            point1CartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP point1Polar = new PointCP('P', x, y);
            time = System.currentTimeMillis();
            point1Polar.getX();
            point1PolarTime += (System.currentTimeMillis() - time);

            //test design5 
            //Cartesian
            PointCP3 point5Cartesian = new PointCP3( x, y);
            time = System.currentTimeMillis();
            point5Cartesian.getX();
            point3Time += (System.currentTimeMillis() - time);

            //Polar
            PointCP2 point5Polar = new PointCP2( x, y);
            time = System.currentTimeMillis();
            point5Polar.getX();
            point2Time += (System.currentTimeMillis() - time);            
        }
    
        /*/Printing times
        System.out.println("\npt1 get X Cartesian : " + point1CartesianTime);
        System.out.println("pt5 get X Cartesian : " + point3Time);
        System.out.println("\npt1 get X Polar : " + point1PolarTime);
        System.out.println("pt5 get X Polar : " + point2Time);
        */

        //Saving average times
        saveAverage(0, 1, point1PolarTime);
        saveAverage(0, 2, point1CartesianTime);
        saveAverage(0, 3, point2Time);
        saveAverage(0, 0, point3Time);
    }

    /**
     * tests and prints the time it takes to retrieve y from polar and 
     * cartesian coordinates
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetY(long numCycles){
        int point1CartesianTime = 0;
        int point3Time = 0;
        int point1PolarTime = 0;
        int point2Time = 0;

        long time;

        for(long i = 0; i< numCycles; i++){
            double x = (int)(Math.random()*100);
            double y = (int)(Math.random()*100);

            //test design1 
            //Cartesian
            PointCP point1Cartesian = new PointCP('C', x, y);
            time = System.currentTimeMillis();
            point1Cartesian.getY();
            point1CartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP3 point5Cartesian = new PointCP3( x, y);
            time = System.currentTimeMillis();
            point5Cartesian.getY();
            point3Time += (System.currentTimeMillis() - time);

            //test design5 
            //Cartesian
            PointCP point1Polar = new PointCP('P', x, y);
            time = System.currentTimeMillis();
            point1Polar.getY();
            point1PolarTime += (System.currentTimeMillis() - time);
            
            //Polar
            PointCP2 point5Polar = new PointCP2( x, y);
            time = System.currentTimeMillis();
            point5Polar.getY();
            point2Time += (System.currentTimeMillis() - time);
        }
        /*
        System.out.println("\npt1 get Y Cartesian : " + point1CartesianTime);
        System.out.println("pt5 get Y Cartesian : " + point3Time);
        System.out.println("\npt1 get Y Polar : " + point1PolarTime);
        System.out.println("pt5 get Y Polar : " + point2Time);
        */

        saveAverage(1, 1, point1PolarTime);
        saveAverage(1, 2, point1CartesianTime);
        saveAverage(1, 3, point2Time);
        saveAverage(1, 0, point3Time);
    }
    
    /**
     * tests and prints the time it takes to retrieve rho from polar and 
     * cartesian coordinates
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetRho(long numCycles){
        int point1CartesianTime = 0;
        int point3Time = 0;
        int point1PolarTime = 0;
        int point2Time = 0;

        long time;
    
        for(long i = 0; i < numCycles; i++){
            double rho = (int)(Math.random()*100);
            double theta = (int)(Math.random()*100);

            //test design1 
            //Cartesian
            PointCP point1Cartesian = new PointCP('C', rho, theta);
            time = System.currentTimeMillis();
            point1Cartesian.getRho();
            point1CartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP point1Polar = new PointCP('P', rho, theta);
            time = System.currentTimeMillis();
            point1Polar.getRho();
            point1PolarTime += (System.currentTimeMillis() - time);

            //test design5 
            //Cartesian
            PointCP3 point5Cartesian = new PointCP3( rho, theta);
            time = System.currentTimeMillis();
            point5Cartesian.getRho();
            point3Time += (System.currentTimeMillis() - time);

            //Polar
            PointCP2 point5Polar = new PointCP2( rho, theta);
            time = System.currentTimeMillis();
            point5Polar.getRho();
            point2Time += (System.currentTimeMillis() - time);
            
        }
        /*
        System.out.println("\npt1 get Rho Cartesian : " + point1CartesianTime);
        System.out.println("pt5 get Rho Cartesian : " + point3Time);
        System.out.println("\npt1 get Rho Polar : " + point1PolarTime);
        System.out.println("pt5 get Rho Polar : " + point2Time);
        */

        saveAverage(2, 1, point1PolarTime);
        saveAverage(2, 2, point1CartesianTime);
        saveAverage(2, 3, point2Time);
        saveAverage(2, 0, point3Time);
    }

    /**
     * tests and prints the time it takes to retrieve theta from polar and 
     * cartesian coordinates
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetTheta(long numCycles){
        int point1CartesianTime = 0;
        int point3Time = 0;
        int point1PolarTime = 0;
        int point2Time = 0;

        long time;

        for(long i = 0; i< numCycles; i++){
            double rho = (int)(Math.random()*100);
            double theta = (int)(Math.random()*100);

            //test design1 
            //Cartesian
            PointCP point1Cartesian = new PointCP('C', rho, theta);
            time = System.currentTimeMillis();
            point1Cartesian.getTheta();
            point1CartesianTime += (System.currentTimeMillis() - time);

            //Polar
            PointCP3 point5Cartesian = new PointCP3( rho, theta);
            time = System.currentTimeMillis();
            point5Cartesian.getTheta();
            point3Time += (System.currentTimeMillis() - time);

            //test design5 
            //Cartesian
            PointCP point1Polar = new PointCP('P', rho, theta);
            time = System.currentTimeMillis();
            point1Polar.getTheta();
            point1PolarTime += (System.currentTimeMillis() - time);
            
            //Polar
            PointCP2 point5Polar = new PointCP2( rho, theta);
            time = System.currentTimeMillis();
            point5Polar.getTheta();
            point2Time += (System.currentTimeMillis() - time);
        }
        /*
        System.out.println("\npt1 get Theta Cartesian : " + point1CartesianTime);
        System.out.println("pt5 get Theta Cartesian : " + point3Time);
        System.out.println("\npt1 get Theta Polar : " + point1PolarTime);
        System.out.println("pt5 get Theta Polar : " + point2Time);
        */

        saveAverage(3, 1, point1PolarTime);
        saveAverage(3, 2, point1CartesianTime);
        saveAverage(3, 3, point2Time);
        saveAverage(3, 0, point3Time);
    }
    
    /**
     * tests and prints the amount of time to turn the various classes' data into string form
     * tested
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testToString(long numCycles){
        int point1CartesianTime = 0;
        int point1PolarTime = 0;
        int point2Time = 0;
        int point3Time = 0;
        long time;

        for(long i = 0; i < numCycles; i++){
            double xOrRho = (int)(Math.random()*100);
            double yOrTheta = (int)(Math.random()*100);

            //Testing Cartesian Speeds
            //design 1
            PointCP point1Cartesian = new PointCP('C', xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point1Cartesian.toString();
            point1CartesianTime += (System.currentTimeMillis() - time);

            //design 3
            PointCP3 point3Cartesian = new PointCP3( xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point3Cartesian.toString();
            point3Time += (System.currentTimeMillis() - time);

            //Testing Polar Speeds
            //design 1
            PointCP point1Polar = new PointCP('P', xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point1Polar.toString();
            point1PolarTime += (System.currentTimeMillis() - time);

            //design 2
            PointCP2 point2Cartesian = new PointCP2( xOrRho, yOrTheta);
            time = System.currentTimeMillis();
            point2Cartesian.toString();
            point2Time += (System.currentTimeMillis() - time);
        }
        /*
        System.out.println( "\npt1 Cartesian get String : " + point1CartesianTime);
        System.out.println( "pt1 Polar get String : " + point1PolarTime);
        System.out.println( "\npt2 get String : " +point2Time);
        System.out.println( "pt3 get String : " + point3Time);
        */
        //Saving averages
        saveAverage(4, 1, point1PolarTime);
        saveAverage(4, 2, point1CartesianTime);
        saveAverage(4, 3, point2Time);
        saveAverage(4, 0, point3Time);
    }

    /**
     * tests and prints the time it takes to swap from cartesian to polar
     * tested
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testToPolar(long numCycles){
        int point1Time = 0;
        int point3Time = 0;

        long time = 0;

        for(long i = 0; i < numCycles; i++){
            double x = (int)(Math.random()*100);
            double y = (int)(Math.random()*100);

            //testing design 1
            PointCP point1 = new PointCP('C', x, y);
            time = System.currentTimeMillis();
            point1.convertStorageToPolar();
            point1Time += (System.currentTimeMillis() - time);

            //design 3
            PointCP3 point3 = new PointCP3( x, y);
            time = System.currentTimeMillis();
            PointCP2 point2 = point3.ConvertStorageToPolar();
            point3Time += (System.currentTimeMillis() - time);
        }
        /*
        System.out.println("\npt1 to Polar : " + point1Time);
        System.out.println("pt3 to Polar : " + point3Time);
        */

        //saving averages
        saveAverage(5, 2, point1Time);
        saveAverage(5, 0, point3Time);
    }

    /**
     * tests the time it takes to swap from polar to cartesian
     * tested
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testToCartesian(long numCycles){
        int point1Time = 0;
        int point2Time = 0;

        long time = 0;

        for(long i = 0; i < numCycles; i++){
            double rho = (int)(Math.random()*100);
            double theta = (int)(Math.random()*100);

            //testing design 1
            PointCP point1 = new PointCP('P', rho, theta);
            time = System.currentTimeMillis();
            point1.convertStorageToCartesian();
            point1.toString();
            point1Time += (System.currentTimeMillis() - time);

            //testing design 2
            PointCP2 point2 = new PointCP2( rho, theta);
            time = System.currentTimeMillis();
            PointCP3 point3 = point2.convertStorageToCartesian(); 
            point2Time += (System.currentTimeMillis() - time);
        }
        /*
        System.out.println("\npt1 to Cartesian : " + point1Time);
        System.out.println("pt3 to Cartesian : " + point2Time);
        */
        
        //saving times
        saveAverage(6, 1, point1Time);
        saveAverage(6, 3, point2Time);
        
    }
   
    /**
     * tests and prints the amount of time it takes for the classes to return the distance
     * tested
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testRotatePoint(long numCycles){
        int point1CartesianTime = 0;
        int point1PolarTime = 0;
        int point2Time = 0;
        int point3Time = 0;
        long time;

        for(long i = 0; i < numCycles; i++){
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
        /*
        System.out.println( "\npt1 Cartesian Rotate : " + point1CartesianTime);
        System.out.println( "pt1 Polar get Rotate : " + point1PolarTime);
        System.out.println( "\npt2 get Rotate : " +point2Time);
        System.out.println( "pt3 get Rotate : " + point3Time);
        */

        //saving times
        saveAverage(7, 1, point1PolarTime);
        saveAverage(7, 2, point1CartesianTime);
        saveAverage(7, 3, point2Time);
        saveAverage(7, 0, point3Time);
    }

    /**
     * tests and prints the amount of time it takes for the classes to return the distance
     * TESTED
     * @param numCycles     Notes the number of times the for loop will run
     */
    private static void testGetDistance(long numCycles){
        int point1CartesianTime = 0;
        int point1PolarTime = 0;
        int point2Time = 0;
        int point3Time = 0;
        long time;

        for(long i = 0; i < numCycles; i++){
            double xOrRhoA = (double)((int)(Math.random()*100));
            double yOrThetaA = (double)((int)(Math.random()*100));

            double xOrRhoB = (int)(Math.random()*100);
            double yOrThetaB = (int)(Math.random()*100);

            //Testing Cartesian Speeds
            //design 1
            PointCP point1Cartesian = new PointCP('C', xOrRhoA, yOrThetaA);
            PointCP point1Cartesian2 = new PointCP('C', xOrRhoB, yOrThetaB);
            time = System.currentTimeMillis();
            point1Cartesian.getDistance(point1Cartesian2);
            point1CartesianTime += (System.currentTimeMillis() - time);

            //design 3
            PointCP3 point3Cartesian = new PointCP3( xOrRhoA, yOrThetaA);
            PointCP3 point3Cartesian2 = new PointCP3( xOrRhoB, yOrThetaB);
            time = System.currentTimeMillis();
            point3Cartesian.getDistance(point3Cartesian2);
            point3Time += (System.currentTimeMillis() - time);

            //Testing Polar Speeds
            //design 1
            PointCP point1Polar = new PointCP('P', xOrRhoA, yOrThetaA);
            PointCP point1Polar2 = new PointCP('P', xOrRhoB, yOrThetaB);
            time = System.currentTimeMillis();
            point1Polar.getDistance(point1Polar2);
            point1PolarTime += (System.currentTimeMillis() - time);

            //design 2
            PointCP2 point2Cartesian = new PointCP2( xOrRhoA, yOrThetaA);
            PointCP2 point2Cartesian2 = new PointCP2( xOrRhoB, yOrThetaB);
            time = System.currentTimeMillis();
            point2Cartesian.getDistance(point2Cartesian2);
            point2Time += (System.currentTimeMillis() - time);
        }
        /*
        System.out.println( "\npt1 Cartesian Distance : " + point1CartesianTime);
        System.out.println( "pt1 Polar get Distance : " + point1PolarTime);
        System.out.println( "\npt2 get Distance : " +point2Time);
        System.out.println( "pt3 get Distance : " + point3Time);
        */

        //saving time
        saveAverage(8, 1, point1PolarTime);
        saveAverage(8, 2, point1CartesianTime);
        saveAverage(8, 3, point2Time);
        saveAverage(8, 0, point3Time);
    }

    /**
     * picks random numbers of tests to run and then runs that many trials of each test
     */
    private static void runTests(){
        //picking a number of times to run the tests
        numCycles = (long)(Math.random()*1000000 )+1;
        //System.out.println("Number of Cycles : " + numCycles);

        //running all the tests numCycles times
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
     * calculates the average time for the test run and saves it in the 'avarage' array
     * @param test      index of the test
     * @param type      index of the class type
     * @param time      amount of time the tests took
     */
    private static void saveAverage( int test, int type, int time ){
        double avg = (double)time/(double)numCycles;
        averages[test][counter][type] = avg;
    }
    
    /**
     * Calculates average of all the previous averages and adds it to the bottom of the average array
     * @param test
     * @param type
     */
    private static void addFinalAverage(int test, int type){
        double avg = 0;

        //calculating collective time
        for(int i = 0; i < NUM_DATAPOINTS; i++){
            avg += averages[test][i][type];
        }

        //calculating the average of averages in a column
        averages[test][(averages[test].length )- 1][type] = avg/(double)NUM_DATAPOINTS;
    }

    /**
     * Calls addFinalAverage() for each method test int the averages array 
     */
    private static void calculateFinalAverages(){
        for(int i = 0; i < NUM_TESTS; i++){
            for(int m = 0; m < NUM_TYPES; m++){
                addFinalAverage(i,m);
            }
        }
    }

    /**
     * Prints all the values stored in averages
     */
    private static void printAverages(){
        for(int i = 0; i < NUM_TESTS; i++){                 //for each method tested...
            System.out.println("METHOD #" + i);
            for(int k = 0; k < NUM_TYPES; k++){             //for each data type...
                System.out.println("\tTYPE #" + k);
                for(int m = 0; m < NUM_DATAPOINTS; m++){    //for each average time...
                    System.out.println("\t\t\tDatapoint #" + m + " is "+ averages[i][m][k]);
                }
                System.out.println("\tTotal Average : " + averages[i][NUM_DATAPOINTS][k]);
            }
        }

    } 
}

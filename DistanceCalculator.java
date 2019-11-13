package part1;

import java.util.Scanner;
import java.lang.Math;

public class DistanceCalculator {
    public static void main(String[]Args){
        System.out.println("***Welcome to Christopher's Distance Calculator***");
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter Starting American City");
        String AmericanCityStart = SC.nextLine();
        System.out.println("Latitude In Degrees");

        double LatitudeDegreesStart = SC.nextDouble();
        System.out.println("Latitude in Minutes");

        double LatitudeMinutesStart = SC.nextDouble();
        System.out.println("Latitude in Seconds");

        double LatitudeSecondsStart= SC.nextDouble();

        double Latitude1 = LatitudeDegreesStart + LatitudeMinutesStart/60 + LatitudeSecondsStart/3600;
        //double LatitudeStart = LatitudeDegreeStart + LatitudeMinutesStart + LatitudeSecondsStart;
        //System.out.println(Latitude1);

        System.out.println("Longitude in Degrees");
        double LongitudeDegreesStart = SC.nextDouble();
        System.out.println("Longitude in Minutes");
        double LongitudeMinutesStart = SC.nextDouble();
        System.out.println("Longitude in Seconds");
        double LongitudeSecondsStart = SC.nextDouble();

        double Longitude1 = LongitudeDegreesStart + LongitudeMinutesStart/60 + LongitudeSecondsStart/3600;



        SC.nextLine();
        System.out.println("Enter American City Destination");
        String AmericanCityEnd = SC.nextLine();
        System.out.println("Latitude In Degrees");
        double LatitudeDegreesEnd = SC.nextDouble();
        System.out.println("Latitude in Minutes");
        double LatitudeMinutesEnd = SC.nextDouble();
        System.out.println("Latitude in Seconds");
        double LatitudeSecondsEnd = SC.nextDouble();

        double Latitude2 = LatitudeDegreesEnd + LatitudeMinutesEnd / 60   + LatitudeSecondsEnd /3600;


        System.out.println("Longitude in Degrees");
        double LongitudeDegreesEnd = SC.nextDouble();
        System.out.println("Longitude in Minutes");
        double LongitudeMinutesEnd = SC.nextDouble();
        System.out.println("Longitude in Seconds");
        double LongitudeSecondsEnd = SC.nextDouble();

        double Longitude2 = LongitudeDegreesEnd + LongitudeMinutesEnd /60+ LongitudeSecondsEnd /3600 ;



        double RADIAN_FACTOR = 180/Math.PI;
        double x = Math.sin(Latitude1/RADIAN_FACTOR) * Math.sin(Latitude2/RADIAN_FACTOR)
        + Math.cos(Latitude1/RADIAN_FACTOR)
                * Math.cos(Latitude2/RADIAN_FACTOR)
                * Math.cos(Longitude2 / RADIAN_FACTOR - Longitude1/RADIAN_FACTOR);

        int EARTH_RADIUS = 6371;
        double Distance = EARTH_RADIUS * Math.atan((Math.sqrt((1-Math.pow(x,2)))/x));
        System.out.println(AmericanCityStart + " is " + Distance + " kilometers from " + AmericanCityEnd);









    }

}

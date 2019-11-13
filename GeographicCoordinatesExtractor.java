package part2;

import java.util.Scanner;

public class GeographicCoordinatesExtractor {
    public static void main(String[]Args){
        System.out.println("Welcome to Christopher's Geographic Coordinates Extractor");
        Scanner INPUT = new Scanner(System.in);
        System.out.println("Enter Geographic Coordinates (Degrees Minutes Seconds Direction)");
        String Coordinates = INPUT.nextLine();

        String Degrees = Coordinates.substring(0,Coordinates.indexOf(" "));
        Coordinates = Coordinates.substring(Coordinates.indexOf(" ")+1);
        String Minutes= Coordinates.substring (0,Coordinates.indexOf(" "));
        Coordinates = Coordinates.substring(Coordinates.indexOf(" ")+1);
        String Seconds = Coordinates.substring(0,Coordinates.indexOf(" "));
        Coordinates = Coordinates.substring(Coordinates.indexOf(" ")+1);
        String Direction = Coordinates;
        System.out.println(Degrees + "°");
        System.out.println(Minutes + "'");
        System.out.println(Seconds + "\"");
        System.out.println(Direction);



}}

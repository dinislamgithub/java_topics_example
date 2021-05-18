package com.din.annotation_enum_regex.enums;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * one way...
 */
enum Direction {
    EAST,
    WEST,
    NORTH,
    SOUTH

}

enum Position implements EnumInterface{
    FIRST("First Value"), SECOND("Second Value");

    private String description = null;
    private Position(String desc){
        this.description = desc;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        //direct access enum
        System.out.println("***** Direct enum access ******");
        System.out.println(Directions.WEST + " " + Direction.EAST);

        //if else Statements
        System.out.println("***** if else enum values access******");
        getDirections(Directions.NORTH_WEST);

        //Switch-Case Statements
        System.out.println("***** Switch-Case enum values access******");
        EnumDemo enumDemo = new EnumDemo(Directions.NORTH);
        enumDemo.myDirection();

        //iterator/traversing  the enum
        System.out.println("***** Iterator enum values access******");
        for (Directions dir : Directions.values()) {
            System.out.println(dir);
        }
        System.out.println("Value of NORTH is :" + Directions.valueOf("NORTH")); //value match in enum with "NORTH"
        System.out.println("Index of NORTH is :" + Directions.valueOf("NORTH").ordinal()); //enum particular field indexing find out.

        //Enum customize value access (2nd way...)
        System.out.println("***** Enum customize value access ******");
        DirectionsCustomize directionsCustomize = DirectionsCustomize.SOUTH;
        System.out.println(directionsCustomize.getEnumValue());

        DirectionsCustomizeInt a = DirectionsCustomizeInt.NORTH;  //int value getting...
        System.out.println(a + " -> " + a.getEnumValue());

        Position p = Position.FIRST;    //enum implementing interface  .....
        System.out.println(p.getDescription());


        //Enum set access
        System.out.println("***** Enum set access ******");
        EnumSet<Level> enumSet = EnumSet.of(Level.LOW, Level.MEDIUM_CUSTOMIZE, Level.LOW);
        System.out.println(enumSet);


        //Enum map access
        System.out.println("***** Enum map access ******");
        EnumMap<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
        enumMap.put(Level.LOW, "Low Level...");
        enumMap.put(Level.HIGH, "High Level...");
        System.out.println(enumMap.get(Level.HIGH));


        //Enum access from class
        System.out.println("***** Enum access from class ******");
        EnumClass.AgentStatusEnum enumAgentStatus = EnumClass.AgentStatusEnum.Active;
        System.out.println(enumAgentStatus +" -> "+ enumAgentStatus.getStatus());





    }



    public static Directions getDirections(Directions dir){
        if(dir == Directions.NORTH){
            System.out.println(dir + " " + "is found.");
        }else if(dir == Directions.SOUTH){
            System.out.println(dir + " " + "is found.");
        }else if(dir == Directions.EAST){
            System.out.println(dir + " " + "is found.");
        }else if(dir == Directions.WEST){
            System.out.println(dir + " " + "is found.");
        }else{
            System.out.println("not found.");
        }
        return null;
    }



}


class EnumDemo{
    Directions directions;

    public EnumDemo(Directions directions) {
        this.directions = directions;
    }

    public void myDirection(){
        switch (directions) {
            case EAST:
                System.out.println("East Direction Found");
                break;

            case WEST:
                System.out.println("West Direction Found");
                break;

            case NORTH:
                System.out.println("North Direction Found");
                break;

            case SOUTH:
                System.out.println("SOUTH Direction Found");
                break;

            default:
                System.out.println("NORTH_WEST Direction Default");
                break;
        }
    }
}



//https://www.javatpoint.com/enum-in-java
//http://tutorials.jenkov.com/java/enums.html
//https://www.programiz.com/java-programming/enums
//https://www.baeldung.com/a-guide-to-java-enums
//https://linuxize.com/post/how-to-rename-local-and-remote-git-branch/
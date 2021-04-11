package com.din.annotation_enum_regex.enums;

/**
 * another way...
 */
public enum Directions {
    EAST,
    WEST,
    NORTH,
    SOUTH,
    NORTH_WEST
}


/**
 * enum access with customize value  (2nd way...)
 */
enum DirectionsCustomize{
    EAST ("East"),
    WEST ("West"),
    NORTH ("North"),
    SOUTH ("South"),
    SOUTH_INT(String.valueOf(33)); //int value add as string...

    private final String enumValue;

    DirectionsCustomize(String enumValue) {
        this.enumValue = enumValue;
    }

    public String getEnumValue(){
        return this.enumValue;
    }
}

enum DirectionsCustomizeInt{
    NORTH (1),
    SOUTH (2),
    EAST (3),
    WEST (4);


    private final int enumValue;

    DirectionsCustomizeInt(int enumValue) {
        this.enumValue = enumValue;
    }

    public int getEnumValue(){
        return this.enumValue;
    }
}


enum Level {
    HIGH{
        @Override
        public String asLowerCase() {
            return HIGH.toString().toLowerCase();
        }
    },
    MEDIUM{
        @Override
        public String asLowerCase() {
            return MEDIUM.toString().toLowerCase();
        }
    },
    MEDIUM_CUSTOMIZE{
        @Override
        public String asLowerCase(){
            return MEDIUM_CUSTOMIZE.toString().toLowerCase();
        }
    },
    LOW{
        @Override
        public String asLowerCase() {
            return LOW.toString().toLowerCase();
        }
    };

    public abstract String asLowerCase();
}

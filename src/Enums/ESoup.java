package Enums;

public enum ESoup {
    BLACK("Black-eyed Bean Soup   "),
    BROCCOLI("Broccoli Cheddar Soup  "),
    CHICKEN("Cream of Chicken Soup  "),
    CORN("Sweet Corn Soup        "),
    MUSHROOM("Cream of Mushroom Soup "),
    SOUR("Hot & Sour Soup        "),
    TOMATO("Tomato Basil Soup      ");

    String soupName;

    ESoup(String soupName) {
        this.soupName = soupName;
    }

    public String getSoupName() {
        return soupName;
    }
}

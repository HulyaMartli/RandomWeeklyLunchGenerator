package Enums;

public enum EMeal {
    BEEF("Beef Curry & Rice      "),
    CHICKEN("Chicken Pasta          "),
    LASAGNE("Beef Lasagne           "),
    MEATBALLS("Meatballs & Mash       "),
    SPAGHETTI("Spaghetti Bolognese    "),
    SALMON("Baked Salmon           "),
    STEAK("Steak Pie & Mash       ");

    String mealName;

    EMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealName() {
        return mealName;
    }
}

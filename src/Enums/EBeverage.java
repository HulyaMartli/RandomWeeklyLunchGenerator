package Enums;

public enum EBeverage {
    BUTTERMILK("Buttermilk         "),
    COKE("Coca Cola          "),
    FANTA("Fanta              "),
    ICE("Ice Tea            "),
    JUICE("Juice              "),
    LEMONADE("Lemonade           "),
    SODA("Soda               ");

    String beverageName;

    EBeverage(String beverageName) {
        this.beverageName = beverageName;
    }

    public String getBeverageName() {
        return beverageName;
    }
}

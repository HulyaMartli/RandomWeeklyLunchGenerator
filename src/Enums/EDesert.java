package Enums;

public enum EDesert {
    BROWNIE("Brownie              "),
    CHEESECAKE("Cheesecake           "),
    CHOCOLATE("Chocolate Cake       "),
    CUSTARD("Custard              "),
    FLAN("Flan                 "),
    LAVA("Lava Cake            "),
    TIRAMISU("Tiramisu             ");

    String desertName;

    EDesert(String desertName) {
        this.desertName = desertName;
    }

    public String getDesertName() {
        return desertName;
    }
}

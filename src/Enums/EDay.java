package Enums;

public enum EDay {
    MONDAY("Monday                "),
    TUESDAY("Tuesday               "),
    WEDNESDAY("Wednesday             "),
    THURSDAY("Thursday              "),
    FRIDAY("Friday                "),
    SATURDAY("Saturday              "),
    SUNDAY("Sunday                ");

    String dayName;

    EDay(String dayName) {
        this.dayName = dayName;
    }
    public String getDayName() {
        return dayName;
    }
}

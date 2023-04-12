package Entities;
import Enums.*;
import java.util.*;

public class Menu {
    ESoup soup;
    EMeal meal;
    EDesert desert;
    EBeverage beverage;
    EDay day;
    static List<Enum> soups= new ArrayList<>(Arrays.asList(ESoup.values()));
    static List<Enum> meals= new ArrayList<>(Arrays.asList(EMeal.values()));
    static List<Enum> deserts= new ArrayList<>(Arrays.asList(EDesert.values()));
    static List<Enum> beverages= new ArrayList<>(Arrays.asList(EBeverage.values()));

    public Menu(EDay day) {
        this.soup = (ESoup) getItem(soups);
        this.meal = (EMeal) getItem(meals);
        this.desert = (EDesert) getItem(deserts);
        this.beverage = (EBeverage) getItem(beverages);
        this.day=day;
    }

    public Enum getItem(List<Enum> list){
        Random rd = new Random();
        Enum en;
        en=list.get(rd.nextInt(list.size()));
        list.remove(en);
        return en;
    }

    @Override
    public String toString() {
        return  "          ⌈¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯⌉\n"+
                "          |  MENU - "+day.getDayName()+"|\n" +
                "          |  Soup: " + soup.getSoupName() +"|\n" +
                "          |  Meal: " + meal.getMealName() +"|\n" +
                "          |  Desert: " + desert.getDesertName() +"|\n" +
                "          |  Beverage: " + beverage.getBeverageName()+"|\n" +
                "          ⌊_______________________________⌋\n";
    }


}

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
        this.soup = (ESoup) getItem(soups,ESoup.values());
        this.meal = (EMeal) getItem(meals,EMeal.values());
        this.desert = (EDesert) getItem(deserts,EDesert.values());
        this.beverage = (EBeverage) getItem(beverages,EBeverage.values());
        this.day=day;
    }

    public Enum getItem(List<Enum> list,Enum[] enumList){
        /*
        * REASON FOR IF STATEMENT & enumList PARAMETER: e.g. If we would have less than 7 beverages in EBeverages, then the
        * beverages won't be unique for each menu, but we won't get an exception. It will reassign a
        * random value from the existing EBevarage values.
         */
        if(list.isEmpty()) {
            list=Arrays.asList(enumList);
        }
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

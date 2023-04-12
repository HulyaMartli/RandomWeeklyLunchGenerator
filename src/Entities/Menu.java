package Entities;
import Enums.*;
import java.util.*;

public class Menu {
    ESoup soup;
    EMeal meal;
    EDesert desert;
    EBeverage beverage;
    EDay day;
    static List<ESoup> soups= new ArrayList<>(Arrays.asList(ESoup.values()));
    static List<EMeal> meals= new ArrayList<>(Arrays.asList(EMeal.values()));
    static List<EDesert> deserts= new ArrayList<>(Arrays.asList(EDesert.values()));
    static List<EBeverage> beverages= new ArrayList<>(Arrays.asList(EBeverage.values()));

    public Menu(EDay day) {
        this.soup = getSoup();
        this.meal = getMeal();
        this.desert = getDesert();
        this.beverage = getBeverage();
        this.day=day;
    }

    public ESoup getSoup() {
        Random rd = new Random();
        ESoup eSoup;
        eSoup=soups.get(rd.nextInt(soups.size()));
        soups.remove(eSoup);
        return eSoup;
    }

    public EDesert getDesert() {
        Random rd = new Random();
        EDesert eDesert;
        eDesert=deserts.get(rd.nextInt(deserts.size()));
        deserts.remove(eDesert);
        return eDesert;
    }

    public EMeal getMeal() {
        Random rd = new Random();
        EMeal eMeal;
        eMeal=meals.get(rd.nextInt(meals.size()));
        meals.remove(eMeal);
        return eMeal;
    }

    public EBeverage getBeverage() {
        Random rd = new Random();
        EBeverage bev;
        bev=beverages.get(rd.nextInt(beverages.size()));
        beverages.remove(bev);
        return bev;
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

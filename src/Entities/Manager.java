package Entities;

import Enums.EDay;

import java.util.ArrayList;

public class Manager {
    ArrayList<Menu> menus;


    public Manager() {
        menus=getWeeklyMenu();
        for(Menu menu : menus){
            System.out.println(menu);
        }

    }

    public ArrayList<Menu> getWeeklyMenu(){
        ArrayList<Menu> weeklyMenu = new ArrayList<>();
        for(int i=0; i<7; i++){
            weeklyMenu.add(new Menu(EDay.values()[i]));
        }
        return weeklyMenu;
    }
}

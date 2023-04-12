import Entities.Manager;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►");
        System.out.println("◄►◄►◄► WELCOME TO WEEKLY RANDOM LUNCH GENERATOR ◄►◄►◄►");
        System.out.println("◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►");
        System.out.println("   Please press ENTER to create menus for your week   ");
        sc.nextLine();
        Manager manager = new Manager();
        System.out.println("◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►");
        System.out.println("◄►◄►◄►    THANK YOU FOR USING THE GENERATOR!    ◄►◄►◄►");
        System.out.println("◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►◄►");
        System.out.println("   Hope you enjoy your lunches throughout the week!   ");
    }
}
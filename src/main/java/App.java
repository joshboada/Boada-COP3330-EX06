/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class App {
    public static void main (String[]args) {
        Scanner age = new Scanner (System.in);
        System.out.println("What is your current age?");
        String agenum = age.nextLine();

        Scanner retire = new Scanner (System.in);
        System.out.println("At what age would you like to retire?");
        String retirenum = retire.nextLine();

        int agenumber = Integer.parseInt(agenum);
        int retirenumber = Integer.parseInt(retirenum);

        int yearsleft = retirenumber - agenumber;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String date = sdf.format(new Date());
        int currentyear = Integer.parseInt(date);
        int retireyear = yearsleft + currentyear;

        System.out.println("You Have " + yearsleft + " years left until you can retire.");
        System.out.println("It's " + date + ", so you can retire in " + retireyear + ".");

    }
}

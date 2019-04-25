package com.LickingHeights;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What month were you born (enter as number)?");
        month = keyboard.nextInt();
        System.out.println("What day were you born?");
        day = keyboard.nextInt();
        System.out.println("What year were you born?");
        year = keyboard.nextInt();


        {
            if (month == 1)
            {
                month = 13;
                year--;
            }
            else if (month == 2)
            {
                month = 14;


                }
        int q, m, j, k, h;
            m=month;
            q=day;
            k=year;
            j=year;
        h = (q + 13) * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;
        switch (h) {


                case 0:
                    input = "Saturday \n";
                    System.out.println("Saturday's child works hard for a living");
                    break;
                case 1:
                    input = "Sunday \n";
                    System.out.println("Sunday's child is fair and wise and good in every way");
                    break;
                case 2:
                    input = "Monday \n";
                    System.out.println("Monday's child is fair of face");
                    break;
                case 3:
                    input = "Tuesday \n";
                    System.out.println("Tuesday's child is full of grace");
                    break;
                case 4:
                    input = "Wednesday \n";
                    System.out.println("Wednesday's child is full of woe");
                    break;
                case 5:
                    input = "Thursday \n";
                    System.out.println("Thursday's child has far to go");
                    break;
                case 6:
                    input = "Friday \n";
                    System.out.println("Friday's child is loving and giving");
                    break;
            }
        /*System.out.println("Monday's child is fair of face");
        System.out.println("Tuesday's child is full of grace");
        System.out.println("Wednesday's child is full of woe");
        System.out.println("Thursday's child has far to go");
        System.out.println("Friday's child is loving and giving");
        System.out.println("Saturday's child works hard for a living");
        System.out.println("Sunday's child is fair and wise and good in every way");*/

        }

    }}


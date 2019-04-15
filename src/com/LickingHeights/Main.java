package com.LickingHeights;

public class Main {
    public static void main(String[] args) {
        int day;
        int month;
        int year;

        {
            if (month == 1)
            {
                month = 13;
                year--;
            }
            if (month == 2)
            {
                month = 14;
                year--;
            }


        }
        int q;
        int m;
        int j;
        int k;
        int h = (q + 13)*(m+1)/5 + k + k/4 + j/4 + 5*j;
        h = h%7;
        switch (h){

            {
                case 0:
                    input << "Saturday \n";
                    break;
                case 1:
                    input << "Sunday \n";
                    break;
                case 2:
                    input << "Monday \n";
                    break;
                case 3:
                    input << "Tuesday \n";
                    break;
                case 4:
                    input << "Wednesday \n";
                    break;
                case 5:
                    input << "Thursday \n";
                    break;
                case 6:
                    input << "Friday \n";
                    break;
            }





    }}}

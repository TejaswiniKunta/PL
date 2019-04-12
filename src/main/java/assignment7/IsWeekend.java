package assignment7;

import java.util.Scanner;

public class IsWeekend {

    public static void main(String args[]) {
        System.out.println("enter a day");
    Scanner sc = new Scanner(System.in);
    String dayIs = sc.nextLine();
    System.out.println(Days.isWeekend(dayIs));
    System.out.println(isDayAWeekend(dayIs));
    for (Coin coin:Coin.values()) {
        System.out.println(coin+" " + coin.getCoinColor()+" "+coin.getCoinValue());
    }
    }

    public static Boolean isDayAWeekend(String day){
        for(Days days: Days.values()) {
            if (day.equalsIgnoreCase(Days.SATURDAY.name())|| day.equalsIgnoreCase(Days.SUNDAY.name())) {
                return true;
            }
        }
        return false;
    }

}

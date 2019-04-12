package assignment7;

public enum Days {
    SUNDAY ,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static Boolean isWeekend(String day){
        if(day.equalsIgnoreCase(SUNDAY.toString())|| day.equalsIgnoreCase(SATURDAY.toString())){
            return true;
        }
        else return false;
    }
}

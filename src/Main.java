
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LongNH
 */
public class Main {

    public static boolean DayCheckRange(int day) {
        if (day < 1 || day > 31) {
            return false;
        }
        return true;
    }

    public static boolean MonthCheckRange(int month) {
        if (month < 1 || month > 12) {
            return false;
        }
        return true;
    }

    public static boolean YearCheckLeapYear(int year) {
        if (((year % 4) == 0) || ((year % 400) == 0)) {
            return true;
        }
        return false;
    }

    public static boolean YearCheckRange(int year) {
        if (year < 0) {
            return false;
        }
        return true;
    }

    public static boolean DayMonthCheck(int day, int month) {
        List<Integer> listMonth1 = new ArrayList<Integer>();
        listMonth1.addAll(Arrays.asList(1, 3, 5, 7, 8, 10, 12));

        List<Integer> listMonth2 = new ArrayList<Integer>();
        listMonth2.addAll(Arrays.asList(4, 6, 9, 11));

        if (listMonth1.contains(month)) {
            if (day <= 31) {
                return true;
            }
        }
        if (listMonth2.contains(month)) {
            if (day <= 30) {
                return true;
            }
        }
        return false;
    }

    public static boolean DateCheck(int day, int month, int year) {
        if (DayCheckRange(day) && MonthCheckRange(month) && YearCheckRange(year)) {
            if (YearCheckLeapYear(year)) {
                if (month == 2) {
                    if (day > 0 && day <= 29) {
                        return true;
                    }
                } else {
                    if (DayMonthCheck(day, month)) {
                        return true;
                    }
                }
            } else {
                if (month == 2) {
                    if (day > 0 && day <= 28) {
                        return true;
                    }
                } else {
                    if (DayMonthCheck(day, month)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(YearCheckLeapYear(2000));
        System.out.println(DateCheck(29, 2, 2000));
    }
}

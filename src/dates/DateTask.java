package dates;

import java.text.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class DateTask {

    /**
     * get day week by date
     */
    public static void task_1() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
        Date date = simpleDateFormat.parse("28/05/2021");
        simpleDateFormat.applyPattern("EEE, d MMM yyyy");
        String result = simpleDateFormat.format(date);
        System.out.println(result);
    }

    /**
     * Get next tuesday date
     */
    public static void task_2() {

        LocalDate localDate = LocalDate.of(2021, Month.JUNE, 03);
        TemporalAdjuster nextDate = TemporalAdjusters.next(DayOfWeek.TUESDAY);
        System.out.println("Next tuesday date: " + localDate.with(nextDate));

    }

    public static void main(String[] args) throws ParseException {
        task_1();
        System.out.println("---------");
        task_2();
    }

}
//Fri, 28 May 2021
//        ---------
//        2021-06-08

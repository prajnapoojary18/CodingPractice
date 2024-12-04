package Problem40;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DayOfYear {
        public static void main(String[] args) {
            String dateStr = "2024-12-01";
            int dayOfYear = getDayOfYear(dateStr);
            System.out.println("The day number of the year for " + dateStr + " is: " + dayOfYear);
        }

        public static int getDayOfYear(String dateStr) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(dateStr, formatter);
            return date.getDayOfYear();
        }
    }



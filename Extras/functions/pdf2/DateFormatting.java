package Extras.functions.pdf2;

import java.time.*;
import java.time.format.*;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1 (dd/MM/yyyy): " + today.format(format1));
        System.out.println("Format 2 (yyyy-MM-dd): " + today.format(format2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + today.format(format3));
    }
}
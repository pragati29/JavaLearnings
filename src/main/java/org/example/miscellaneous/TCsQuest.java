package org.example.miscellaneous;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class TCsQuest {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ISO_DATE;
        LocalDate dateTime=LocalDate.of(2015, Month.FEBRUARY,31);
        System.out.println(df.format(dateTime));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

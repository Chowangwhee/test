package ThisIsJava.ch12.ExampleNo15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HowManyLeftUntilLastDayOf2024s {
    public static void main(String[] args) {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        LocalDateTime startDateTime= LocalDateTime.of(2024, 11, 11, 0, 0, 0);
        System.out.println("시작일: "+startDateTime.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2024, 12, 31, 0, 0, 0);
        System.out.println("시작일: "+ endDateTime.format(dtf));


        long remainDay= startDateTime.until(endDateTime, ChronoUnit.DAYS);



        System.out.print("올해 12월 31일 까지 "+remainDay+"일 남았습니다.");

    }
}

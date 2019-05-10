package org.springframework.samples.petclinic.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class GetEventPointsActivity {

    public GetEventPointsActivity() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //LocalDateTime localDateTime1 = LocalDateTime.of(2019, Month.APRIL.getValue(), 10, 10, 10, 10, 000000000);
        //LocalDate ld1 = localDateTime1.toLocalDate();
        LocalDate now = LocalDate.now(ZoneId.systemDefault());
        LocalDate sixDaysBehind = now.minusDays(6);

        //LocalDateTime localDateTime2 = LocalDateTime.of(2019, Month.MAY.getValue(), 10, 10, 10, 10, 000000000);
        //LocalDate id2 = localDateTime2.toLocalDate();



        Period period = Period.between(now, sixDaysBehind);

        System.out.println("   ddd " + period.getDays());
    }

}

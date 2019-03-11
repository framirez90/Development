package APIFechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class APIFechasPrincipal {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        date1 = date1.plusYears(2).plusMonths(2);
        System.out.println(date1);

        LocalDate date2 = LocalDate.of(1990, Month.APRIL, 10);
        System.out.println(date2);

        LocalDate dateCumple = LocalDate.of(2019, Month.MAY, 18);
        LocalDate dateNow = LocalDate.now();

        Period period = Period.between(dateNow, dateCumple);
        System.out.println(period);
        System.out.println("Faltan " + period.getMonths() + " meses y " + period.getDays() + " dias");

        long faltanDias = dateNow.until(dateCumple, ChronoUnit.DAYS);
        System.out.println("faltanDias: " + faltanDias);

        //Duration
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        localTime = localTime.plusHours(2).plusMinutes(10);
        System.out.println(localTime);

        LocalTime horaActual = LocalTime.of(15, 4);
        LocalTime horaSalida = LocalTime.now();
        Duration duration = Duration.between(horaActual, horaSalida);
        System.out.println(duration);
        Duration duration2 = Duration.ofNanos(10);
        System.out.println(duration2);

        //Cambiando Formatos.
        DateTimeFormatter BASIC_ISO_DATE = DateTimeFormatter.BASIC_ISO_DATE;
        LocalDate date = LocalDate.now();

        System.out.println(date.format(BASIC_ISO_DATE));
        DateTimeFormatter formatoBonito = DateTimeFormatter
                .ofPattern("EEEE, dd, MMMM, yyyy", Locale.GERMANY);

        LocalDate fecha2 = LocalDate.now();
        System.out.println(fecha2.format(formatoBonito));
    }
}

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Formatando Datas
 * ->DateTimeFormatter
 */
public class Program2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2022-07-20");
		LocalDateTime dateTime = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant instant = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("date = " + date.format(fmt1));
		System.out.println("date = " + fmt1.format(date));
		System.out.println("date = " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("dateTime = " + dateTime.format(fmt1));
		System.out.println("dateTime = " + dateTime.format(fmt2));
		System.out.println("dateTime = " + dateTime.format(fmt4));

		System.out.println("instant = " + fmt3.format(instant));
		System.out.println("instant = " + fmt5.format(instant));
		System.out.println("instant = " + instant.toString());

    }
}

// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Date{

    LocalDate getLocalDate(){
        return LocalDate.now();
    }

    LocalDateTime getLocalDateTime(){
        return LocalDateTime.now();
    }

    String getDateTimeFormatter(){
        DateTimeFormatter dTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String dateTimeFormatter = getLocalDate().format(dTimeFormatter);
        return dateTimeFormatter;
    }

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("LocalDate: " + date.getLocalDate());
        System.out.println("LocalDateTime: " + date.getLocalDateTime());
        System.out.println("DateTimeFormatter: " + date.getDateTimeFormatter());
        
    }
}
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private String name;
    private LocalDateTime dateTime;
    private int numberOfPeople;

    public Reservation(String name, LocalDateTime dateTime, int numberOfPeople) {
        this.name = name;
        this.dateTime = dateTime;
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String toString(DateTimeFormatter formatter) {
        return "Name: " + name + ", Date and Time: " + dateTime.format(formatter) + ", People: " + numberOfPeople;
    }
}

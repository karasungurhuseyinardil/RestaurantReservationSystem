import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList<Reservation> reservations;

    public ReservationSystem() {
        reservations = new ArrayList<>();
    }

    public void addReservation(String name, LocalDateTime dateTime, int numberOfPeople) {
        Reservation newReservation = new Reservation(name, dateTime, numberOfPeople);
        reservations.add(newReservation);
        System.out.println("Reservation successfully made!");
    }

    public void listReservations(DateTimeFormatter formatter) {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation.toString(formatter));
            }
        }
    }

    public boolean checkAvailability(LocalDateTime dateTime) {
        for (Reservation reservation : reservations) {
            if (reservation.getDateTime().equals(dateTime)) {
                return false;
            }
        }
        return true;
    }
}

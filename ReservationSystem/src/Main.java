import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        while (true) {
            System.out.println("1. Make a Reservation");
            System.out.println("2. List Reservations");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();

                    LocalDateTime dateTime = null;
                    boolean validDateTime = false;
                    while (!validDateTime) {
                        System.out.print("Enter reservation date and time (yyyy-MM-dd HH:mm): ");
                        String dateTimeString = scanner.nextLine();

                        try {
                            dateTime = LocalDateTime.parse(dateTimeString, inputFormatter);
                            validDateTime = true;
                        } catch (java.time.format.DateTimeParseException e) {
                            System.out.println("Error: Invalid date and time format! Please enter in the correct format (yyyy-MM-dd HH:mm).");
                        }
                    }

                    System.out.print("Enter number of people: ");
                    int numberOfPeople = scanner.nextInt();
                    scanner.nextLine();

                    if (system.checkAvailability(dateTime)) {
                        system.addReservation(name, dateTime, numberOfPeople);
                    } else {
                        System.out.println("Reservation is already taken for this date and time!");
                    }
                    break;
                case 2:
                    system.listReservations(outputFormatter);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}


# Java Reservation System

This is a simple Java console-based reservation system that allows users to:
- Make a reservation
- List all reservations
- Check if a reservation slot is available

## 📦 Project Structure

```
ReservationSystem.java   // Core reservation management logic
Reservation.java         // Model class representing a reservation
Main.java                // Console-based user interface
```

## 🛠 Features

- Input validation for date and time
- Avoids double-booking by checking existing reservations
- Formats date and time for user-friendly output
- Simple menu-based interface

## ▶️ How to Run

1. **Compile the project:**

```bash
javac Main.java ReservationSystem.java Reservation.java
```

2. **Run the application:**

```bash
java Main
```

## 📅 Date Format

Please enter the reservation date and time in the following format when prompted:

```
yyyy-MM-dd HH:mm
```

✅ Example: `2025-05-01 19:30`

## 💡 Sample Usage

```
1. Make a Reservation
2. List Reservations
3. Exit
Enter your choice: 1
Enter your name: Ardil
Enter reservation date and time (yyyy-MM-dd HH:mm): 2025-05-01 19:30
Enter number of people: 4
Reservation successfully made!
```

## 📚 Dependencies

- Java 8 or higher (uses `java.time.LocalDateTime` and `DateTimeFormatter`)



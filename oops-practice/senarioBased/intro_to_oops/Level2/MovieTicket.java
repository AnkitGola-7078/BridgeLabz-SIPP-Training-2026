public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Constructor
    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book ticket
    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Create ticket object with dummy values
        MovieTicket ticket1 = new MovieTicket("", 0, 0.0);

        // Book the ticket
        ticket1.bookTicket("Avengers: Endgame", 12, 250.0);

        // Display ticket details
        ticket1.displayDetails();
    }
}

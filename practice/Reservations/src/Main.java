public class Main {
    public static void main(String[] args) {
        Reservations reservations = new Reservations();

        for (int i = 0; i < 5; i++) {
            System.out.println(reservations.printReservation());
        }

    }
}


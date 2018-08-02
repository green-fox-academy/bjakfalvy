public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int codingHours = 6;
        int semester = 17;

        System.out.println("An attendee is coding "  + codingHours * semester + " hours/semester.");

        System.out.println("Percentage of the coding hours is " + (52. / (codingHours * semester))*100+ " %");
    }
}
